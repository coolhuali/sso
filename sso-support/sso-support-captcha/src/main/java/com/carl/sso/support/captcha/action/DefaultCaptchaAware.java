/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */



package com.carl.sso.support.captcha.action;

/**
 * @author Carl
 * @date 2017/10/30
 * @since 2.3.8
 */
public class DefaultCaptchaAware implements ICaptchaAware {
    private String id;
    private String success;
    private String fail;

    public DefaultCaptchaAware(String id, String success, String fail) {
        this.id = id;
        this.success = success;
        this.fail = fail;
    }

    @Override
    public String id() {
        return id;
    }

    @Override
    public String success() {
        return success;
    }

    @Override
    public String fail() {
        return fail;
    }

    /**
     * 创建对象工具
     * @param id
     * @param success
     * @param fail
     * @return
     */
    public static DefaultCaptchaAware newInstance(String id, String success, String fail) {

        return new DefaultCaptchaAware(id, success, fail);
    }
}
