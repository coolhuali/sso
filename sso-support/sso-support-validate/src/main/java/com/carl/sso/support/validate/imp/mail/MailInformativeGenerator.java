/*
 * Copyright© 2013-2018 YZTC 
 * Author zhenghl 
 * 本公司保留所有下述内容的权利; 
 * 本内容为保密信息，仅限本公司内部使用; 
 * 非经本公司书面许可，任何人不得外泄或用于其他目的; 
*/
package com.carl.sso.support.validate.imp.mail;

import com.carl.sso.support.validate.InformativeGenerator;
import com.carl.sso.support.validate.configuration.MailProperties;

/**
 * @author Carl
 * @date 2017/11/2
 * @since
 */
public class MailInformativeGenerator implements InformativeGenerator<MailInformative, MailCredential> {
    private MailProperties properties;

    public MailInformativeGenerator(MailProperties properties) {
        this.properties = properties;
    }

    @Override
    public MailInformative generate(MailCredential mailCredential) {
        int code = (int) ((Math.random() * 9 + 1) * Math.pow(10, properties.getCodeLen()));
        String strCode = String.valueOf(code);
        MailInformative informative = new MailInformative()
                .setCode(strCode)
                .setEffective(properties.getEffective())
                .setContent(String.format(properties.getContent(), strCode))
                .setFromMail(properties.getFrom())
                .setToMail(mailCredential.getMail())
                .setId(mailCredential.id())
                .setSubject(properties.getSubject());
        return informative;
    }
}
