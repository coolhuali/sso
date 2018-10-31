/*
 * Copyright© 2013-2018 YZTC 
 * Author zhenghl 
 * 本公司保留所有下述内容的权利; 
 * 本内容为保密信息，仅限本公司内部使用; 
 * 非经本公司书面许可，任何人不得外泄或用于其他目的; 
*/
package com.carl.sso.support.captcha.string;

import com.carl.sso.support.captcha.ICaptchaResultProvider;
import com.carl.sso.support.captcha.ITokenGenerator;
import com.carl.sso.support.captcha.SessionCaptchaResultAware;

/**
 * 字符串验证码识别器
 *
 * @author Carl
 * @date 2017/10/27
 * @since 2.3.8
 */
public class StringCaptchaResultAware extends SessionCaptchaResultAware {
    public StringCaptchaResultAware(ICaptchaResultProvider provider, ITokenGenerator generator) {
        super(provider, generator);
    }
}
