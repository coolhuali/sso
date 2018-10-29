/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */



package com.carl.sso.support.captcha;

/**
 * 验证码常亮
 *
 * @author Carl
 * @date 2017/10/27
 * @since
 */
public interface CaptchaConstants {
    /**
     * 验证码存储常量，可以存储session等等
     */
    String STORE_CODE = "captcha_code";
    /**
     * 请求路径
     */
    String REQUEST_MAPPING = "/captcha";
}
