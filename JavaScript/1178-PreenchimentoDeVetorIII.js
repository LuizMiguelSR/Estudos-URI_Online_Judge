var input = require("fs").readFileSync('stdin', 'utf8');
var lines = input.split('\n');
var x = parseFloat(lines.shift());
var n = [];
n[0] = x;
for(var i = 1; i <= 99; i++){
    n[i] = n[i-1] / 2.0000;
}
for(var i = 0; i <= 99; i++){
    console.log(`N[${i}] = ${n[i].toFixed(Math.floor(4))}`);
}