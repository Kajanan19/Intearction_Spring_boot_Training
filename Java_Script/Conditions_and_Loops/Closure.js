//function inside another function

function Counter(){
    let count=0;

    return function(){
        return count++;
    };
}

let counter = Counter();

console.log(counter());
console.log(counter());
console.log(counter());


let closure;
        {
            let block="character";
             closure=function(){
                console.log(block);
            }
        }

       closure();