/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */




package com.carl.sso.support.single.config;

import com.carl.sso.support.single.listener.TGTCreateEventListener;
import com.carl.sso.support.single.service.TriggerLogoutService;
import com.carl.sso.support.single.service.UserIdObtainServiceImpl;
import org.apereo.cas.CentralAuthenticationService;
import org.apereo.cas.configuration.CasConfigurationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 登出配置
 *
 * @author Carl
 * @date 2017/11/29
 */
@Configuration("singleLogoutTriggerConfiguration")
@EnableConfigurationProperties(CasConfigurationProperties.class)
public class SingleLogoutTriggerConfiguration {
    @Autowired
    private CentralAuthenticationService centralAuthenticationService;

    /**
     * 触发登出服务
     *
     * @return 触发登出服务
     */
    @Bean
    protected TriggerLogoutService triggerLogoutService() {
        return new TriggerLogoutService(centralAuthenticationService);
    }

    @Bean
    //注册事件监听tgt的创建
    protected TGTCreateEventListener tgtCreateEventListener() {
        TGTCreateEventListener listener = new TGTCreateEventListener(triggerLogoutService(), new UserIdObtainServiceImpl());
        return listener;
    }
}
