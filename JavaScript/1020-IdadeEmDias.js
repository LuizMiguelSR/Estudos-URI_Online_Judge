var input = require('fs').readFileSync('stdin', 'utf8');
var line = input.split('\n');
var day = parseInt(line.shift());
var ano = day/365;
var mes = (day%365)/30;
var dia = (day%365)%30;
console.log(`${Math.floor(ano.toFixed(1))} ano(s)`);
console.log(`${Math.floor(mes.toFixed(1))} mes(es)`);
console.log(`${Math.floor(dia.toFixed(1))} dia(s)`);