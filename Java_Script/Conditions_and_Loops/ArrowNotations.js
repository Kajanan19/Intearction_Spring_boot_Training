//without Arrow Notation
const f= function(){
    return "Hey Everyone";
}

//using Arrow Notation
const f1 = () => "Hey Arrow";

//Using Argument
const f2=function(arg){
    return `value of Argument: ${arg}`;
}

//using Arrow Notation
const f3= arg1 => `value of Argument: ${arg1}`;

//Using two arguments
const f4= function(arg2, arg3){
    return `${arg2,arg3}`;
}

//using Arrow Notation
const f5= (arg2,arg3) => `${arg2,arg3}`;


//this key word refers to the current object
const obj={
    name: "kajanan",
    magic(){
        return `Hello ${this.name}`;
    }
};

console.log(obj.magic());

const m1= obj.magic;
console.log(m1===obj.magic);
console.log(m1());