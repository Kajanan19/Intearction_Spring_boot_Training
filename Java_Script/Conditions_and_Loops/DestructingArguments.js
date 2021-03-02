const o={
    w1: "Kajanan",
    w2: "Learn",
    w3: "well"
};

//create function
function getData({w1,w2,w3}){
    return `${w1}${w2}${w3}`;
}

console.log(getData(o));

//Array
const arr=["Kajanan", "Learn", "Well"];

function getDataArray([w1,w2,w3]){
    return `${w1}${w2}${w3}`;
}

console.log(getDataArray(arr));

//call Method
function magic(){
    return `Welcome: ${this.name}`;
}

const obj1={name: "kajanan"};
const obj2={name: "Dhoni"};

console.log(magic());

console.log(magic.call(obj1));
console.log(magic.call(obj2));