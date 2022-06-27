const readline = require("readline").createInterface({
    input: process.stdin,
    output: process.stdout
});

readline.question("Input hour height (cm): ", inputHeight => {
    console.log("Your height is " + inputHeight + " cm");
    readline.close();
});
