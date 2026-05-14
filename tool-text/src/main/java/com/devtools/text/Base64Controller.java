package com.devtools.text;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devtools.common.Result;

import java.util.Base64;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/text/base64")
public class Base64Controller {

    @PostMapping("/encode")
    public Result<String> encode(@RequestBody Map<String, String> request) {
        String text = request.get("text");
        String encoded = Base64.getEncoder().encodeToString(text.getBytes());
        return Result.success(encoded);
    }

    @PostMapping("/decode")
    public Result<String> decode(@RequestBody Map<String, String> request) {
        String base64Str = request.get("base64");
        byte[] decode = Base64.getDecoder().decode(base64Str);
        String original = new String(decode);
        return Result.success(original);
    }
}
