# 开发者工具箱 - 项目计划

> 全栈项目 | Spring Boot 3.x + Vue 3 | 高可扩展架构

---

## 📋 项目概述

**项目名称**: DevTools (开发者工具箱)  
**项目定位**: 为开发者提供常用工具的在线平台  
**技术栈**: Spring Boot 3.x + Vue 3 + MySQL + MyBatis-Plus  
**项目特点**: 
- ✅ 模块化设计，高可扩展性
- ✅ 前后端分离架构
- ✅ 插件化工具模块
- ✅ 完全免费，不依赖外部付费 API

---

## 🏗️ 技术架构

### 后端技术栈
- [x] Spring Boot 3.2.0
- [x] JDK 17
- [x] MyBatis-Plus 3.5.5
- [x] MySQL 8.0
- [x] Hutool 5.8.23 (工具类库)
- [x] JWT (认证)
- [ ] Redis (缓存 - 后期添加)
- [ ] Spring Security (后期替换简单 JWT)

### 前端技术栈 (待开发)
- [ ] Vue 3
- [ ] Element Plus
- [ ] Vue Router
- [ ] Pinia (状态管理)
- [ ] Axios (HTTP 请求)

### 工具库
- [ ] Thumbnailator (图片处理)
- [ ] Apache POI (Excel 处理)
- [ ] ZXing (二维码生成)
- [ ] PDFBox (PDF 处理)

---

## 📦 模块设计

### 核心模块

#### 1. devtools-common (公共模块)
- [x] 统一响应格式 (Result)
- [ ] 全局异常处理
- [ ] 工具类集合
- [ ] 常量定义

#### 2. devtools-auth (认证模块)
- [ ] JWT 工具类
- [ ] 登录/注册接口
- [ ] 权限拦截器
- [ ] 用户信息管理

#### 3. devtools-web (主启动模块)
- [x] Spring Boot 启动类
- [x] 基础配置文件
- [ ] 跨域配置
- [ ] Swagger/Knife4j 集成

---

### 工具模块（插件化设计）

#### Phase 1: 基础工具 (MVP)
- [ ] **tool-text** (文本工具)
  - [ ] JSON 格式化/校验
  - [ ] Base64 编解码
  - [ ] URL 编解码
  - [ ] HTML 实体编解码

- [ ] **tool-crypto** (加密工具)
  - [ ] MD5 加密
  - [ ] SHA 系列
  - [ ] AES 加密/解密
  - [ ] 密码生成器

- [ ] **tool-image** (图片工具)
  - [ ] 图片压缩
  - [ ] 格式转换 (PNG/JPG/WebP)
  - [ ] 图片裁剪
  - [ ] 二维码生成

#### Phase 2: 进阶工具
- [ ] **tool-file** (文件工具) - 待创建
  - [ ] Excel 转 CSV
  - [ ] CSV 解析
  - [ ] XML 格式化
  - [ ] 文件哈希校验

- [ ] **tool-convert** (转换工具) - 待创建
  - [ ] 时间戳转换
  - [ ] 颜色转换 (HEX/RGB/HSL)
  - [ ] 单位转换
  - [ ] 进制转换

- [ ] **tool-generate** (生成器) - 待创建
  - [ ] UUID 生成
  - [ ] 随机数生成
  - [ ]  Lorem Ipsum 文本生成
  - [ ] 正则表达式测试

#### Phase 3: 高级工具
- [ ] **tool-code** (代码工具) - 待创建
  - [ ] 代码格式化 (Java/Python/JS)
  - [ ] SQL 格式化
  - [ ] 正则测试工具
  - [ ] Cron 表达式生成

- [ ] **tool-api** (API 工具) - 待创建
  - [ ] HTTP 请求测试
  - [ ] Webhook 测试
  - [ ] API Mock
  - [ ] cURL 转换

- [ ] **tool-pdf** (PDF 工具) - 待创建
  - [ ] PDF 转图片
  - [ ] 图片转 PDF
  - [ ] PDF 合并
  - [ ] PDF 压缩

---

## 🎯 开发计划

### Phase 1: 基础框架
- [x] Maven 多模块项目搭建
- [x] Git 初始化 & GitHub 推送
- [x] 基础配置文件
- [x] 统一响应格式
- [x] 全局异常处理（待添加）
- [x] 测试接口验证

### Phase 2: 第一批工具 (MVP)
- [ ] JSON 格式化工具 (前后端)
- [ ] Base64 编解码 (前后端)
- [ ] MD5 加密 (前后端)
- [ ] 前端基础页面搭建

