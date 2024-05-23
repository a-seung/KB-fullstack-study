const promise = new Promise((res, rej) => {
  res('first!');
});
//rej가 없는 함수

promise
  .then((msg) => {
    console.log(msg);
    return 'second';
  })
  .then((msg) => {
    console.log(msg);
    return 'third';
  })
  .then((msg) => {
    console.log(msg);
  })
  .catch((error) => {
    console.log('오류 발생 ==> ' + error);
  });
