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



