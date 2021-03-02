const arr=[1,2,3,4,5];

arr.copyWithin(1,2); //start from index 1, copying from index 2

console.log(arr);

arr.copyWithin(1,2,3);//start from index 1, copying from index 2, end copying from index 3

console.log(arr);

arr.copyWithin(1,-1);
console.log(arr);


//Fill Method
const arr2=[1,2,3,4,5];
arr2.fill("d",1,2); //start from index 1. print static array elements.
console.log(arr2);