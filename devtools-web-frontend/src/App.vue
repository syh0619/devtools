<template>
  <div id="app">
    <el-container style="min-height: 100vh;">
      <!-- 侧边栏 -->
      <el-aside width="250px">
        <div class="logo">开发者工具箱</div>
        <el-menu
          :default-active="activeMenu"
          @select="handleMenuSelect"
          background-color="#304156"
          text-color="#bfcbd9"
          active-text-color="#409eff"
        >
          <el-menu-item index="/">
            <el-icon><HomeFilled /></el-icon>
            <span>首页</span>
          </el-menu-item>
          
          <el-sub-menu index="text">
            <template #title>
              <el-icon><Document /></el-icon>
              <span>文本工具</span>
            </template>
            <el-menu-item index="/json-format">JSON 格式化</el-menu-item>
            <el-menu-item index="/base64">Base64 编解码</el-menu-item>
            <el-menu-item index="/url-encode">URL 编解码</el-menu-item>
          </el-sub-menu>
          
          <el-sub-menu index="crypto">
            <template #title>
              <el-icon><Lock /></el-icon>
              <span>加密工具</span>
            </template>
            <el-menu-item index="/md5">MD5 加密</el-menu-item>
            <el-menu-item index="/sha256">SHA256 加密</el-menu-item>
          </el-sub-menu>
        </el-menu>
      </el-aside>
      
      <!-- 主内容区 -->
      <el-container>
        <el-header>
          <div class="header-content">
            <h2>{{ pageTitle }}</h2>
          </div>
        </el-header>
        
        <el-main>
          <router-view></router-view>
        </el-main>
      </el-container>
    </el-container>
  </div>
</template>

<script setup>
import { ref, computed } from 'vue'
import { useRouter, useRoute } from 'vue-router'
import { HomeFilled, Document, Lock } from '@element-plus/icons-vue'

const router = useRouter()
const route = useRoute()

const activeMenu = computed(() => route.path)

const pageTitle = computed(() => {
  const titles = {
    '/': '首页',
    '/json-format': 'JSON 格式化',
    '/base64': 'Base64 编解码',
    '/url-encode': 'URL 编解码',
    '/md5': 'MD5 加密',
    '/sha256': 'SHA256 加密'
  }
  return titles[route.path] || '开发者工具箱'
})

const handleMenuSelect = (index) => {
  router.push(index)
}
</script>

<style>
#app {
  font-family: Arial, sans-serif;
}

.el-aside {
  background-color: #304156;
  color: white;
}

.logo {
  height: 60px;
  display: flex;
  align-items: center;
  justify-content: center;
  font-size: 18px;
  font-weight: bold;
  color: white;
  background-color: #2b2f3a;
}

.el-header {
  background-color: white;
  border-bottom: 1px solid #e6e6e6;
  padding: 0 20px;
  display: flex;
  align-items: center;
}

.header-content h2 {
  margin: 0;
  font-size: 20px;
  color: #303133;
}

.el-main {
  padding: 20px;
  background-color: #f0f2f5;
}
</style>