/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */



package com.carl.sso.support.validate;

/**
 * @author Carl
 * @date 2017/11/2
 * @since 2.3.8
 */
public interface ValidateCredential extends Credential {
    /**
     * 传入数据
     * @return
     */
    Object data();
}
