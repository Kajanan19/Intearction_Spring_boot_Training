//Global
let name="Daily";
let subs=40000;

const user={
    name: "Daily",
    subs: 40000
};

function show(){
    console.log(`${name} You have ${subs}`);
}

function make(){
    console.log(`Thank you so much ${subs} subscribers`);
}

function showObj(){
    console.log(`${user.name} You have ${user.subs}`);
}

function makeObj(){
    console.log(`Thank you so much ${user.subs} subscribers`);
}
show();
make();

showObj();
makeObj();

//Block Scope
console.log("Block starts");

{
    console.log("Inside Block");
    const x=5;
    console.log(x);
}

console.log("Block ends");

console.log(`out side of the block: ${x}`);