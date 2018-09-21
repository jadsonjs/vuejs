import Vue from 'vue'
import VueRouter from 'vue-router' // import the vue router
import routes from './routes'

import App from './App.vue'

/**
 * When used with a module system, you must explicitly install the router via Vue.use():
 */
Vue.use(VueRouter)

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
