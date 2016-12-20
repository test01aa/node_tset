//S01. モジュール読込
var http = require('http');
var socketio = require('socket.io');
var fs = require('fs');

//S02. HTTPサーバ生成
var server = http.createServer(function(req,res){
  res.writeHead(200, {'Content-Type' : 'text/html'});
  res.end(fs.readFileSync(__dirname + '/index.html', 'utf-8'));
}).listen(3000);

//S03. HTTPサーバにsocketをひもづける(webSocket有効化)
var io = socketio.listen(server);

//S04. connectionイベントを受信する
//var chat = io.of('/chat').on('connection', function(socket){
var chat = io.of('/chat');                //この記述方法でも可能
chat.on('connection', function(socket){  //この記述方法でも可能
  var room = '';
  var name = '';

  console.log('S04 connectionイベント受信');

  //roomへの入室は[socket.join(room名)]
  socket.on('client_to_server_join', function(data){
    console.log('room入室');
    room = data.value;
    socket.join(room);
  });

  //S05. client_to_serverイベントデータを受信する
  socket.on('client_to_server', function(data){
    console.log('S05           ' + data.value);
    //S06. server_to_clientイベントデータを送信する
    chat.to(room).emit('server_to_client', {value : data.value});
  });

  //SO7. client_to_server_broadcastイベントデータを送信元以外に送信する
  socket.on('client_to_server_broadcast', function(data){
    console.log('S07 broadcast ' + data.value);
    socket.broadcast.to(room).emit('server_to_client', {value : data.value });
  });

  //S08. client_to_server_personalイベントデータを受信し送信元のみに送信する
  socket.on('client_to_server_personal', function(data){
    console.log('S08 personal  ' + data.value);
    var id = socket.id;
    name = data.value;
    var personalMessage = "あなたは" + name + "さんとして入室しました。";
    chat.to(id).emit('server_to_client', {value : personalMessage});
  });

  //S09. disconnectイベントを受信し、退出メッセージを送信する
  socket.on('disconnect', function(){
    console.log('S09 disconnect');
    if (name == ''){
      console.log("未入室のまま去ってゆきました");
    } else {
      var endMessage = name + "さんが退出しました";
      console.log(endMessage);
      chat.to(room).emit('server_to_client', { value : endMessage});    
    } 
  });

});

// 今日の運勢機能
var fortune = io.of('/fortune').on('connection', function(socket){
  var id = socket.id;
  var fortunes = ["大吉","吉","中吉","小吉","末吉","凶","大凶"];
  var selectedFortune = fortunes[Math.floor(Math.random() * fortunes.length)];
  var todaysFortune = "今日のあなたの運勢は... " + selectedFortune + " です。";
  fortune.to(id).emit('server_to_client', {value : todaysFortune});
});

