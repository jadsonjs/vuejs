import { createRouter, createWebHistory } from "vue-router"


// importa componentes default usado nas rotas
import Login from "../views/Login.vue"

const routes = [
	{ path: "/login", name: "Login", component: Login, }
]

const router = createRouter({
	history: createWebHistory("/"),
	routes,
})

export default router
