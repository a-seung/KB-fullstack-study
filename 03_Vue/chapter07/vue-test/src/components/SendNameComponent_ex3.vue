<template>
  <div>
    <input type="text" v-model="name" />
    <button @click="$emit('nameChange', { name })">이름 전달!</button>
  </div>
</template>

<script>
export default {
  name: 'SendNameComponent_ex3',
  data() {
    return {
      name: '',
    };
  },
};
</script>

<style lang="scss" scoped></style>
