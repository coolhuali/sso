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
 * @author Carl
 * @date 2017/11/2
 * @since 2.3.8
 */
public interface IValidateService<T extends Credential, O extends ValidateCredential> {
    /**
     * 发送数据
     *
     * @param t
     */
    void send(T t) throws ValidateSenderException;
    /**
     * 校验
     *
     * @param o
     * @return
     */
    ValidateResult validate(O o);
}
