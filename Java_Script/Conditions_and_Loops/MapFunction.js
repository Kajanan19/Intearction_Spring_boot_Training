const arr1=[1,2,4,8];
const map1=arr1.map(x=>x*2);

console.log(arr1);
console.log(map1);

//Object Example
const cart=[{product: "Mobile",price: 50000},{product: "Laptop",price: 1000000}];

const mapProduct=cart.map(x => x.product);
const mapPrice=cart.map(x => x.price);

console.log(mapProduct);
console.log(mapPrice);