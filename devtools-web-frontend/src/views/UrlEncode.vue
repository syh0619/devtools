<template>
  <div class="url-encode">
    <h2>URL 编解码工具</h2>
    
    <div class="tabs">
      <el-radio-group v-model="mode">
        <el-radio-button value="encode">编码</el-radio-button>
        <el-radio-button value="decode">解码</el-radio-button>
      </el-radio-group>
    </div>
    
    <div class="actions">
      <el-button type="primary" @click="process">{{ mode === 'encode' ? '编码' : '解码' }}</el-button>
      <el-button @click="clear">清空</el-button>
    </div>
    
    <div class="container">
      <div class="input-section">
        <h3>输入{{ mode === 'encode' ? '文本' : 'URL' }}</h3>
        <el-input
          v-model="inputText"
          type="textarea"
          :rows="15"
          :placeholder="mode === 'encode' ? '请输入要编码的文本' : '请输入 URL 编码字符串'"
        ></el-input>
      </div>
      
      <div class="output-section">
        <h3>结果</h3>
        <el-input
          v-model="outputText"
          type="textarea"
          :rows="15"
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

const mode = ref('encode')
const inputText = ref('')
const outputText = ref('')

const process = async () => {
  if (!inputText.value.trim()) {
    ElMessage.warning(mode.value === 'encode' ? '请输入要编码的文本' : '请输入 URL 编码字符串')
    return
  }
  
  try {
    const url = mode.value === 'encode' 
      ? 'http://localhost:8080/api/text/url/encode'
      : 'http://localhost:8080/api/text/url/decode'
    
    const response = await axios.post(url, { text: inputText.value })
    
    if (response.data.code === 200) {
      outputText.value = response.data.data
      ElMessage.success('操作成功')
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
.url-encode {
  padding: 20px;
}

.tabs {
  margin: 20px 0;
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