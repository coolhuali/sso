/*
 * Copyright© 2013-2018 YZTC 
 * Author zhenghl 
 * 本公司保留所有下述内容的权利; 
 * 本内容为保密信息，仅限本公司内部使用; 
 * 非经本公司书面许可，任何人不得外泄或用于其他目的; 
*/
package com.carl.auth.shiro.client.demo.confg;

import io.buji.pac4j.realm.Pac4jRealm;
import org.apache.shiro.realm.Realm;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Carl
 * @date 2017/10/8
 * @since 1.5.0
 */
@Configuration
public class RealmConfiguration {
    @Bean
    public Realm pac4jRealm() {
        return new Pac4jRealm();
    }
}
