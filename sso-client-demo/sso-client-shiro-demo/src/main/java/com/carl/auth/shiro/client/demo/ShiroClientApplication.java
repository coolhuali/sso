/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */



package com.carl.auth.shiro.client.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Carl
 * @date 2017/10/8
 * @since 1.5.0
 */
@SpringBootApplication
@EnableAspectJAutoProxy
public class ShiroClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShiroClientApplication.class, args);
    }
}
