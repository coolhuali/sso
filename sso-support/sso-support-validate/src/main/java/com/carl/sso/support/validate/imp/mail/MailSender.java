/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */
package com.carl.sso.support.validate.imp.mail;
import com.carl.sso.support.validate.ISender;
import com.carl.sso.support.validate.exception.ValidateSenderException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
/**
 * @author Carl
 * @date 2017/11/2
 * @since
 */
public class MailSender implements ISender<MailInformative> {
    private JavaMailSender mailSender;
    public MailSender(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }
    @Override
    public void send(MailInformative informative) throws ValidateSenderException {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(informative.getFromMail());//发送者.
        message.setTo(informative.getToMail());//接收者.
        message.setSubject(informative.getSubject());//邮件主题.
        message.setText(informative.getContent());//邮件内容.
        mailSender.send(message);//发送邮件
    }
}
