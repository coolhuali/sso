/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */
package com.carl.sso.support.captcha;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import javax.servlet.http.HttpSession;
/**
 * session提供
 *
 * @author Carl
 * @date 2017/10/27
 * @since
 */
public class SessionCaptchaResultProvider implements ICaptchaResultProvider<HttpSession, String> {
    private static final Logger LOGGER = LoggerFactory.getLogger(SessionCaptchaResultProvider.class);
    @Override
    public void store(HttpSession httpSession, String s) {
        httpSession.setAttribute(CaptchaConstants.STORE_CODE, s);
    }
    @Override
    public String get(HttpSession httpSession) {
        return (String) httpSession.getAttribute(CaptchaConstants.STORE_CODE);
    }
    @Override
    public boolean validate(HttpSession store, String code) {
        String relCode = get(store);
        if (!StringUtils.isEmpty(relCode) && relCode.equals(code)) {
            //校验完清空
            store(store, null);
            return true;
        }
        return false;
    }
}
