import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

import Home from '@/layout/Home.vue'

let router = new Router({
    mode: 'history',
    base: process.env.VUE_APP_URL,
    routes: [
      { path: '/', name: 'home', component: Home },
      { path: '/hello', name: 'hello', component: () => import('@/components/HelloWorld.vue') },  // using lazy-loaded
    ]
})
  

export default router;

