var input = require("fs").readFileSync("stdin", "utf8");
var linhas = input.split("\n");
var linha1 = linhas.shift().split(" ");
var linha2 = linhas.shift().split(" ");
var cod1 = parseInt(linha1.shift());
var qtde1 = parseInt(linha1.shift());
var valor1 = parseFloat(linha1.shift());
var cod2 = parseInt(linha2.shift());
var qtde2 = parseInt(linha2.shift());
var valor2 = parseFloat(linha2.shift());
var total = ((qtde1*valor1)+(qtde2*valor2));
console.log(`VALOR A PAGAR: R$ ${total.toFixed(2)}`);