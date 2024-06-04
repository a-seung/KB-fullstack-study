import { createRouter, createWebHistory } from 'vue-router';
import routes from './routes';
const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes,
});

//router가 실행되기 전에 beforeEach를 먼저 통과하게 한다.

// to : home, login, todo
router.beforeEach((to, from, next) => {
  //item.meta : requireAuth
  if (to.matched.some((item) => item.meta.requiresAuth === true)) {
    // 아닐 때
    if (localStorage.getItem('auth') !== 'true') {
      alert('로그인이 필요합니다. '); //auth 가 없는 상황에서 todo로 가려고 한다면alert 창이 뜸.
      next({ name: 'login' }); // login로 이동
    } else {
      next(); // todo로 이동
    }
  } else {
    next();
  }
});
export default router;
