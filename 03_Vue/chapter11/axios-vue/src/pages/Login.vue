<template>
  <div>
    <h1></h1>
    아이디 <input type="text" v-model.trim="userId" />
    <br />
    패스워드 <input type="password" v-model.trim="userPassword" />
    <br />
    <button @click="login">로그인</button>
    &nbsp;
    <button @click="logout">로그아웃</button>
    &nbsp;
  </div>
</template>

<script setup>
import { ref } from 'vue';
import axios from 'axios';
const userId = ref('');
const userPassword = ref('');

async function login() {
  // ------ npx json-server db.json 실행
  try {
    const url = 'http://localhost:3000/users';
    const loginRes = await axios.get(url);
    console.log(loginRes); // userPassword의 객체 자체를 가져옴.

    const userArr = loginRes.data;
    // ref 값이니까 .value 작성
    const findedUser = userArr.find((item, index) => item.id === userId.value);

    if (findedUser === undefined) return alert('존재하지 않는 아이디입니다.');
    localStorage.setItem('auth', 'true'); // 해당 값을 확인하고 있으면 통과
    alert('로그인 성공');
    // return 꼭 필수
    if (findedUser.password !== userPassword.value) return alert('비밀번호가 다릅니다. ');
  } catch (err) {
    alert('로그인 과정에 오류 발생');
    console.log('err : ', err);
  }
}

function logout() {
  localStorage.removeItem('auth');
  return alert('로그아웃 완료!');
}
</script>

<style scoped></style>
