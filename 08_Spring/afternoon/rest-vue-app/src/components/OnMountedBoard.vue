<template>
  <div class="container">
    <div class="post-board">
      <h1>게시판</h1>
      <div v-if="loading" class="loading">로딩중...</div>
      <div v-else-if="error" class="error">{{ error }}</div>
      <div v-else>
        <ul class="post-list">
          <li v-for="post in posts" :key="post.id" class="post-item">
            <h3 class="post-title">{{ post.title }}</h3>
            <p class="post-content">{{ post.content }}</p>
          </li>
        </ul>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue';
import axios from 'axios';

// 상태 관리 변수들 선언
const posts = ref([]);
const loading = ref(true);
const error = ref(null);
const url = 'http://localhost:8080/post/v1/rest/show';

onMounted(async () => {
  try {
    // API 호출
    const response = await axios.get(url);
    posts.value = response.data;
    console.log('########### OnMountedBoard 의 데이터 ', response.data);
  } catch (err) {
    error.value = 'Failed to load the posts.';
  } finally {
    loading.value = false;
  }
});
</script>

<style scoped>
/* 다크 모드 스타일링 */
.container {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh; /* 화면 전체 높이를 채우도록 설정 */
  background-color: #121212; /* 다크 모드 배경색 */
}

.post-board {
  width: 800px;
  padding: 20px;
  background-color: #1e1e1e; /* 게시판 배경색 */
  border-radius: 8px;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.5); /* 다크 모드 그림자 */
  color: #e0e0e0; /* 텍스트 색상 */
}

h1 {
  font-size: 2em;
  margin-bottom: 1em;
  text-align: center;
  color: #ffffff; /* 게시판 제목 색상 */
}

.loading,
.error {
  text-align: center;
  font-size: 1.2em;
  margin-top: 2em;
  color: #e0e0e0; /* 로딩 및 에러 메시지 색상 */
}

.post-list {
  list-style-type: none;
  padding: 0;
}

.post-item {
  padding: 15px;
  margin-bottom: 15px;
  border-bottom: 1px solid #333; /* 다크 모드에 맞는 테두리 색상 */
  background-color: #2c2c2c; /* 게시글 배경색 */
  border-radius: 5px;
  transition: box-shadow 0.3s ease;
}

.post-item:hover {
  box-shadow: 0 4px 12px rgba(0, 0, 0, 0.3);
}

.post-title {
  font-size: 1.5em;
  margin: 0 0 10px;
  color: #90caf9; /* 다크 모드에서 읽기 좋은 파란색 톤 */
}

.post-content {
  font-size: 1em;
  color: #e0e0e0; /* 게시글 내용 색상 */
}

.post-title,
.post-content {
  margin: 0;
  padding: 0;
}
</style>
