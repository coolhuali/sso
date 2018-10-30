/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */
package com.carl.sso.support.validate;
/**
 * @param <T> 发送信息
 * @param <I> 构建信息
 * @author Carl
 * @date 2017/11/2
 * @since
 */
public interface InformativeGenerator<T extends Informative, I extends Credential> {
    /**
     * 生成发送信息
     * @param i
     * @return
     */
    T generate(I i);
}
