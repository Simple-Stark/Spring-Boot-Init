package com.simple.init.controller;

import com.simple.common.dict.util.DictCoverUtil;
import com.simple.common.exception.SimpleException;
import com.simple.common.result.Result;
import com.simple.init.common.UserCodeMsg;
import com.simple.init.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 测试控制层
 * @author Simple
 * @date 2021/9/22 22:47
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    /**
     * 字典转换工具类
     */
    @Resource
    DictCoverUtil dictCoverUtil;

    /**
     * 【测试】项目是否成功启动及日志打印
     * @return 测试字符串
     */
    @GetMapping("/hello")
    public Result<String> hello() {
        log.info("log test");
        return Result.success("hello init, hello 自定义common包");
    }

    /**
     * 【测试】拦截空指针异常
     * @return null
     */
    @GetMapping("/nullExp")
    public Result<Void> nullExp() {
        log.info("test nullExp");
        throw new NullPointerException();
    }

    /**
     * 【测试】拦截自定义异常
     * @return null
     */
    @GetMapping("/simpleExp")
    public Result<Void> simpleExp() {
        log.info("test SimpleException");
        throw new SimpleException("自定义异常测试");
    }

    /**
     * 【测试】自定义消息返回
     * @return null
     */
    @GetMapping("/userCode")
    public Result<Void> userCode() {
        return Result.error(UserCodeMsg.USER_LOGIN_ERROR);
    }

    /**
     * 【测试】自定义消息通过SimpleException返回
     * @return null
     */
    @GetMapping("/userCodeException")
    public Result<Void> userCodeException() {
        throw new SimpleException(UserCodeMsg.USER_OTHER_LOGIN);
    }

    @GetMapping("/dictTest")
    public Result<User> dictTest() {
        User user = new User();
        user.setName("Simple");
        user.setSexCode("1");
        user.setAge(20);
        dictCoverUtil.coverCodeToMean(user);
        return Result.success(user);
    }
}
