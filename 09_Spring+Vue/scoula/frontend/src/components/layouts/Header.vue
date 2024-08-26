<script setup>
import config from '@/config';
</script>
<template>
    <div class="jumbotron p-5 bg-primary text-black">
        <h1>{{ config.title }}</h1>
        <p>{{ config.subtitle }}</p>
    </div>
</template>
<style scoped>
/* scoped => 이 스타일은 이번 컴포넌트에서만 적용되는 것을 의미 */
.jumbotron {
    background-image: url('@/assets/images/background.jpg');
    background-repeat: no-repeat;
    background-position: center;
    background-size: cover;
    color: white;
    padding: 2rem;
    /* root 크기의 2배로 하겠다는 의미 */
}
</style>