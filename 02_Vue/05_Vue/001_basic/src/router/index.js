import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

// TODO: 규칙 정의하는 부분
const routes = [
  // TODO: url -> HomeView.vue 페이지와 연결하는 부분
  {
    path: '/',               // url : www.naver.com/
    name: 'home',
    component: HomeView
  },
  // TODO: url -> AboutView.vue 페이지와 연결하는 부분
  // TODO: 성능이 좋음
  {
    path: '/about',          // url : www.naver.com/about
    name: 'about',
    component: () => import('../views/AboutView.vue')
  },
  {
    path: '/binding',        // url : www.naver.com/binding
    name: 'binding',
    component: () => import('../views/C_BindingView.vue')
  },
  {
    path: '/binding-exam',
    component: () => import('../views/C_BindingExam.vue')
  },
  {
    path: '/attribute',
    component: () => import('../views/D_AttributeView.vue')
  },
  {
    path: '/attribute-exam',
    component: () => import('../views/D_AttributeExam.vue')
  },
  {
    path: '/form',
    component: () => import('../views/E_FormView.vue')
  },
  {
    path: '/form-exam',
    component: () => import('../views/E_FormExam.vue')
  },
  {
    path: '/if',
    component: () => import('../views/F_IfView.vue')
  },
  {
    path: '/if-exam',
    component: () => import('../views/F_IfExam.vue')
  },
  {
    path: '/for',
    component: () => import('../views/G_ForView.vue')
  },
  {
    path: '/for-exam',
    component: () => import('../views/G_ForExam.vue')
  },
  {
    path: '/method',
    component: () => import('../views/H_MethodView.vue')
  },
  {
    path: '/method-exam',
    component: () => import('../views/H_MethodExam.vue')
  },
  {
    path: '/computed',
    component: () => import('../views/I_ComputedView.vue')
  },
  {
    path: '/computed-exam',
    component: () => import('../views/I_ComputedExam.vue')
  },
  {
    path: '/for-object',
    component: () => import('../views/J_ForObjectView.vue')
  },
  {
    path: '/for-object-exam',
    component: () => import('../views/J_ForObjectExam.vue')
  },
  {
    path: '/props',
    component: () => import('../views/K_PropsView.vue')
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
