
import { createApp } from "vue"
import App from "./App.vue"

// importa as configurações da rotas para essa aplicação
import router from "./router"


const app = createApp(App)
app.config.performance = true
app.use(router)
app.mount("#app")
