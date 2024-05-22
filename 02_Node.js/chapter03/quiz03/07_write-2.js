fs = require('fs');

const data = fs.readFileSync('02_Node.js/chapter03/quiz03/04_example.txt', 'utf-8');

if (fs.existsSync('text-1.txt')) {
  console.log('file already exist');
} else {
  fs.writeFileSync('02_Node.js/chapter03/quiz03/04_text-1.txt', data);
}
