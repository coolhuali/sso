/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */



package com.carl.sso.support.validate;

import java.io.Serializable;

/**
 * @author Carl
 * @date 2017/11/2
 * @since 2.3.8
 */
public interface Informative extends Credential, Serializable {
    /**
     * 有效时间秒, -1 无限制
     *
     * @return
     */
    long effective();

    /**
     * 创建时间
     *
     * @return
     */
    long time();
}
