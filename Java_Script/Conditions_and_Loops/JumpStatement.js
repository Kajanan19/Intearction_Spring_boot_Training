//break statement
for(let i=0;i<5;i++){
    if(i==3) break;
    console.log(i); 
}

console.log("\n");

 //break label statement
let a=1;
    
label:while(a==1){
    console.log(a);
    break label;

}

console.log("\n");

 //telling loop to continue instead execute the print statement
let x=0;
while(x<10){
    x++;
    if(x==5){
        continue;
    }

    console.log(x);
}

console.log("\n");

function add(x){
    return x+x;
}

console.log(add(3));