/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */



package com.carl.auth.shiro.client.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * @author Carl
 * @date 2017/9/16
 * @since 1.0.0
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(HttpServletRequest request, Model model) {
        //用户详细信息
        Principal principal = request.getUserPrincipal();
        model.addAttribute("user", principal);
        //打开index.html页面
        return "index";
    }
}
