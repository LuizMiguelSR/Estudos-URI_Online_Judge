var input = require("fs").readFileSync('stdin', 'utf8');
var lines = input.split('\n');
var n = [];
for(var i = 0; i < 4; i++){
    var x = parseInt(lines.shift());
    n[i] = x;
}
var y = 0;
var z = 3;
for(var i = 0; i < 2; i++){
    var temp1 = 0;
    var temp2 = 0;
    temp1 = n[y];
    temp2 = n[z];
    n[y] = temp2;
    n[z] = temp1;
    y++;
    z--;
}
for(var i = 0; i < 4; i++){
    console.log("N["+i+"] = "+n[i]);
}