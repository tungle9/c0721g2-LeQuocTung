var money = 10000;
var buyACar = function (car) {
    return new Promise((function (resolve, reject) {
        setTimeout(function () {
            if (money >= 10000) {
                resolve("can buy " + car);
            }
            else {
                reject("Do not enough money");
            }
        }, 100);
    }));
};
money = 1000001;
var promise = buyACar("Vinfast").then(function (value) {
    console.log(value);
}, function (error) {
    console.log(error);
});
//
var pointGame = function (game) {
    return new Promise((function (resolve, reject) {
        if (game > 50) {
            resolve("chơi game bro" + game);
        }
        else {
            reject("chơi game gà" + game);
        }
    }));
};
var point = 49;
pointGame(point).then(function (value) {
    console.log(value);
}, function (error) {
    console.log(error);
});
