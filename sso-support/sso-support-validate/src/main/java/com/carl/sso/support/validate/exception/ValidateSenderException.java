/*
 * Copyright© 2013-2018 YZTC 
 * Author zhenghl 
 * 本公司保留所有下述内容的权利; 
 * 本内容为保密信息，仅限本公司内部使用; 
 * 非经本公司书面许可，任何人不得外泄或用于其他目的; 
*/
package com.carl.sso.support.validate.exception;

import com.carl.sso.support.validate.ISender;

/**
 * @author Carl
 * @date 2017/11/2
 * @since 2.3.8
 */
public class ValidateSenderException extends Exception {
    private Class<? extends ISender> clz;

    public ValidateSenderException(Class<? extends ISender> clz) {
        this.clz = clz;
    }

    public ValidateSenderException(String message, Class<? extends ISender> clz) {
        super(message);
        this.clz = clz;
    }

    public ValidateSenderException(String message, Throwable cause, Class<? extends ISender> clz) {
        super(message, cause);
        this.clz = clz;
    }

    public ValidateSenderException(Throwable cause, Class<? extends ISender> clz) {
        super(cause);
        this.clz = clz;
    }

    public ValidateSenderException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace, Class<? extends ISender> clz) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.clz = clz;
    }
}
