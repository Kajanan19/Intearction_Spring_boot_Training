const arr1=[1,2,3,4,5]; //simple Array
console.log(arr1[0]);
console.log(arr1[1]);
console.log(arr1[2]);

const arr2=["one",2,true]; //monhomogenous array literal
console.log(arr2[0]);
console.log(arr2[2]);

const arr3=[[1,2,3],["one",2,true]];//array containing array
console.log(arr3[0][0]);
console.log(arr3[1][2]);

//nonhomogenous array containing array
const arr4=[{name:"kajanan",age:26},
           [{name:"kaj",age:26},{name:"Ganesh",age:26}]];
           console.log(arr4[1][0].name);
           console.log(arr4[1][1].name);

const arr5=[{name:"kajanan",age:26},
           [function(){
               //do here
               return "Function in the Array"
           },"Dhoni"]]; 
           console.log(arr5[1][0]());  

//push method return length after inserting array element
const arr=[2,3,4];
console.log(arr.push(5));
console.log(arr);

//pop method
console.log(arr.pop());
console.log(arr);

//unshift
console.log(arr.unshift(1)); //return length and add element on the beginning
console.log(arr);

//shift
console.log(arr.shift());//return length and remove element from the beginning
console.log(arr);
