let x=10, 
    str="10";

    console.log(x==str); //true -: x and str has the same value

    //using Strict equality
    console.log(x===str); //false-: x and str are not equal type

    //Converting str to number using Strict equality
    console.log(x=== Number(str)); //true because x and str has the samevalue

    //Using not strict equality
    console.log(x!== Number(str)); //false

    //using abstarct equality
    console.log(x!=str); // false