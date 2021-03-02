 //concat()
 const arr=[1,2,3];
 console.log(arr);
 console.log(arr.concat(4,5,6));


const arr2=[1,2,3,4,5];
console.log(arr2.slice(2));
console.log(arr2.slice(1,3));//(startindex,endIndex)
console.log(arr2.slice(-1));

const arr3=[1,4,5];
arr3.splice(1,0,2,3); //(startIndex,number of elements to remove, adding elements)
console.log(arr3);

arr3.splice(2,2);//(start index,number elements to remove from start index)
console.log(arr3);