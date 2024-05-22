const obj = {
  name: '이승아',
  isOld: true,
  condition: 'tired',
};

for (let key in obj) {
  console.log(`key 값은 ${key} 이고,value ${obj[key]}입니다.`);
}
