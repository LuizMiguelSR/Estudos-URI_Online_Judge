var input = require("fs").readFileSync("stdin", "utf8");
var valores = input.split("\n");
var num = parseInt(valores.shift());
var hr = parseInt(valores.shift());
var hrt = parseFloat(valores.shift());
var sal = hr * hrt;
console.log("NUMBER = " + num);
console.log("SALARY = U$ " + sal.toFixed(2));