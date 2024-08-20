<template>
  <div class="board-container">
    <Todo />
  </div>
</template>

<script setup>
import OnClickBoard from './components/OnClickBoard.vue';
import OnMountedBoard from './components/OnMountedBoard.vue';
import Todo from './components/Todo.vue';
</script>

<style scoped>
.board-container {
  display: flex;
  justify-content: center; /* 두 보드를 양옆에 배치 */
  align-items: flex-start; /* 보드들을 수직 상단 정렬 */
  background-color: #333;
  height: 80vh;
}

.board-container > * {
  flex: 1; /* 각 보드가 동일한 너비를 차지하게 설정 */
  margin: 10px;
  max-width: 700px; /* 각 보드의 최대 너비를 50%로 제한 */
}
</style>
