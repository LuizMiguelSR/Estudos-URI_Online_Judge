var input = require("fs").readFileSync('stdin', 'utf8');
var lines = input.split('\n');
var n = parseInt(lines.shift());
var fib = []; 
fib[0] = 0;
fib[1] = 1;
for(var j = 2; j <= 60; j++){
    fib[j] = fib[j-2] + fib[j-1];
}
for(var i = 0; i < n; i++){
    var f = parseInt(lines.shift());
    console.log(`Fib(${f}) = ${fib[f]}`);
}