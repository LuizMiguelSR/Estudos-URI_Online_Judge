var input = require("fs").readFileSync('stdin', 'utf8');
var lines = input.split('\n');
var p = 0, im = 0, par = [], impar = [], x;
for(var i = 0; i < 15; i++){
    x = parseInt(lines.shift());
    if(x%2===0){
        par[p] = x;
        p++;
        if(p==5){
            for(var j = 0; j <= 4; j++){
                console.log(`par[${j}] = ${par[j]}`);
            }
            p = 0;
        }
    } else {
        impar[im] = x;
        im++;
        if(im==5){
            for(var k = 0; k <= 4; k++){
                console.log(`impar[${k}] = ${impar[k]}`);
            }
            im = 0;
        }
    }
    if(i == 14){
        for(var k = 0; k < im; k++){
            console.log(`impar[${k}] = ${impar[k]}`);
        }
        for(var j = 0; j < p; j++){
            console.log(`par[${j}] = ${par[j]}`);
        }
    }
}