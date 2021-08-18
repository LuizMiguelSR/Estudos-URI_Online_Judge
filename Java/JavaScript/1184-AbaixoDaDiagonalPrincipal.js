var input = require("fs").readFileSync("stdin", "utf8");
var lines = input.split("\n");
var c = 0;
let o = lines.shift().toUpperCase();
var som = 0.0;
var med = 0.0;
var mat = [[]];
for(var i = 0; i < 12; i++){
    for(var j = 0; j < 12; j++){
        mat[i[j]] = parseFloat(lines.shift());
        if(i > j){
            som += mat[i[j]];
            c++;
        }
    }
}
if(o.charAt(0) === 'S'){
    console.log(`${som.toFixed(Math.floor(1))}`);
} else {
    med = som/c;
    console.log(`${med.toFixed(Math.floor(1))}`);
}