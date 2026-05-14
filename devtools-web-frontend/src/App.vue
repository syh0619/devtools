<template>
  <div id="app">
    <el-container>
      <el-header>
        <h1 @click="$router.push('/')" style="cursor: pointer;">开发者工具箱</h1>
      </el-header>
      
      <el-main>
        <router-view></router-view>
      </el-main>
    </el-container>
  </div>
</template>

<style>
#app {
  font-family: Arial, sans-serif;
}

.el-header {
  background-color: #409eff;
  color: white;
  display: flex;
  align-items: center;
  padding: 0 20px;
}

.el-header h1 {
  margin: 0;
  font-size: 24px;
}

.el-main {
  padding: 20px;
  background-color: #f5f5f5;
  min-height: calc(100vh - 60px);
}
</style>