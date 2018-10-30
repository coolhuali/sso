/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */
package com.carl.sso.support.validate.imp.mail;
import com.carl.sso.support.validate.IStore;
import java.util.HashMap;
import java.util.Map;
/**
 * @author Carl
 * @date 2017/11/2
 * @since 2.3.8
 */
public class MailMemoryStore implements IStore<MailInformative, MailCredential> {
    private Map<String, MailInformative> store = new HashMap<>();
    @Override
    public void save(MailInformative mailInformative) {
        store.put(mailInformative.id(), mailInformative);
    }
    @Override
    public MailInformative get(MailCredential mailCredential) {
        return store.get(mailCredential.id());
    }
    @Override
    public void remove(MailCredential mailCredential) {
        store.remove(mailCredential.id());
    }
}
