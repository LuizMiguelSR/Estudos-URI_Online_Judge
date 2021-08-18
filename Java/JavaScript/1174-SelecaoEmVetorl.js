var input = require("fs").readFileSync('stdin', 'utf8');
var lines = input.split('\n');
var a = {};
for(var i = 0; i < 100; i++){
    var x = parseFloat(lines.shift());
    a[i] = x;
    if(a[i] <= 10){
        console.log("A["+i+"] = "+a[i].toFixed(1));
    }
}