function displayA() {
  console.log('A');
}

function displayB() {
  setTimeout(() => console.log('B'), 2000);
}

// function displayB() {
//   setTimeout(function() {
//     console.log('B');
//   }, 2000);
// }
//function 지운다 > 소괄호 뒤에 화살표 써준다

function displayC() {
  console.log('C');
}

displayA();
displayB();
displayC();
