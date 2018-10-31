/*
 * Copyright© 2013-2018 YZTC 
 * Author zhenghl 
 * 本公司保留所有下述内容的权利; 
 * 本内容为保密信息，仅限本公司内部使用; 
 * 非经本公司书面许可，任何人不得外泄或用于其他目的; 
*/
/*
 * 版权所有.(c)2008-2017. 卡尔科技工作室
 */
package com.carl.auth.shiro.client.demo.core.github;

import com.carl.auth.shiro.client.demo.core.ClientStrategy;
import com.carl.auth.shiro.client.demo.core.PrincipalBindResolver;
import com.carl.auth.shiro.client.demo.exception.NotBindException;
import io.buji.pac4j.subject.Pac4jPrincipal;
import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * github处理策略
 *
 * @author Carl
 * @date 2017/10/8
 * @since 1.5.0
 */
public class GitHubClientStrategy implements ClientStrategy {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private PrincipalBindResolver resolver;

    public GitHubClientStrategy(PrincipalBindResolver resolver) {
        this.resolver = resolver;
    }

    @Override
    public String name() {
        return "github";
    }

    @Override
    public void handle(JoinPoint joinPoint, Pac4jPrincipal pac4jPrincipal) throws Exception {
        logger.debug("GitHub用户未绑定");
        throw new NotBindException().setClientName(name()).setRedirectUrl("bind/github").setPrincipal(pac4jPrincipal);
    }

    @Override
    public boolean isBind(Pac4jPrincipal principal) {
        return resolver.isBind(principal.getProfile().getId());
    }
}
