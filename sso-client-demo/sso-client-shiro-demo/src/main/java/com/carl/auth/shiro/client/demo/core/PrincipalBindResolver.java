/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */



package com.carl.auth.shiro.client.demo.core;

import io.buji.pac4j.subject.Pac4jPrincipal;

/**
 * 判断用户是否已经绑定
 *
 * @author Carl
 * @date 2017/10/8
 * @since 1.5.0
 */
public interface PrincipalBindResolver {
    /**
     * 判断用户是否已经绑定
     *
     * @param id
     * @return
     */
    boolean isBind(String id);

    /**
     * 把当前用户绑定到实际的用户数
     *
     * @param principal 当前用户
     * @param user      目标用户
     */
    void bind(Pac4jPrincipal principal, Object user) throws Exception;
}
