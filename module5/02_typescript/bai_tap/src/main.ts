// let number: number = 0;

let a = function fibonacci_check(result: number):number {
    if (result == 1) {
        return 1;
    }
    if (result == 2) {
        return 3;
    }
    if (result >= 3) {
        return fibonacci_check(result - 1) + fibonacci_check(result - 2);

    }
}
console.log(a(5));
