var input = require("fs").readFileSync('stdin', 'utf8');
var line = input.split('\n');
var seg = parseInt(line.shift());

var hor = seg / 3600;
var min = (seg%3600)/60;
var sec = (seg%3600)%60;

console.log(`${Math.floor(hor.toFixed(1))}:${Math.floor(min.toFixed(1))}:${Math.floor(sec.toFixed(1))}`);