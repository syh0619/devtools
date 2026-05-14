package com.devtools.text;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devtools.common.Result;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/text/url")
public class UrlEncodeController {
    @PostMapping("/encode")
    public Result<String> encode(@RequestBody Map<String, String> request) {
        String text = request.get("text");
        String encoded = URLEncoder.encode(text, StandardCharsets.UTF_8);

        return Result.success(encoded);
    }

    @PostMapping("/decode")
    public Result<String> decode(@RequestBody Map<String, String> request) {
        String text = request.get("text");
        String decoded = URLDecoder.decode(text, StandardCharsets.UTF_8);
        return Result.success(decoded);
    }
}
