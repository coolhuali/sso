/*
 * Copyright© 2013-2018 YZTC 
 * Author zhenghl 
 * 本公司保留所有下述内容的权利; 
 * 本内容为保密信息，仅限本公司内部使用; 
 * 非经本公司书面许可，任何人不得外泄或用于其他目的; 
*/
package com.carl.sso.support.validate.config;

import com.carl.sso.support.validate.configuration.SSOValidateConfigurationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author Carl
 * @date 2017/11/2
 * @since
 */
@Configuration("ssoValidateConfiguration")
@EnableConfigurationProperties(SSOValidateConfigurationProperties.class)
public class SSOValidateConfiguration {
    @Autowired
    private SSOValidateConfigurationProperties properties;
}
