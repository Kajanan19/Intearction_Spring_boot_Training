function Magic(){
    console.log("Hello");
    console.log("Function");
}

Magic();

function returnMagic(){
    console.log("Hello Function");
}

//referrencing to the function
console.log(returnMagic); 

//assign
const f=returnMagic; 
console.log(f());

//object
const obj={m:returnMagic}; 
console.log(obj.m());


function demo(a,b){
    return (a+b)/2

}
console.log(demo(5,40));

//default argument
function fu(x="default"){
    return `in function:x=${x}`; 
}
console.log(fu());


//callled functions
const f1=function(){

};

f1(); 

const o={name:"Anonymous function",
         invoke:function (){
             return "You called me...!";  //Anonymous function
         }};

         console.log(o.invoke());