const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
})

console.log("Example using variable in javascript \n");

readline.question("Enter length of side : ", (s) => {
    var a, s, threshold = 100;
    console.log(`the formula a = ${s} * ${s}`)
    
    a = s * s;

    console.log("\n");
    if (s > (threshold+1)) {
      console.log("size: %i more than threshold: %i", s, threshold);
    } else if ( s == 100) {
      console.log("size: %i equal with threshold: %i", s, threshold);
    } else {
      console.log("size: %i less than threshold: %i", s, threshold);       
    }

    console.log("\n");
    
    console.log("Area of Square = %d", a);
    readline.close()
})