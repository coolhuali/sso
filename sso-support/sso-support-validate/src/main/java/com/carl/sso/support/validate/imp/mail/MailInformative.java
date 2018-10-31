/*
 * Copyright© 2013-2018 YZTC 
 * Author zhenghl 
 * 本公司保留所有下述内容的权利; 
 * 本内容为保密信息，仅限本公司内部使用; 
 * 非经本公司书面许可，任何人不得外泄或用于其他目的; 
*/
package com.carl.sso.support.validate.imp.mail;

import com.carl.sso.support.validate.Informative;
import java.util.Date;

/**
 * @author Carl
 * @date 2017/11/2
 * @since
 */
public class MailInformative implements Informative {
    private String fromMail;
    private String toMail;
    private String subject;
    private String content;
    private String code;
    private long effective;
    private String id;

    public String getFromMail() {
        return fromMail;
    }

    public MailInformative setFromMail(String fromMail) {
        this.fromMail = fromMail;
        return this;
    }

    public String getToMail() {
        return toMail;
    }

    public MailInformative setToMail(String toMail) {
        this.toMail = toMail;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    public MailInformative setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public String getContent() {
        return content;
    }

    public MailInformative setContent(String content) {
        this.content = content;
        return this;
    }

    public String getCode() {
        return code;
    }

    public MailInformative setCode(String code) {
        this.code = code;
        return this;
    }

    public long getEffective() {
        return effective;
    }

    public MailInformative setEffective(long effective) {
        this.effective = effective;
        return this;
    }

    public String getId() {
        return id;
    }

    public MailInformative setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public long effective() {
        return getEffective();
    }

    @Override
    public long time() {
        return new Date().getTime();
    }

    @Override
    public String id() {
        return getId();
    }
}
