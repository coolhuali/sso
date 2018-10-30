/*
 * Copyright 2018 - YZTC
 * http://www.zxpost.com
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */
package com.carl.sso.support.validate.imp.mail;
import com.carl.sso.support.validate.IStore;
import com.carl.sso.support.validate.IValidator;
import com.carl.sso.support.validate.ValidateResult;
import java.util.Date;
/**
 * @author Carl
 * @date 2017/11/2
 * @since
 */
public class MailValidator implements IValidator<MailValidateCredential> {
    private IStore<MailInformative, MailCredential> store;
    public MailValidator(IStore<MailInformative, MailCredential> store) {
        this.store = store;
    }
    @Override
    public String name() {
        return "mail";
    }
    @Override
    public ValidateResult identify(MailValidateCredential mailValidateCredential) {
        MailInformative informative = store.get(mailValidateCredential);
        if (informative == null) {
            return ValidateResult.FAIL;
        }
        ValidateResult res;
        //未来时间减创建时间大于失效时间
        if ((new Date().getTime() - informative.time()) > informative.effective()) {
            res = ValidateResult.EXPIRED;
            this.store.remove(mailValidateCredential);
        } else if (informative.getCode().equals(mailValidateCredential.data())) {
            res = ValidateResult.SUCCESS;
//            this.store.remove(mailValidateCredential);
        } else {
            res = ValidateResult.FAIL;
        }
        return res;
    }
}
