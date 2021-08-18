var input = require("fs").readFileSync("stdin", "utf8");
var line = input.split(" ");
var a = parseInt(line.shift());
var b = parseInt(line.shift());
var c = parseInt(line.shift());
maior=(a+b+Math.abs(a-b))/2;
result=(maior+c+Math.abs(maior-c))/2
console.log(`${result.toFixed(0)} eh o maior`);