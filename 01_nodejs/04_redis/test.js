var client = require('redis').createClient();

var key = 'hoge:fuga';
var value = 'piyo';

client.set(key, value ,function(){
  console.log('set desu');  
});

client.get(key, function(err, val){
  if (err) return console.log(err);

  console.log(val);
});




