/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */



package com.carl.auth.shiro.client.demo.exception;

import io.buji.pac4j.subject.Pac4jPrincipal;

import java.util.Map;

/**
 * @author Carl
 * @date 2017/10/9
 * @since 1.5.0
 */
public class NotBindException extends Exception {
    private String clientName;
    private String redirectUrl;
    private Map<String, Object> attr;
    private Pac4jPrincipal principal;

    public Pac4jPrincipal getPrincipal() {
        return principal;
    }

    public NotBindException setPrincipal(Pac4jPrincipal principal) {
        this.principal = principal;
        return this;
    }

    public String getClientName() {
        return clientName;
    }

    public NotBindException setClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public NotBindException setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    public Map<String, Object> getAttr() {
        return attr;
    }

    public NotBindException setAttr(Map<String, Object> attr) {
        this.attr = attr;
        return this;
    }
}
