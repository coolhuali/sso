/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */



package com.carl.sso.support.auth;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apereo.cas.authentication.RememberMeUsernamePasswordCredential;

import javax.validation.constraints.Size;

/**
 * 用户名，密码，系统
 *
 * @author Carl
 * @date 2017/10/23
 * @since
 */
public class UsernamePasswordSysCredential extends RememberMeUsernamePasswordCredential {
    @Size(min = 2, message = "require system")
    private String system;

    public String getSystem() {
        return system;
    }

    public UsernamePasswordSysCredential setSystem(String system) {
        this.system = system;
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .appendSuper(super.hashCode())
                .append(this.system)
                .toHashCode();
    }
}
