/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */




package com.carl.sso.support.captcha;

import javax.servlet.http.HttpSession;

/**
 * 会话意识器存储验证码
 *
 * @author Carl
 * @date 2017/10/27
 * @since 2.3.8
 */
public abstract class SessionCaptchaResultAware<T> implements ICaptchaResultAware<HttpSession, T>{
    private ICaptchaResultProvider<HttpSession, T> provider;
    private ITokenGenerator<T> generator;

    public SessionCaptchaResultAware(ICaptchaResultProvider<HttpSession, T> provider, ITokenGenerator<T> generator) {
        this.provider = provider;
        this.generator = generator;
    }

    public ITokenGenerator<T> getGenerator() {
        return generator;
    }

    public ICaptchaResultProvider<HttpSession, T> getProvider() {
        return provider;
    }

    @Override
    public T getAndStore(HttpSession httpSession) {
        T t = getGenerator().generator();
        getProvider().store(httpSession, t);
        return t;
    }
}
