var input = require("fs").readFileSync("stdin", "utf8");
var lines = input.split(" ");
var a = parseFloat(lines.shift());
var b = parseFloat(lines.shift());
var c = parseFloat(lines.shift());
var pi = 3.14159
tri = (a*c)/2;
cir = pi*(c*c);
tra = c*(a+b)/2;
qua = b*b;
ret = a*b;
console.log(`TRIANGULO: ${tri.toFixed(3)}`);
console.log(`CIRCULO: ${cir.toFixed(3)}`);
console.log(`TRAPEZIO: ${tra.toFixed(3)}`);
console.log(`QUADRADO: ${qua.toFixed(3)}`);
console.log(`RETANGULO: ${ret.toFixed(3)}`);