var input = require("fs").readFileSync('stdin', 'utf8');
var lines = input.split('\n');
var t = parseInt(lines.shift());
var c = 0;
var n = [];
for(var i = 0; i < 1000; i++){
    if(c<t){
        console.log(`N[${i}] = ${c}`);
        c++;
    } else {
        c = 0;
        console.log(`N[${i}] = ${c}`);
        c++;
    }
}