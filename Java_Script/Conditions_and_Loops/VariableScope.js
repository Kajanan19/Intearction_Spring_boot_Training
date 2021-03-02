//function
function f(x){
    return x/2;
}

console.log(f(10));
//console.log(x);

//Lexical Scoping

function f1(){
   console.group("Function One");
}

function f2(){
    console.group("Function Two");
}

f1();
f2();
f1();

const x=5;

function f4(){
    console.log(x);
    console.log(y);
}
//f4();
const y=4;

f4();