import Vue from 'vue'
import VueRouter from 'vue-router' // import the vue router
import App from './App.vue'

import Bar from './components/Bar'
import Foo from './components/Foo'

  
  /**
   * When used with a module system, you must explicitly install the router via Vue.use():
   */
  Vue.use(VueRouter)


  // 2. Define some routes
  // Each route should map to a component. The "component" can
  // either be an actual component constructor created via
  // `Vue.extend()`, or just a component options object.
  // We'll talk about nested routes later.
  const routes = [
    { path: '/foo', component: Foo },
    { path: '/bar', component: Bar }
  ]


  // 3. Create the router instance and pass the `routes` option
  // You can pass in additional options here, but let's
  // keep it simple for now.
  const router = new VueRouter({
    routes // short for `routes: routes`
  })



new Vue({
  el: '#app',
  router: router,
  render: h => h(App)
})
