var input = require("fs").readFileSync("stdin", "utf8");
var line = input.split("\n");
var km = parseInt(line.shift());
time = km * 2;
console.log(`${time} minutos`);