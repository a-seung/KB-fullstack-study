import Home from '@/pages/Home.vue';
import Login from '@/pages/Login.vue';
import Todo from '@/pages/Todo.vue';
const routes = [
  {
    path: '/',
    name: 'home',
    component: Home, // /로 Home로 정해진 페이지의 경우 router-view의 기본 페이지가 된다.
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
  },
  {
    path: '/todo',
    name: 'todo',
    component: Todo,
    meta: { requiresAuth: true },
  },
];

export default routes;
