package com.simple.init;

import com.simple.common.utils.MyBatisPlusGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class InitApplicationTests {

    /**
     * 代码自定义生成器
     */
    @Resource
    MyBatisPlusGenerator myBatisPlusGenerator;

    @Test
    void contextLoads() {
    }

    /**
     * 自动生成代码
     */
    @Test
    void mybatisPlus() {
        List<String> tableList = new ArrayList<>();
        tableList.add("user");
        myBatisPlusGenerator.generator(tableList,"Simple","com.simple.init");
    }
}
