/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */
package com.carl.sso.support.captcha;
/**
 * 验证码输出结果对象
 *
 * @author Carl
 * @date 2017/10/27
 * @since
 */
public interface ICaptchaResultAware<S, T> {
    /**
     * 获取数据结果
     *
     * @param s 存储器
     * @return
     */
    T getAndStore(S s);
}
