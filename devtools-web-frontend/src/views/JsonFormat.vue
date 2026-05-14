<template>
  <div class="json-format">
    <h2>JSON 格式化工具</h2>
    
    <div class="actions">
      <el-button type="primary" @click="formatJson">格式化</el-button>
      <el-button @click="clear">清空</el-button>
    </div>
    
    <div class="container">
      <div class="input-section">
        <h3>输入 JSON</h3>
        <el-input
          v-model="inputJson"
          type="textarea"
          :rows="20"
          placeholder="请输入 JSON 数据"
        ></el-input>
      </div>
      
      <div class="output-section">
        <h3>格式化结果</h3>
        <el-input
          v-model="outputJson"
          type="textarea"
          :rows="20"
          readonly
        ></el-input>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue'
import axios from 'axios'
import { ElMessage } from 'element-plus'

const inputJson = ref('')
const outputJson = ref('')

const formatJson = async () => {
  if (!inputJson.value.trim()) {
    ElMessage.warning('请输入 JSON 数据')
    return
  }
  
  try {
    const response = await axios.post('http://localhost:8080/api/text/json/format', {
      json: inputJson.value
    })
    
    if (response.data.code === 200) {
      outputJson.value = response.data.data
      ElMessage.success('格式化成功')
    } else {
      ElMessage.error(response.data.message)
    }
  } catch (error) {
    ElMessage.error('请求失败：' + error.message)
  }
}

const clear = () => {
  inputJson.value = ''
  outputJson.value = ''
}
</script>

<style scoped>
.json-format {
  padding: 20px;
}

.container {
  display: grid;
  grid-template-columns: 1fr 1fr;
  gap: 20px;
  margin-top: 20px;
}

.actions {
  display: flex;
  gap: 10px;
  margin: 20px 0;
}
</style>