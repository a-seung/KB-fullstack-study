fs = require('fs');

fs.readFile('02_Node.js/chapter03/quiz03/04_example.txt', 'utf-8', (err, data) => {
  if (err) {
    console.error(err);
  }
  console.log(data);
});
