const fs = require('fs');

fs.readFile('readme1.txt', 'utf-8', (err, data) => {
  if (err) {
    return console.log(err);
  }
  console.log('1번', data);
  fs.readFile('readme2.txt', 'utf-8', (err, data) => {
    if (err) {
      return console.log(err);
    }
    console.log('2번', data);
    fs.readFile('readme3.txt', 'utf-8', (err, data) => {
      if (err) {
        return console.log(err);
      }
      console.log('3번', data);
      fs.readFile('readme4.txt', 'utf-8', (err, data) => {
        if (err) {
          return console.log(err);
        }
        console.log('4번', data);
      });
    });
  });
});
