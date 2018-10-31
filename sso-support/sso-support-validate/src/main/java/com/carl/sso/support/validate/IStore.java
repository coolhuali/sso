/*
 * Copyright© 2013-2018 YZTC 
 * Author zhenghl 
 * 本公司保留所有下述内容的权利; 
 * 本内容为保密信息，仅限本公司内部使用; 
 * 非经本公司书面许可，任何人不得外泄或用于其他目的; 
*/
package com.carl.sso.support.validate;

/**
 * 验证存储器
 *
 * @author Carl
 * @date 2017/11/2
 * @since 2.3.8
 */
public interface IStore<T extends Informative, I extends Credential> {
    /**
     * 保存验证数据
     */
    void save(T t);

    /**
     * 获取验证数据
     *
     * @param i
     * @return
     */
    T get(I i);

    /**
     *
     * 移除
     */
    void remove(I i);
}
