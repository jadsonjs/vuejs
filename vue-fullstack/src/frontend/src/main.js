import { createApp } from 'vue'
import { createPinia } from 'pinia'

import App from './App.vue'
import router from './router'


// fontawesome icons 
import '@fortawesome/fontawesome-free/css/all.css'
import '@fortawesome/fontawesome-free/js/all.js'


import './plugins';

const app = createApp(App)

app.use(createPinia())
app.use(router)

app.mount('#app')
