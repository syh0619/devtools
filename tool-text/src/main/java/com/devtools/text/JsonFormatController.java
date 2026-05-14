package com.devtools.text;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devtools.common.Result;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api/text/json")
public class JsonFormatController {

    @PostMapping("/format")
    public Result<String> formatJson(@RequestBody Map<String, String> request) {
        try {
            String jsonStr = request.get("json");
            ObjectMapper mapper = new ObjectMapper();

            Object obj = mapper.readValue(jsonStr, Object.class);
            String formattedJson = mapper.writerWithDefaultPrettyPrinter()
                    .writeValueAsString(obj);

            return Result.success(formattedJson);
        } catch (JsonProcessingException e) {
            return Result.error("JSON格式错误");
        }
    }

}
