/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */



package com.carl.sso.support.validate.imp.mail;

import com.carl.sso.support.validate.ValidateCredential;

import javax.validation.constraints.NotNull;

/**
 * @author Carl
 * @date 2017/11/2
 * @since 2.3.8
 */
public class MailValidateCredential extends MailCredential implements ValidateCredential {
    //校验码
    private String code;

    /**
     * @param sessionId
     * @param mail
     * @param busId     业务id，用于区分发送场景
     */
    public MailValidateCredential(@NotNull String sessionId, @NotNull String mail, @NotNull String busId, @NotNull String code) {
        super(sessionId, mail, busId);
        this.code = code;
    }

    @Override
    public Object data() {
        return code;
    }

    @Override
    public String id() {
        return super.id();
    }
}
