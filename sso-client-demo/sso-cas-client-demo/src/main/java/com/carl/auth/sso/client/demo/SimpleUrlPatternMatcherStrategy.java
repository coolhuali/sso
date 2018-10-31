/*
 * Copyright© 2013-2018 YZTC 
 * Author zhenghl 
 * 本公司保留所有下述内容的权利; 
 * 本内容为保密信息，仅限本公司内部使用; 
 * 非经本公司书面许可，任何人不得外泄或用于其他目的; 
*/
package com.carl.auth.sso.client.demo;

import org.jasig.cas.client.authentication.UrlPatternMatcherStrategy;
import org.jasig.cas.client.session.SingleSignOutHttpSessionListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Carl
 * @date 2017/9/28
 * @since 1.5.0
 */
public class SimpleUrlPatternMatcherStrategy implements UrlPatternMatcherStrategy {
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public boolean matches(String url) {
        logger.debug("访问路径：" + url);
        return url.contains("zhangsan.jsp");
    }

    @Override
    public void setPattern(String pattern) {
        SingleSignOutHttpSessionListener d = new SingleSignOutHttpSessionListener();
    }
}
