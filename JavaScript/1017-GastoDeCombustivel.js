var input = require("fs").readFileSync('stdin', 'utf8');
var lines = input.split('\n');
var valor = parseInt(lines.shift());
console.log(`${valor}`);

var c100 = valor/100;
var c50 = (valor%100)/50;
var c20 = ((valor%100)%50)/20;
var c10 = (((valor%100)%50)%20)/10;
var c5 = ((((valor%100)%50)%20)%10)/5;
var c2 = (((((valor%100)%50)%20)%10)%5)/2;
var c1 = ((((((valor%100)%50)%20)%10)%5)%2)/1;

console.log(`${Math.floor(c100.toFixed(1))} nota(s) de R$ 100,00`);
console.log(`${Math.floor(c50.toFixed(1))} nota(s) de R$ 50,00`);
console.log(`${Math.floor(c20.toFixed(1))} nota(s) de R$ 20,00`);
console.log(`${Math.floor(c10.toFixed(1))} nota(s) de R$ 10,00`);
console.log(`${Math.floor(c5.toFixed(1))} nota(s) de R$ 5,00`);
console.log(`${Math.floor(c2.toFixed(1))} nota(s) de R$ 2,00`);
console.log(`${Math.floor(c1.toFixed(1))} nota(s) de R$ 1,00`);