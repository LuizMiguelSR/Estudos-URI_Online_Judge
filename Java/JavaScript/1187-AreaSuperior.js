var input = require("fs").readFileSync("stdin", "utf8");
var lines = input.split("\n");
let o = lines.shift().toUpperCase();
var som = 0.0;
var mat = [[]];
var q = 1;
var p = 10;
for(var i = 0; i <= 11; i++){
    for(var j = 0; j <= 11; j++){
        mat[i[j]] = parseFloat(lines.shift());
    }
}
for(var i = 0; i <= 4; i++){
    for(var j = q; j <= p; j++){
        som+=mat[i[j]];
    }
    p--;
    q++;
}
if(o.charAt(0) === 'S'){
    console.log(`${som.toFixed(Math.floor(1))}`);
} else {
    som = som/30.0;
    console.log(`${som.toFixed(Math.floor(1))}`);
}