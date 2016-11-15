//**********************************************
// callbackサンプル 
//**********************************************
function doSomething(callback){
  //関数を引数として渡すことができる。
  //渡す関数を変更することで振舞いを切替えることができる
  callback('Stuff ','goes ','here.');
}
function foo(a,b,c){
  console.log(a + b + c);
}

doSomething(foo);


//**********************************************
// callbackサンプル (引数も渡す)
//**********************************************
function foo2(a){
  console.log('foo2 arg... ' + a);
}
function doSomething2(callback,callback_arg){
  console.log('doSomething2 call');
  callback(callback_arg);
}

doSomething2(foo2,'test_arg_desu');


