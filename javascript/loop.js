// function to print array in javascript
function printArray(array, length) {
    for (let n = 0; n < length; i++) {
     console.log("", array[n]);
    }
    console.log("\n");
}

// creating variable using var is not safety
// var array size, threshold = 100;
// trying uses another variables type likely let or const

const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
})

let size;
let array = [];

console.log("Example of Array in javascript \n");

readline.question("Enter length of size : ", (value) => {
    size = value;
    console.log("Your array size is ", value);
    
    for (let i = 0; i < size; i++) {
        readline.question("Input of index ",(input) => {
            array.push(input);
            readline.close();
        })
    }
})