# <center> Spring-Boot-Init

<div style="text-align: center;">

[![](https://img.shields.io/badge/blog-%40SimpleStark-blue.svg)](https://simplestark.com)
[![](https://img.shields.io/badge/SpringBoot-2.3.12.RELEASE-blue.svg)]({https://docs.spring.io/spring-boot/docs/2.3.12.RELEASE/reference/html/})
[![](https://img.shields.io/badge/SimpleCommon-v1.0.0-bule.svg)](https://github.com/Simple-Stark/common)
[![](https://img.shields.io/badge/license-GPL2.0-orange.svg)](https://github.com/Simple-Stark/common/blob/master/LICENSE)

</div>

## 作者
### [![](https://img.shields.io/badge/author-%40SimpleStark-blue.svg)](https://github.com/Simple-Stark)
- Github: [@Simple-Stark](https://github.com/Simple-Stark)
- Blog:[烟霞志](https://simplestark.com)
- Email:wrh_1125@163.com

## 简介

自定义 Spring Boot 脚手架，基于Spring Boot 2.3.12.RELEASE 版本创建，适配Spring Cloud Hoxton.SR12版本，搭载了自定义Simple-Common包。
对这个项目的希望是能够作为之后Java 方向的微服务搭建脚手架，作为新模块开发初始化项目使用。尤其是Spring Cloud。
**同时也是自定义Simple-Common包的最佳实践。**

## 已有功能
- [x] 多环境多配置文件
- [x] 基于Spring-Common 的全局统一消息返回
- [x] 基于Spring-Common 的全局异常拦截
- [x] 基于Spring-Common 的全局日志配置
- [x] 基于Spring-Common 的mybatisPlus 代码自动生成器
- [x] 基于Spring-Common 的字典转换工具

## 使用
在自定义Spring-Common包未推送到中央仓库之前，想要运行此项目，需要手动将Spring-Common 包安装到本地Maven仓库，详细说明参见

Spring-Common 包地址：https://github.com/Simple-Stark/common

#### Spring-Common最佳实践
- 全局统一消息返回实践：https://github.com/Simple-Stark/Spring-Boot-Init/blob/master/src/main/java/com/simple/init/controller/TestController.java
- 自定义消息返回通知：https://github.com/Simple-Stark/Spring-Boot-Init/blob/master/src/main/java/com/simple/init/common/UserCodeMsg.java
- 通过单元测试自动生成代码：https://github.com/Simple-Stark/Spring-Boot-Init/blob/master/src/test/java/com/simple/init/InitApplicationTests.java
- 字典转换工具：https://github.com/Simple-Stark/Spring-Boot-Init/blob/master/src/main/java/com/simple/init/config/DictConfig.java

## 更新日志
### v 1.0.0
    - 2021-09-26
      - 全局统一消息返回
      - 全局异常拦截及自定义异常
      - 全局日志配置
      - MybatisPlus 代码生成器(3.5.1)集成
    - 2021-09-29
      - UserCodeMsg 继承CodeMsg 支持项目自定义消息返回
    - 2021-10-05
      - 增加字典转换工具的使用

## License

[![](https://img.shields.io/badge/license-GPL2.0-orange.svg)](https://github.com/Simple-Stark/Spring-Boot-Init/blob/master/LICENSE)

