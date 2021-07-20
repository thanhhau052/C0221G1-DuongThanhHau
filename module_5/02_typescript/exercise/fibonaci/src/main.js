// function checkNumberInFibonacci(number:number):boolean {
//     let num = 0;
//     let check = false;
//     let a = 0;
//     let b = 1;
//     while (num <= number) {
//         if (num == number) {
//             check = true;
//         }
//         num = a;
//         a += b;
//         b = num;
//     }
//     return check
// }
// let n=10;
// let sum=0;
// for (let i =0; i<n;i++  ){
//     if (checkNumberInFibonacci(i)){
//         console.log(i+" ");
//         sum+=i;
//     }
//
// }
// console.log(sum);
// de quy
function isFibonacci(number) {
    if (number <= 1) {
        return 1;
    }
    else {
        return isFibonacci(number - 1) + isFibonacci(number - 2);
    }
}
var sum = 0;
var n = 10;
console.log("Day so fibonacci la : ");
for (var i = 0; i < n; i++) {
    console.log(isFibonacci(i));
    sum += isFibonacci(i);
}
console.log("Tong fibonacci la :" + sum);
