/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */



package com.carl.sso.support.validate.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.io.Serializable;

/**
 * @author Carl
 * @date 2017/11/2
 * @since
 */
@ConfigurationProperties(value = "sso.validate")
public class SSOValidateConfigurationProperties implements Serializable {
    public static final String PREFIX = "sso.validate";

    @NestedConfigurationProperty
    private MailProperties mail = new MailProperties();

    public MailProperties getMail() {
        return mail;
    }

    public void setMail(MailProperties mail) {
        this.mail = mail;
    }
}
