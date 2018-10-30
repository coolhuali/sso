/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */
package com.carl.sso.support.validate.imp.mail;
import com.carl.sso.support.validate.Credential;
/**
 * @author Carl
 * @date 2017/11/2
 * @since 2.3.8
 */
public class MailCredential implements Credential {
    private String mail;
    private String sessionId;
    private String busId;
    /**
     * @param sessionId
     * @param mail
     * @param busId     业务id，用于区分发送场景
     */
    public MailCredential(String sessionId, String mail, String busId) {
        this.mail = mail;
        this.sessionId = sessionId;
        this.busId = busId;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    @Override
    public String id() {
        return String.format("%s-%s-%s", sessionId, mail, busId);
    }
}
