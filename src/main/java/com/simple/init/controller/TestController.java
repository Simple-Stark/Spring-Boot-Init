package com.simple.init.controller;

import com.simple.common.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制层
 * @author Simple
 * @date 2021/9/22 22:47
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    public Result<String> hello() {
        log.info("log test");
        return Result.success("hello init, hello 自定义common包");
    }

}
