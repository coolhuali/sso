/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */
package com.carl.sso.support.single.service;
import java.util.List;
/**
 * 用户认证识别器
 *
 * @author Carl
 * @version 创建时间：2017/11/29
 */
public interface IUserIdObtainService {
    /**
     * 通过登录方式查询其他的id
     *
     * @param clientName 登录方式
     * @param id         用户id
     * @return 所有用户id
     */
    List<String> obtain(String clientName, String id);
}