### Phase 3: 用户系统
- [ ] 用户注册/登录
- [ ] JWT 认证
- [ ] 用户收藏功能
- [ ] 使用历史记录

### Phase 4: 更多工具
- [ ] 图片处理工具
- [ ] 文件处理工具
- [ ] 加密工具集合

### Phase 5: 前端完善
- [ ] Vue 3 项目初始化
- [ ] 工具分类展示
- [ ] 搜索功能
- [ ] 响应式布局

### Phase 6: 高级功能
- [ ] 用户数据统计
- [ ] 工具使用排行
- [ ] 批量处理
- [ ] 插件市场

---

## 📝 开发规范

### 命名规范
- **包名**: 全小写，如 `com.devtools.common`
- **类名**: 大驼峰，如 `JsonFormatController`
- **方法名**: 小驼峰，如 `formatJson`
- **常量**: 全大写+下划线，如 `MAX_FILE_SIZE`
- **数据库表**: 小写+下划线，如 `user_info`

### 接口设计规范
- RESTful API 风格
- 统一响应格式: `{code, message, data}`
- 接口版本控制: `/api/v1/...`
- 错误码规范: 200成功，4xx客户端错误，5xx服务器错误

### Git 提交规范
- `feat`: 新功能
- `fix`: 修复bug
- `docs`: 文档更新
- `style`: 代码格式调整
- `refactor`: 重构
- `test`: 测试相关
- `chore`: 构建/工具相关

### 注释规范
- 类级别注释说明功能
- 复杂方法必须注释
- 关键业务逻辑注释
- 公共 API 使用 JavaDoc

---

## 🔧 数据库设计

### 已创建表
- [ ] 无

### 待创建表
- [ ] `user` - 用户表
- [ ] `tool_favorite` - 工具收藏表
- [ ] `tool_usage_log` - 工具使用日志
- [ ] `tool_config` - 工具配置表

---

## 📊 进度统计

| 模块 | 总数 | 已完成 | 进度 |
|------|------|--------|------|
| 核心模块 | 6 | 2 | 33% |
| Phase 1 工具 | 4 | 0 | 0% |
| Phase 2 工具 | 3 | 0 | 0% |
| Phase 3 工具 | 3 | 0 | 0% |
| 前端开发 | 1 | 0 | 0% |

**总体进度**: 基础框架搭建完成，开始开发核心功能...

---

## 💡 扩展方向

### 技术扩展
- [ ] 引入 Redis 缓存
- [ ] 引入消息队列 (RabbitMQ/Kafka)
- [ ] 微服务改造 (Spring Cloud)
- [ ] Docker 容器化部署
- [ ] CI/CD 自动化部署

### 功能扩展
- [ ] 用户协作功能
- [ ] 工具自定义配置
- [ ] API 开放平台
- [ ] 插件市场
- [ ] 数据统计分析

---

## 📚 学习要点

### 后端重点
1. Spring Boot 多模块架构
2. MyBatis-Plus 使用
3. JWT 认证实现
4. 文件上传下载处理
5. 异步任务处理
6. 性能优化技巧

### 前端重点
1. Vue 3 组合式 API
2. Element Plus 组件库
3. 状态管理 (Pinia)
4. HTTP 请求封装
5. 组件封装技巧
6. 响应式布局

### AI 编程工具系统能力 (Qoder) ⭐
1. **基础使用** - 代码生成、代码解释、智能补全、重构优化、调试排错
2. **记忆系统** - 理解记忆分类、何时创建/更新/删除记忆、利用记忆提高 AI 响应质量
3. **规则系统** - 创建项目规则文件、配置 AI 行为约束、建立代码规范自动检查
4. **技能系统** - 创建自定义 skill、封装可复用的 AI 工作流
5. **Agent 系统** - 使用专业代理、创建子代理处理专门任务
6. **Prompt 技巧** - 如何提问、如何描述需求、如何引导 AI 给出更好的回答
7. **工具配置** - 理解 Qoder 的工作原理、如何定制适合自己的开发环境

**学习方式：**
- 在实际使用中演示系统工作原理
- 解释为什么使用某个功能、背后的设计思路
- 鼓励自己尝试创建记忆/规则/skill
- 培养对 AI 工具的系统性理解

---

## 🐛 已知问题

_暂无_

---

## 📖 参考资料

- Spring Boot 官方文档: https://spring.io/projects/spring-boot
- MyBatis-Plus 文档: https://baomidou.com
- Vue 3 官方文档: https://cn.vuejs.org
- Element Plus 文档: https://element-plus.org

---

**最后更新**: 2026-05-13  
**当前阶段**: Phase 1 - 基础框架搭建完成
