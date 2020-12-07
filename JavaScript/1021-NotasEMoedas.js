var input = require('fs').readFileSync('stdin', 'utf8');
var line = input.split('\n');
var v = parseFloat(line.shift());

var c100 = v/100;
var c50 = (v%100)/50;
var c20 = ((v%100)%50)/20;
var c10 = (((v%100)%50)%20)/10;
var c5 = ((((v%100)%50)%20)%10)/5;
var c2 = (((((v%100)%50)%20)%10)%5)/2;

var m100 = ((((((v%100)%50)%20)%10)%5)%2)/1;
var m50 = (((((((v%100)%50)%20)%10)%5)%2)%1)/0.50;
var m25 = ((((((((v%100)%50)%20)%10)%5)%2)%1)%0.50)/0.25;
var m10 = (((((((((v%100)%50)%20)%10)%5)%2)%1)%0.50)%0.25)/0.10;
var m5 = ((((((((((v%100)%50)%20)%10)%5)%2)%1)%0.50)%0.25)%0.10)/0.05;
var m1 = (((((((((((v%100)%50)%20)%10)%5)%2)%1)%0.50)%0.25)%0.10)%0.05)/0.01;

console.log("NOTAS:");
console.log(`${Math.floor(c100.toFixed(1))} nota(s) de R$ 100.00`);
console.log(`${Math.floor(c50.toFixed(1))} nota(s) de R$ 50.00`);
console.log(`${Math.floor(c20.toFixed(1))} nota(s) de R$ 20.00`);
console.log(`${Math.floor(c10.toFixed(1))} nota(s) de R$ 10.00`);
console.log(`${Math.floor(c5.toFixed(1))} nota(s) de R$ 5.00`);
console.log(`${Math.floor(c2.toFixed(1))} nota(s) de R$ 2.00`);

console.log("MOEDAS:");
console.log(`${Math.floor(m100.toFixed(1))} moeda(s) de R$ 1.00`);
console.log(`${Math.floor(m50.toFixed(1))} moeda(s) de R$ 0.50`);
console.log(`${Math.floor(m25.toFixed(1))} moeda(s) de R$ 0.25`);
console.log(`${Math.floor(m10.toFixed(1))} moeda(s) de R$ 0.10`);
console.log(`${Math.floor(m5.toFixed(1))} moeda(s) de R$ 0.05`);
console.log(`${Math.floor(m1.toFixed(1))} moeda(s) de R$ 0.01`);