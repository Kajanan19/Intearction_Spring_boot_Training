const funtionE=(function(){
    let str="Immediately invoke function expression";
    return str;
  })();

  console.log(funtionE);

  const funtionEe=(function(){
    let count=0;
    return function() {
      return `value of count: ${count++}`;
    }

})();

console.log(funtionEe());
console.log(funtionEe());
console.log(funtionEe());