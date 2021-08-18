var input = require("fs").readFileSync('stdin', 'utf8');
var lines = input.split('\n');
var v = parseInt(lines.shift());
var n = [0,0,0,0,0,0,0,0,0,0];
for(var i = 0; i <= 9; i++){
    if(i===0){
        n[i] = v;
        console.log("N["+i+"] = "+n[i]);
    } else {
        n[i] = n[i-1] * 2;
        console.log("N["+i+"] = "+n[i]);
    }
}