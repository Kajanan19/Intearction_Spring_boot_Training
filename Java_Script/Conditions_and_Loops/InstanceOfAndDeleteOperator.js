const date=new Date();
const arrayC=[1,2,3,4];
//Instance of operator
console.log(date instanceof Date);
console.log(arrayC instanceof Array);

console.log("\n");
const objB={j:1,k:2,l:3,q:4};
console.log('j' in objB);

console.log("\n");

//Delete Operator
delete objB.j;
console.log('j' in objB);

console.log("\n");

const arrayA=[1,2,3,4,5];
console.log(arrayA[0]);

console.log("\n");

delete arrayA[0];
console.log(arrayA[0]);

console.log("\n");

//Conditional operator
let print="Hey everyone";

if(print){
   console.log(print);
}else{
   print="welcome";
   console.log(print);
}

console.log("\n");

//statement true    false
print=print?print:"welcome"  //Conditional operator
console.log(print);