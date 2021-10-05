package com.simple.init.config;

import com.simple.common.dict.DictCache;
import com.simple.common.dict.service.SysDictServiceImpl;
import com.simple.common.dict.util.DictCoverUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 字典转换配置类
 * @author Simple
 * @date 2021/10/4 15:37
 */
@Configuration
public class DictConfig {

    /**
     * 【Bean】 字典缓存容器
     * @param sysDictService 默认字典服务实现类
     * @return 字典缓存容器Bean
     */
    @Bean
    public DictCache dictCache(SysDictServiceImpl sysDictService) {
        return new DictCache(sysDictService);
    }

    /**
     * 【Bean】 根据字典缓存容器生成 字典转换工具类
     * @param dictCache 字典缓存容器
     * @return 字典转换工具类
     */
    @Bean
    public DictCoverUtil dictCoverUtil(DictCache dictCache) {
        return new DictCoverUtil(dictCache);
    }
}
