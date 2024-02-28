import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  // TODO: 1st 드롭다운 url
  {
    path: '/binding',
    component: () => import('../views/exam01/BindingView.vue')
  },
  // TODO: 2nd 드롭다운 url
  {
    path: '/binding-exam',
    component: () => import('../views/exam01/BindingExam.vue')
  },
  {
    path: '/condition',
    component: () => import('../views/exam02/ConditionView.vue')
  },
  {
    path: '/condition-exam',
    component: () => import('../views/exam02/ConditionExam.vue')
  },
  {
    path: '/list',
    component: () => import('../views/exam03/ListView.vue')
  },
  {
    path: '/list-exam',
    component: () => import('../views/exam03/ListExam.vue')
  },
  {
    path: '/event',
    component: () => import('../views/exam04/EventView.vue')
  },
  {
    path: '/event-exam',
    component: () => import('../views/exam04/EventExam.vue')
  },
  {
    path: '/class',
    component: () => import('../views/exam05/ClassView.vue')
  },
  {
    path: '/computed',
    component: () => import('../views/exam06/ComputedView.vue')
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
