/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */



package com.carl.sso.support.validate;

import com.carl.sso.support.validate.exception.ValidateSenderException;

/**
 * 校验发送者，发送短信，邮件等
 *
 * @author Carl
 * @date 2017/11/2
 * @since 2.3.8
 */
public interface ISender<T extends Informative> {

    /**
     * @param t
     * @throws ValidateSenderException 发送失败时抛出异常
     */
    void send(T t) throws ValidateSenderException;
}
