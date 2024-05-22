let obj = { result: 0 };

obj.add = function (x, y) {
  function inner() {
    this.result = x + y;
  }
  inner();
};

obj.add(3, 4);
console.log(obj);
console.log(global.result); //글로벌은 생략가능해서 답이 나왔던 거임
