/*
 * Copyright© 2013-2018 YZTC 
 * Author zhenghl 
 * 本公司保留所有下述内容的权利; 
 * 本内容为保密信息，仅限本公司内部使用; 
 * 非经本公司书面许可，任何人不得外泄或用于其他目的; 
*/
package com.carl.sso.support.captcha.action;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Carl
 * @date 2017/10/30
 * @since
 */
public class CaptchaAwareFactory {
    private Map<String, ICaptchaAware> awareRelation = new HashMap<>();

    public void register(ICaptchaAware aware) {
        awareRelation.put(aware.id(), aware);
    }

    public ICaptchaAware get(String id) {
        return awareRelation.get(id);
    }

    @PostConstruct
    private void afterInit() {
        register(DefaultCaptchaAware.newInstance("findAccount", "sendInstructions", "resetPassword"));
    }
}
