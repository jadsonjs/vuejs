import Vue from 'vue'
import BootstrapVue from 'bootstrap-vue'
import Vuex from 'vuex'
import VueRouter from 'vue-router'

// css of the boostrap
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
// global css
import '@/assets/css/global.css'

import App from './App.vue'

// using plugins
Vue.use(BootstrapVue)
Vue.use(Vuex)
Vue.use(VueRouter)

// folders where are the store and router                   //
// they will import the index.js file inside theses folders //
import store from './store';
import router from './router';

Vue.config.productionTip = false

new Vue({
  router,
  store,
  render: h => h(App),
}).$mount('#app')
