/*
 * Copyright© 2013-2018 YZTC 
 * Author zhenghl 
 * 本公司保留所有下述内容的权利; 
 * 本内容为保密信息，仅限本公司内部使用; 
 * 非经本公司书面许可，任何人不得外泄或用于其他目的; 
*/
package com.carl.auth.shiro.client.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

/**
 * @author Carl
 * @date 2017/9/16
 * @since 1.0.0
 */
@RestController()
@RequestMapping("/user")
public class UserController {
    @GetMapping("/{id}")
    public Object user(@PathVariable(value = "id") String id) {
        return "users page:" + id;
    }

    @GetMapping("/detail")
    public Object detail(HttpServletRequest request) {
        return request.getUserPrincipal();
    }
}
