var input =  require("fs").readFileSync("stdin", "utf8");
//var [x, y] = input.split(" ").map(item => parseInt(item));
var valores = input.split("\n");
var a = parseInt(valores.shift());
var b = parseInt(valores.shift());
var c = parseInt(valores.shift());
var d = parseInt(valores.shift());
var dif = ((a*b)-(c*d));

console.log(dif);