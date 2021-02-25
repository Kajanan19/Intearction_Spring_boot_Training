const obj={a1:1,b1:2,c1:3,e1:5};
        const{a1,b1,c1,e1}=obj;

        console.log(a1);

        let arrayD=[1,2,3,4,5];

        let[f,n,o,...rest]=arrayD;//Destructing assignment operators
        console.log(f);
        console.log(n);
        console.log(o);
        console.log(rest);