var a = function fibonacci_check(result) {
    if (result == 1) {
        return 1;
    }
    if (result == 2) {
        return 3;
    }
    if (result >= 3) {
        return fibonacci_check(result - 1) + fibonacci_check(result - 2);
    }
};
console.log("số fibonacci" + a(5));
