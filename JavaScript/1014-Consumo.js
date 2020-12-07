var input = require("fs").readFileSync("stdin", "utf8");
var lines = input.split("\n");
var x = parseInt(lines.shift());
var y = parseFloat(lines.shift());
res = x/y;
console.log(`${res.toFixed(3)} km/l`);