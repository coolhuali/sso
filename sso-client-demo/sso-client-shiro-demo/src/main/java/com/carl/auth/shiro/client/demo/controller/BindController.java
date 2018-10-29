/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */



package com.carl.auth.shiro.client.demo.controller;

import com.carl.auth.shiro.client.demo.core.PrincipalBindResolver;
import io.buji.pac4j.subject.Pac4jPrincipal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 绑定页面控制器
 *
 * @author Carl
 * @date 2017/10/9
 * @since
 */
@Controller
public class BindController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private PrincipalBindResolver bindResolver;

    /**
     * 转发绑定页面
     *
     * @param client
     * @return
     */
    @RequestMapping("/bind/{client}")
    public String bindPage(@PathVariable("client") String client, Model model, HttpServletRequest request) {
        Pac4jPrincipal pac4jPrincipal = (Pac4jPrincipal) request.getUserPrincipal();
        model.addAttribute("user", pac4jPrincipal.getProfile().getId());
        return "bind/" + client;
    }

    @RequestMapping("/bind/user")
    public String bindPage(HttpServletRequest request) throws Exception {
        Pac4jPrincipal pac4jPrincipal = (Pac4jPrincipal) request.getUserPrincipal();
        //目前仅仅支持github绑定方式，其他未实现
        logger.info("绑定用户：" + request.getParameter("user"));
        //绑定
        bindResolver.bind(pac4jPrincipal, request.getParameter("user"));
        //返回首页
        return "redirect:/";
    }
}
