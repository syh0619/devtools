<template>
  <div class="md5">
    <h2>MD5 加密工具</h2>
    
    <div class="actions">
      <el-button type="primary" @click="encrypt">加密</el-button>
      <el-button @click="clear">清空</el-button>
    </div>
    
    <div class="container">
      <div class="input-section">
        <h3>输入文本</h3>
        <el-input
          v-model="inputText"
          type="textarea"
          :rows="10"
          placeholder="请输入要加密的文本"
        ></el-input>
      </div>
      
      <div class="output-section">
        <h3>MD5 结果</h3>
        <el-input
          v-model="outputText"
          type="textarea"
          :rows="10"
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

const inputText = ref('')
const outputText = ref('')

const encrypt = async () => {
  if (!inputText.value.trim()) {
    ElMessage.warning('请输入要加密的文本')
    return
  }
  
  try {
    const response = await axios.post('http://localhost:8080/api/crypto/md5/encrypt', {
      text: inputText.value
    })
    
    if (response.data.code === 200) {
      outputText.value = response.data.data
      ElMessage.success('加密成功')
    } else {
      ElMessage.error(response.data.message)
    }
  } catch (error) {
    ElMessage.error('请求失败：' + error.message)
  }
}

const clear = () => {
  inputText.value = ''
  outputText.value = ''
}
</script>

<style scoped>
.md5 {
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