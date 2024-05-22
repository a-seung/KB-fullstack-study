const order = (beverage, callback) => {
  console.log(`${beverage} 주문 접수`);
  setTimeout(() => {
    callback(beverage);
  }, 3000);
};
const dispaly = (result) => {
  console.log(`${result} 완료!`);
};

order('아메리카노', dispaly);
