/*
 * 版权所有.(c)2008-2017. 卡尔科技工作室
 */

package com.carl.auth.sso.server;

import org.apache.shiro.crypto.hash.ConfigurableHashService;
import org.apache.shiro.crypto.hash.DefaultHashService;
import org.apache.shiro.crypto.hash.HashRequest;
import org.apache.shiro.util.ByteSource;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Carl
 * @date 2017/9/12
 * @since JDK1.7
 */
public class PasswordSaltTest {
    private String staticSalt = ".";
    private String algorithmName = "SHA-1";
    private String encodedPassword = "admin";
    private String dynaSalt = "jn_admin";
    @Test
    public void test() throws Exception {
        ConfigurableHashService hashService = new DefaultHashService();
        hashService.setPrivateSalt(ByteSource.Util.bytes(this.staticSalt));
        hashService.setHashAlgorithmName(this.algorithmName);
        hashService.setHashIterations(1);
        HashRequest request = new HashRequest.Builder()
                .setSalt(dynaSalt)
                .setSource(encodedPassword)
                .build();
        String res =  hashService.computeHash(request).toHex();
        System.out.println(res);
        System.out.println("7396cf54ad016b2c3bff9324da10f8943c0239a3".equals(res));
    }
}
