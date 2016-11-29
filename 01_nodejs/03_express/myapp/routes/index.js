//**************************************************:*
//  ルーティングの中で処理を分けるサンプル
//**************************************************:*
var express = require('express');
var router = express.Router();

var cnt = 0;

router.get('/', function(req, res, next) {
  cnt += 1;
  console.log(cnt);
  next();
});


router.get('/', function(req, res, next) {
  cnt += 1;
  console.log(cnt);
  next();
});

router.get('/', function(req, res, next) {
  cnt += 1;
  console.log(cnt);
  next();
});

router.get('/', function(req, res, next) {
  cnt += 1;
  console.log(cnt);
  next();
});


/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'Express' });
});

module.exports = router;
