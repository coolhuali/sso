/*
 * Copyright© 2013-2018 YZTC 
 * Author zhenghl 
 * 本公司保留所有下述内容的权利; 
 * 本内容为保密信息，仅限本公司内部使用; 
 * 非经本公司书面许可，任何人不得外泄或用于其他目的; 
*/
package com.carl.sso.support.captcha.action;

import com.carl.sso.support.auth.UsernamePasswordSysCredential;
import com.carl.sso.support.captcha.ICaptchaResultProvider;
import org.apereo.cas.authentication.Credential;
import org.apereo.cas.web.support.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.webflow.action.AbstractAction;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 登录校验码
 *
 * @author Carl
 * @date 2017/11/18
 */
public class ValidateLoginCaptchaAction extends AbstractAction {
    private static final Logger LOGGER = LoggerFactory.getLogger(ValidateLoginCaptchaAction.class);
    private ICaptchaResultProvider<HttpSession, String> captchaResultProvider;
    private static final String CODE = "captchaError";

    public ValidateLoginCaptchaAction(ICaptchaResultProvider<HttpSession, String> captchaResultProvider) {
        this.captchaResultProvider = captchaResultProvider;
    }

    /**
     * 前端验证码
     */
    public static final String CODE_PARAM = "validateCode";

    @Override
    protected Event doExecute(RequestContext context) throws Exception {
        Credential credential = WebUtils.getCredential(context);
        if (credential instanceof UsernamePasswordSysCredential
                && ((UsernamePasswordSysCredential) credential).getSystem() != null) {
            if (isEnable()) {
                LOGGER.debug("开始校验登录校验码");
                HttpServletRequest request = WebUtils.getHttpServletRequest();
                HttpSession httpSession = request.getSession();
                String inCode = request.getParameter(CODE_PARAM);
                if (!this.captchaResultProvider.validate(httpSession, inCode)) {
                    return getError(context);
                }
            }
        }
        return null;
    }

    /**
     * 是否开启验证码
     * 
     * @return
     */
    private boolean isEnable() {
        return true;
    }

    /**
     * 跳转到错误页
     * 
     * @param requestContext
     * @return
     */
    private Event getError(final RequestContext requestContext) {
        final MessageContext messageContext = requestContext.getMessageContext();
        messageContext.addMessage(new MessageBuilder().error().code(CODE).build());
        return getEventFactorySupport().event(this, CODE);
    }
}
