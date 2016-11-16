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


//**********************************************
// callback ネスト 
//**********************************************
var log = '';
function step1(callback ,log){
  var callback2;
  log += 'step1 ';
  callback(callback2,log);
}
function step2(callback , log){
  var callback2;
  log += 'step2 ';
  callback(callback2,log);
}
function step3(log){
  log += 'step3 ';
  console.log(log);
}


console.log('callback ネスト');
//step1(step2(step3(log)) , log),log);
step2(step3(log),log);

※ step1(step2(step3)) の形で呼び出せないのはなぜか？
※ step1(function(){step2(function( ... との違いは何か？  
※ step1(step2(step3))の形で動くものを作ってみる。
 1. 戻り値がfunctionのもの
 2. step4の定義,step3でstep4を直書きしたものの定義
 3. ネットのサンプル
