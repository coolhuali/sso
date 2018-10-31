/*
 * Copyright© 2013-2018 YZTC 
 * Author zhenghl 
 * 本公司保留所有下述内容的权利; 
 * 本内容为保密信息，仅限本公司内部使用; 
 * 非经本公司书面许可，任何人不得外泄或用于其他目的; 
*/
package com.carl.sso.support.captcha;

/**
 * 验证码结果提供者
 *
 * @author Carl
 * @date 2017/10/27
 * @since
 */
public interface ICaptchaResultProvider<T, S> {
    /**
     * 把S存储到T
     *
     * @param t
     * @param s
     */
    void store(T t, S s);

    /**
     * 在T中提供出s
     * 
     * @param t
     * @return
     */
    S get(T t);

    /**
     * 校验
     * 
     * @param store
     *        持久化对象
     * @param code
     *        校验编码
     * @return
     */
    boolean validate(T store, S code);
}
