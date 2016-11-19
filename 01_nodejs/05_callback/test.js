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

console.log('\nsample01 callbackサンプル');
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

console.log('\nsample02  引数も渡す');
doSomething2(foo2,'test_arg_desu');


//**********************************************
// callbackサンプル (objectを渡しfieldを更新して返却)
//**********************************************
var Cls           = function(args){this.p01 = args;      }
Cls.prototype.m01 = function(args){this.p01 = args;      }
Cls.prototype.m02 = function(    ){console.log(this.p01);}

var fnc = function(work) {
  //workの型は判定せずm01がなかったらエラーとなる
  work.m01('test B'); 
  return work;
}

console.log('\nsample03  objectを渡しfieldを更新して返却');
objA = new Cls('test A');
objA.m02();

fnc(objA);  //field p01 を更新
objA.m02(); //更新された値が表示される





