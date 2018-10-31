/*
 * Copyright© 2013-2018 YZTC 
 * Author zhenghl 
 * 本公司保留所有下述内容的权利; 
 * 本内容为保密信息，仅限本公司内部使用; 
 * 非经本公司书面许可，任何人不得外泄或用于其他目的; 
*/
package com.carl.sso.support.captcha.imp.cage;

import com.github.cage.token.RandomTokenGenerator;
import com.carl.sso.support.captcha.string.StringTokenGenerator;

/**
 * cage字符串生成器
 *
 * @author Carl
 * @date 2017/10/27
 * @since 2.3.8
 */
public class CageStringTokenGenerator extends StringTokenGenerator {
    private RandomTokenGenerator generator = new RandomTokenGenerator(null, 4, 0);

    @Override
    public String generator() {
        return generator.next();
    }
}
