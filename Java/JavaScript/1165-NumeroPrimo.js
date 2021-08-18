var input = require("fs").readFileSync('stdin', 'utf8');
var lines = input.split('\n');
var n = parseInt(lines.shift());
for(var i = 0; i < n; i++){
    var x = parseInt(lines.shift());
    var c = 0;
    for(var j = 1; j <= x; j++){
        if(x%j===0){
            c++;
        }
    }
    if(c > 2){
        console.log(x+" nao eh primo");
    } else {
        console.log(x+" eh primo");
    }
}