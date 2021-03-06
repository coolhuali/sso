/*
 * Copyright© 2013-2018 YZTC 
 * Author zhenghl 
 * 本公司保留所有下述内容的权利; 
 * 本内容为保密信息，仅限本公司内部使用; 
 * 非经本公司书面许可，任何人不得外泄或用于其他目的; 
*/
package com.carl.sso.support.captcha;

import org.apereo.cas.web.AbstractDelegateController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;

/**
 * 验证码控制器
 *
 * @author Carl
 * @date 2017/10/27
 * @since
 */
public class CaptchaController extends AbstractDelegateController {
    private ICaptchaWriter<String> captchaWriter;
    private SessionCaptchaResultAware<String> aware;

    public CaptchaController(ICaptchaWriter<String> captchaWriter, SessionCaptchaResultAware<String> aware) {
        this.captchaWriter = captchaWriter;
        this.aware = aware;
    }

    public SessionCaptchaResultAware<String> getAware() {
        return aware;
    }

    public ICaptchaWriter<String> getCaptchaWriter() {
        return captchaWriter;
    }

    @Override
    public boolean canHandle(HttpServletRequest request, HttpServletResponse response) {
        return true;
    }

    @GetMapping(value = CaptchaConstants.REQUEST_MAPPING, produces = "image/png")
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        response.setHeader("Cache-Control", "no-cache");
        response.setContentType("image/png");
        OutputStream outputStream = response.getOutputStream();
        String text = getAware().getAndStore(request.getSession());
        getCaptchaWriter().write(text, outputStream);
        return null;
    }
}
