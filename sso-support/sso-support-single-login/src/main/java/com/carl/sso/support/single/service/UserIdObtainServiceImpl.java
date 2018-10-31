/*
 * Copyright© 2013-2018 YZTC 
 * Author zhenghl 
 * 本公司保留所有下述内容的权利; 
 * 本内容为保密信息，仅限本公司内部使用; 
 * 非经本公司书面许可，任何人不得外泄或用于其他目的; 
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
        List<String> ids = new ArrayList<>();
        ids.add(id);
        return ids;
    }
}
