import Vue from 'vue'
import Vuex from 'vuex'

import PersistedState from 'vuex-persistedstate'
import VueCookies from 'vue-cookies'


Vue.use(Vuex)
Vue.use(VueCookies)

const moduleA = {
 	state: {
  		count: 0
	},

	getters:{
    	evenOrOdd: state => state.count % 2 === 0 ? 'even' : 'odd'
	},

	mutations : {
      	increment (state) {
    		state.count++
  		},
  		decrement (state) {
    		state.count--
  		}
	}
}


export default new Vuex.Store({
	modules: {
    	a: moduleA
  	},
  	plugins: [
    	PersistedState({
      		getState: (key) => window.$cookies.get(key),
      		setState: (key, state) => window.$cookies.set(key,state)
    	})
  	]
})



// const state = {
//   count: 0
// }

// const getters = {
//     evenOrOdd: state => state.count % 2 === 0 ? 'even' : 'odd'
// }

// const mutations = {
//   increment (state) {
//     state.count++
//   },
//   decrement (state) {
//     state.count--
//   }
// }

// export default new Vuex.Store({
// 	state,
// 	getters,
// 	mutations
// })





