var input = require("fs").readFileSync("stdin", "utf8");
var valores = input.split("\n");
var nome = valores.shift();
var sal = parseFloat(valores.shift());
var com = parseFloat(valores.shift());
var total = ((com*0.15)+sal);
console.log(`TOTAL = R$ ${total.toFixed(2)}`);