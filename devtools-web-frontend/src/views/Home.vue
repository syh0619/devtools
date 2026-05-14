<template>
  <div class="home">
    <h1>开发者工具箱</h1>
    <p>选择你要使用的工具</p>
    
    <div class="tools">
      <el-card class="tool-card" @click="$router.push('/json-format')">
        <h3>JSON 格式化</h3>
        <p>格式化和校验 JSON 数据</p>
      </el-card>
      
      <el-card class="tool-card" @click="$router.push('/base64')">
        <h3>Base64 编解码</h3>
        <p>Base64 编码和解码</p>
      </el-card>
    </div>
  </div>
</template>

<style scoped>
.home {
  padding: 20px;
}

.tools {
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(300px, 1fr));
  gap: 20px;
  margin-top: 20px;
}

.tool-card {
  cursor: pointer;
  transition: transform 0.3s;
}

.tool-card:hover {
  transform: translateY(-5px);
}
</style>