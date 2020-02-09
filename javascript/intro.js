const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
})

console.log("Example using variable in javascript \n");

readline.question("Enter length of side : ", (s) => {
    console.log(`the formula a = ${s} * ${s}`)
    var a = s * s;
    console.log("Area of Square = %d", a);
    readline.close()
})