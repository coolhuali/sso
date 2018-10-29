/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */



package com.carl.sso.support.single.service;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Carl
 * @version 创建时间：2017/11/29
 */
public class UserIdObtainServiceImpl implements IUserIdObtainService {

    public UserIdObtainServiceImpl() {

    }

    @Override
    public List<String> obtain(String clientName, String id) {
        //由于这里目前只做测试所以只返回当前的id，在正常的情况逻辑应该如下

        //根据校验client以及登录的id找到其他同一个用户的所有校验id返回，如通过邮箱登录的id，通过github登录的id等等
        List<String> ids = new ArrayList<>();
        ids.add(id);
        return ids;
    }
}
