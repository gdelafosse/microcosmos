var express = require('express');
var app = express();
var fs = require("fs");

app.get('/:name', function (req, res) {
	res.send('Welcome, ' + req.params.name + '!');
})

var server = app.listen(8080, function () {

  var host = server.address().address
  var port = server.address().port

  console.log("Example app listening at http://%s:%s", host, port)

})
