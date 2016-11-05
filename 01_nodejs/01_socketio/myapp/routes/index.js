var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'Express' });
});

http.listen(3001,function(){
  console.log('listen on 3001');
});



module.exports = router;
