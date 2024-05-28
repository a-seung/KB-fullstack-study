<!-- props를 객체로 내리는 방법 -->
<!-- 객체로 만들어줬기 때문에 "객체.키명"으로 접근해줘야함 -->
<template>
  <div>
    <h1>{{ siteInfo.siteName }}</h1>
    <a :href="siteInfo.siteUrl">{{ siteInfo.siteName }} 링크</a>
    <h2>방문 여부 : {{ siteInfo.visited }}</h2>
    <hr />
  </div>
</template>

<script>
export default {
  name: 'PropsList2',
  props: ['siteInfo'],
};
</script>

<style lang="scss" scoped></style>
