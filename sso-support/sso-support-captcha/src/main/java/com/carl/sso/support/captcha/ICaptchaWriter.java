/*
 * Copyright© 2013-2018 YZTC 
 * Author zhenghl 
 * 本公司保留所有下述内容的权利; 
 * 本内容为保密信息，仅限本公司内部使用; 
 * 非经本公司书面许可，任何人不得外泄或用于其他目的; 
*/
package com.carl.sso.support.captcha;

import java.io.IOException;
import java.io.OutputStream;

/**
 * 验证码输出者
 *
 * @author Carl
 * @date 2017/10/27
 * @since
 */
public interface ICaptchaWriter<T> {
    /**
     * 对外写出验证码并且返回结果集
     *
     * @param outputStream
     * @return
     * @throws IOException
     */
    void write(T t, OutputStream outputStream) throws IOException;
}
