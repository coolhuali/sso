/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */
package com.carl.sso.support.captcha.config;
import com.carl.sso.support.captcha.SessionCaptchaResultProvider;
import com.carl.sso.support.captcha.imp.cage.CageCaptchaController;
import org.apereo.cas.configuration.CasConfigurationProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * @author Carl
 * @date 2017/10/28
 * @since 1.5.0
 */
@Configuration("captchaConfiguration")
@EnableConfigurationProperties(CasConfigurationProperties.class)
public class CaptchaConfiguration {
    //注册bean到spring容器
    @Bean
    @ConditionalOnMissingBean(name = "captchaController")
    public CageCaptchaController captchaController() {
        return new CageCaptchaController(captchaResultProvider());
    }
    @Bean
    public SessionCaptchaResultProvider captchaResultProvider() {
        return new SessionCaptchaResultProvider();
    }
}
