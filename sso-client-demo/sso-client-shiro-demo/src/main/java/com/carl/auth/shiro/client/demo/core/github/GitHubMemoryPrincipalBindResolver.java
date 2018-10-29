/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */



package com.carl.auth.shiro.client.demo.core.github;

import com.carl.auth.shiro.client.demo.core.PrincipalBindResolver;
import io.buji.pac4j.subject.Pac4jPrincipal;

import java.util.List;

/**
 * github内存id取决器
 *
 * @author Carl
 * @date 2017/10/8
 * @since 1.5.0
 */
public class GitHubMemoryPrincipalBindResolver implements PrincipalBindResolver {
    private List<String> idStorage;

    public GitHubMemoryPrincipalBindResolver(List<String> idStorage) {
        this.idStorage = idStorage;
    }

    public List<String> getIdStorage() {
        return idStorage;
    }

    public void setIdStorage(List<String> idStorage) {
        this.idStorage = idStorage;
    }

    @Override
    public boolean isBind(String id) {
        return this.idStorage.contains(id);
    }

    @Override
    public void bind(Pac4jPrincipal principal, Object user) {
        //添加即为绑定，因为切面那边判断访问首页时，是否已经在当前容器存在该用户
        getIdStorage().add(user.toString());
    }
}
