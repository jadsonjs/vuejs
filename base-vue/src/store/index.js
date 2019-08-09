import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

const debug = process.env.NODE_ENV !== 'production'

import General  from './modules/general'

// export a new vue store with de modules that we define
export default new Vuex.Store({
    modules: {
        general:   General, 
    },
    
    // In strict mode, whenever Vuex state is mutated outside of mutation handlers, an error will be thrown. 
    // This ensures that all state mutations can be explicitly tracked by debugging tools.
    strict: debug,
  
    // Vuex stores accept the plugins option that exposes hooks for each mutation. 
    // A Vuex plugin is simply a function that receives the store as the only argument
    plugins: debug ? [
      // createLogger(),
  
      // createPersistedState(
      //   {
      //     //getItem: key => window.$coockies.get(key),
      //     //setItem: (key, value) => window.$coockies.set(key, value, { expires: 3, secure: true }),
      //  }),
    ] : 
    [
      // createPersistedState({
      //    //getItem: key => window.$coockies.get(key),
      //    //setItem: (key, value) => window.$coockies.set(key, value, { expires: 3, secure: true }),
      // }),
    ]
    
  })
  