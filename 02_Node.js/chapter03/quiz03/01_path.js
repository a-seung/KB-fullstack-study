const path = require('path');
const { hrtime } = require('process');

// 경로 연결하기 path.join('','','')
const fullpath = path.join('some', 'work', 'ex.txt');
console.log(fullpath);

// 절대 경로
console.log(`파일 절대 경로: ${__filename}`);

// 경로만 추출하기
const dir = path.dirname(__filename);
console.log(`경로만: ${dir}`);
// console.log(`경로만: ${__dirname}`);

//파일 이름 추출하기 .basename()
const fn = path.basename(__filename);
console.log(`파일 이름: ${fn}`);

//지정한 확장자 제외하고 파일명 추출하기 .basename()
const fn2 = path.basename(__filename, '.js');
console.log(`파일 이름(확장자 제외): ${fn2}`);

//확장자명 구하는 함수 .extname()
const ext = path.extname(__filename);
console.log(`파일 확장자: ${ext}`);

// const parsedPath = path.parse(__filename);
// console.log(parsedPath);
