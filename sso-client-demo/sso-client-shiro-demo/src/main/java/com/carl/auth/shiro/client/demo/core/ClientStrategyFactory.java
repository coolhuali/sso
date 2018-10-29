/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */



package com.carl.auth.shiro.client.demo.core;

import java.util.HashMap;
import java.util.Map;

/**
 * 客户端存储器
 *
 * @author Carl
 * @date 2017/10/8
 * @since 1.5.0
 */
public class ClientStrategyFactory {
    private Map<String , ClientStrategy> clientStrategy = new HashMap<>();

    public ClientStrategyFactory(Map<String, ClientStrategy> clientStrategy) {
        this.clientStrategy = clientStrategy;
    }

    public Map<String, ClientStrategy> getClientStrategy() {
        return clientStrategy;
    }
}
