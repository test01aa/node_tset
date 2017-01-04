var http = require('http');
var util = require('./util.js');
var app  = http.createServer(function(req,res){
  res.writeHead(200,{'Content-Type': 'text/plain'});
  res.write('Hello world');
  res.end();
}).listen(3000);

util.getIpAddress();
console.log('aaa');




