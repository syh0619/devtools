package com.devtools.controller;

import com.devtools.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试控制器
 * 验证项目基础功能是否正常
 */
@RestController
@RequestMapping("/api/test")
public class TestController {

    /**
     * 测试接口 - 返回成功消息
     */
    @GetMapping("/hello")
    public Result<String> hello() {
        return Result.success("开发者工具箱启动成功！");
    }

    /**
     * 测试接口 - 返回模拟数据
     */
    @GetMapping("/data")
    public Result<Map<String, Object>> getData() {
        Map<String, Object> data = new HashMap<>();
        data.put("name", "DevTools");
        data.put("version", "1.0.0");
        data.put("description", "开发者工具箱");
        
        return Result.success(data);
    }

    /**
     * 测试接口 - 返回错误
     */
    @GetMapping("/error")
    public Result<Void> testError() {
        return Result.error("这是一个错误测试");
    }
}