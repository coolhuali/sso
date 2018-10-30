/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */
package com.carl.sso.support.captcha.imp.cage;
import com.github.cage.Cage;
import com.github.cage.GCage;
import com.carl.sso.support.captcha.string.StringCaptchaWriter;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.OutputStream;
/**
 * http://akiraly.github.io/cage/quickstart.html 验证码库
 *
 * @author Carl
 * @date 2017/10/27
 * @since 2.3.8
 */
public class CageStringCaptchaWriter extends StringCaptchaWriter {
    private Cage cage = new GCage();
    @Override
    public void write(String text, OutputStream outputStream) throws IOException {
        ImageIO.write(cage.drawImage(text),"png", outputStream);
    }
}
