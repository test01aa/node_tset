//****************************************************
//  next()の処理の例
//    実行3秒後： A1 →  B1 →  C1 (ほぼ同時。非同期)
//    実行6秒後： A2 (A1実行後、コールバック)
//****************************************************
var express = require('express');
var router = express.Router();

router.get('/', function(req, res, next) {
  setTimeout(function(){console.log('A1');
                          setTimeout(function(){console.log('A2');},3000);
                       },3000);
  next();
});


router.get('/', function(req, res, next) {
  setTimeout(function(){console.log('B1');},3000);
  next();
});

router.get('/', function(req, res, next) {
  setTimeout(function(){console.log('C1');},3000);
  res.render('index', { title: 'Express' });
});



module.exports = router;
