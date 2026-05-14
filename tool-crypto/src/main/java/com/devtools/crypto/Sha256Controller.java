package com.devtools.crypto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devtools.common.Result;

import cn.hutool.crypto.digest.DigestUtil;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/crypto/sha256")
public class Sha256Controller {

    @PostMapping("/encrypt")
    public Result<String> encrypt(@RequestBody Map<String, String> request) {
        String text = request.get("text");
        String sha256 = DigestUtil.sha256Hex(text);
        return Result.success(sha256);
    }

}
