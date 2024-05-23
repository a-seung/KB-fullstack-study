const obj1 = { name: '박문수', age: 29 };
// const obj2 = { name: obj1.name, age: obj1.age, email: 'mspark@gmail.com' };
const obj2 = { ...obj1, email: 'mspark@gmail.com' };
console.log(obj2);

//전에 것은 그대로 두면서 수정하고 싶거나 추가하고 싶은 것만 할 수 있음

const tetzObj = {
  name: '이효석',
  isOld: true,
  address: '서울 서대문구 어딘가',
};

const copyObj = {
  ...tetzObj,
  address: 'tadsf',
};

console.log(tetzObj);
console.log(copyObj);
console.log(tetzObj === copyObj);

//주소값복사  = 얕은복사, 값 복사 = 깊은 복사
