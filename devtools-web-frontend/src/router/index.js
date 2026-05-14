import { createRouter, createWebHistory } from 'vue-router'

const routes = [
    {
        path: '/',
        name: 'Home',
        component: () => import('../views/Home.vue')
    },
    {
        path: '/json-format',
        name: 'JsonFormat',
        component: () => import('../views/JsonFormat.vue')
    },
    {
        path: '/base64',
        name: 'Base64',
        component: () => import('../views/Base64.vue')
    }
]

const router = createRouter({
    history: createWebHistory(),
    routes
})

export default router