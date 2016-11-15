function doSomething(callback){
  callback('Stuff ','goes ','here.');
}

function foo(a,b,c){
  console.log(a + b + c);
}


doSomething(foo);



