/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */
package com.carl.auth.shiro.client.demo.confg.pros;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Carl
 * @date 2017/10/8
 * @since
 */
@Component
@ConfigurationProperties(prefix="github") //接收application.yml中的github下面的属性
public class GithubProperties {
    private List<String> bindId = new ArrayList<>();
    public List<String> getBindId() {
        return bindId;
    }
    public GithubProperties setBindId(List<String> bindId) {
        this.bindId = bindId;
        return this;
    }
}
