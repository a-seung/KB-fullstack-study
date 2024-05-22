function foodReport(name, age, ...foods) {
  //나머지 연산자 ...args
  console.log(`${name}, ${age}`);
  console.log(foods);
}
foodReport('이몽룡', 20, '짜장면', '냉면', '불고기');
foodReport('홍길동', 16, '초밥');
