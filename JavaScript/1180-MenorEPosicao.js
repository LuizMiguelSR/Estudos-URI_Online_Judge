var input = require("fs").readFileSync("stdin", "utf8");
var lines = input.split("\n");
var n = parseInt(lines.shift());
var v = lines.shift().split(' ');
var x = [n];
for(var i = 0; i < n; i++){
    x[i] =  parseInt(v.shift());
}
var men = x[0];
for(var i = 0; i < n; i++){
    if(men > x[i]){
        men = x[i];
        var p = i;
    }
}
console.log(`Menor valor: ${men}\nPosicao: ${p}`);