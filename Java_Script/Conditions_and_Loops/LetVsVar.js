for(var i=0;i<3;i++){
    console.log(i);
}
console.log(`i Outside block: ${i}`);//can access outside

for(let k=0;k<3;k++){
    console.log(k);
}
console.log(`k outside block: ${k}`);//can not access outside

"use strict";
         x="Global";
         console.log(x);
         (function(){
             "use strict"
             y="UseStrictMode";
             console.log(y);
         })();
