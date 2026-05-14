package com.devtools.crypto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devtools.common.Result;

import cn.hutool.crypto.digest.DigestUtil;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/crypto/md5")
public class Md5Controller {

    @PostMapping("/encrypt")
    public Result<String> encrypt(@RequestBody Map<String, String> request) {
        String text = request.get("text");
        String md5 = DigestUtil.md5Hex(text);
        return Result.success(md5);
    }

}
