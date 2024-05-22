const fruits = ['귤', '오렌지', '바나나'];

console.log(fruits);
console.log(...fruits);

function conLog(a, b, c) {
  console.log(a, b, c);
}

conLog(fruits[0], fruits[1], fruits[2]);
conLog(...fruits);
