let obj={};
let objCheck={};

obj.Age=27;
console.log(obj.Age);

console.log("\n");

objCheck={
    name: "kajanan",
    Age: 27
};

console.log(objCheck.name);
console.log(objCheck.Age);

console.log("\n");

//Deleting property
delete objCheck.Age

console.log(objCheck.name);
console.log(objCheck.Age);


//Create an Array with different type of data
const arrayOne=[1, 2, 3, 4];
const arrayTwo=[1, 2, null, 4, 'Five'];
const arrayThree=["Hello", "World", "Array"];

//have an array containing array
const arrayFour=[
    [1, 2, 3],
    [4, 5, 6]
];

console.log("\n");
//change array element
arrayThree[0]="Wel Come";
console.log(arrayThree[0]);

console.log("\n");

//Create Date With time  Year, Hours, Min
const date= new Date(2021,02,25,15,0);
console.log(date);

console.log("\n");

//Create Map
const map= new Map();

map.set(t1,"User1");
map.set(t2,"User2");

console.log("\n");

//Create Set
const set=new Set();

set.add("User 3");