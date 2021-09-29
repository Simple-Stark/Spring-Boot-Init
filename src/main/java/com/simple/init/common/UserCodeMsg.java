package com.simple.init.common;

import com.simple.common.result.CodeMsg;

/**
 * 自定义消息返回
 *
 * @author Simple
 * @date 2021/9/29 9:59
 */
public class UserCodeMsg extends CodeMsg {

    public static CodeMsg USER_LOGIN_ERROR = new UserCodeMsg(500100, "用户名或密码错误！");
    public static CodeMsg USER_OTHER_LOGIN = new UserCodeMsg(500101, "你已在别处登录！");

    /**
     * 【构造器】私有构造器，防止直接创建
     *
     * @param code 自定义响应码
     * @param msg  自定义消息通知
     */
    private UserCodeMsg(int code, String msg) {
        super(code, msg);
    }
}
