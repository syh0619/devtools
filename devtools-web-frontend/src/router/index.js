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
    },
    {
        path: '/url-encode',
        name: 'UrlEncode',
        component: () => import('../views/UrlEncode.vue')
    },
    {
        path: '/md5',
        name: 'Md5',
        component: () => import('../views/Md5.vue')
    },
    {
        path: '/sha256',
        name: 'Sha256',
        component: () => import('../views/Sha256.vue')
    }
]

const router = createRouter({
    history: createWebHistory(),
    routes
})

export default router