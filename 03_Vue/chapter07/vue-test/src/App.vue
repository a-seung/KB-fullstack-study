<script setup>
import ColorEmit from './components/ColorEmit.vue';
</script>

<template>
  <div class="header">
    <div class="title">
      <h1 class="h1">조 이름 :</h1>
    </div>
    <div :style="{ backgroundColor: color }" class="body">
      <div class="container">
        <div class="name">최호진~</div>

        <div>
          <img
            style="width: 300px; height: 300px"
            src="./gun.jpg"
            alt="고양이"
          />
        </div>
        <img src="">sdfsd</img>
        <div></div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'App',
  data() {
    return {
      color: '',
    };
  },
  methods: {
    colorChangeHandler(payload) {
      this.color = payload.color;
    },
  },
};
</script>
<style scoped>
* {
  background: #dbb5b5;
}
.header {
  display: flex;
  flex-direction: column;
  /* gap: 1px; */
  width: 100vw;
  height: 100vh;
  background-color: FF9EAA;
}
.title {
  display: flex;
  justify-content: center;
  align-items: center;
  font-size: 40px;
  height: 200px;
  margin-top: 40px;
}
.h1 {
  font-family: 'TTHakgyoansimMonggeulmonggeulR';
  src: url('https://fastly.jsdelivr.net/gh/projectnoonnu/noonfonts_2402_keris@1.0/TTHakgyoansimMonggeulmonggeulR.woff2') format('woff2');
  font-weight: normal;
  font-style: normal;
}
.body {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100%;
}
.container {
  width: 900px;
  height: 700px;
  border-radius: 40px;
  background-color: #f1e5d1;
}
</style>
