//example to load another file module javascript ES6
//import { thisFunctionAdd } from './function.js';

//const a = 1;
//const b = 2;

//let val = thisFunctionAdd(a, b);

//example to load another file or module using nodejs


const thisModule = require('./function.js');

const a = 1;
const b = 2;

let val = thisModule.thisFunctionAdd(1, 2);

// print the result
console.log(val);
