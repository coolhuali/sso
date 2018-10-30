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
 * @since
 */
public interface ICaptchaAware {
    /**
     * 识别的id流转
     * @return
     */
    String id();
    /**
     * 成功流转
     * @return
     */
    String success();
    /**
     * 失败流转
     * @return
     */
    String fail();
}
