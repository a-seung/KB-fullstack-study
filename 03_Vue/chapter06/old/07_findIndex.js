const aClassArr = [
  { id: 1, name: '김연지' },
  { id: 2, name: '최호진' },
  { id: 3, name: '김이수' },
  { id: 4, name: '정지희' },
  { id: 5, name: '최현수' },
  { id: 6, name: '문준일' },
  { id: 7, name: '이예지' },
  { id: 8, name: '김서연' },
  { id: 9, name: '공연정' },
  { id: 10, name: '나건우' },
  { id: 11, name: '박소해' },
  { id: 12, name: '이승아' },
  { id: 13, name: '최규찬' },
  { id: 14, name: '임준수' },
  { id: 15, name: '최민준' },
  { id: 16, name: '권오현' },
  { id: 17, name: '박혜원' },
  { id: 18, name: '김연비' },
  { id: 19, name: '김시완' },
  { id: 20, name: '이태웅' },
  { id: 21, name: '김동준' },
];

// let result = -1;

// for (let i = 0; i < aClassArr.length; i++) {
//   if (aClassArr[i].name === '이승아') {
//     result = i;
//   }
// }

// console.log(result);

function findIndex(arr, name) {
  let result = -1;

  for (let i = 0; i < aClassArr.length; i++) {
    if (aClassArr[i].name === name) {
      result = i;
    }
  }

  return result;
}

const findedIndex = findIndex(aClassArr, '김시완');
console.log(findedIndex);
