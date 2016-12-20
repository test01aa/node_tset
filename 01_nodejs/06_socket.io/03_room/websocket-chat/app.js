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
io.sockets.on('connection', function(socket){
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
    io.to(room).emit('server_to_client', {value : data.value});
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
    io.to(id).emit('server_to_client', {value : personalMessage});
  });

  //S09. disconnectイベントを受信し、退出メッセージを送信する
  socket.on('disconnect', function(){
    console.log('S09 disconnect');
    if (name == ''){
      console.log("未入室のまま去ってゆきました");
    } else {
      var endMessage = name + "さんが退出しました";
      console.log(endMessage);
      io.to(room).emit('server_to_client', { value : endMessage});    
    } 
  });

});



