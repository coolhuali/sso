/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */
package com.carl.sso.support.captcha.imp.cage;
import com.carl.sso.support.captcha.CaptchaController;
import com.carl.sso.support.captcha.ICaptchaWriter;
import com.carl.sso.support.captcha.SessionCaptchaResultAware;
import com.carl.sso.support.captcha.SessionCaptchaResultProvider;
import com.carl.sso.support.captcha.string.StringCaptchaResultAware;
/**
 * Cage验证码控制器
 *
 * @author Carl
 * @date 2017/10/27
 */
public class CageCaptchaController extends CaptchaController {
    public CageCaptchaController(ICaptchaWriter<String> captchaWriter, SessionCaptchaResultAware<String> aware) {
        super(captchaWriter, aware);
    }
    public CageCaptchaController() {
        super(new CageStringCaptchaWriter(), new StringCaptchaResultAware(new SessionCaptchaResultProvider(), new CageStringTokenGenerator()));
    }
    public CageCaptchaController(SessionCaptchaResultProvider provider) {
        super(new CageStringCaptchaWriter(), new StringCaptchaResultAware(provider, new CageStringTokenGenerator()));
    }
}
