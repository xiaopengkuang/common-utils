package com.byrd.common.http.model;

import java.io.Serializable;

/**
 * @author kuangxiaopeng
 * @version 0.1
 * @description
 * @date 19-10-19
 */
public interface BaseRequest<T extends Serializable> {
    /**
     * 得到当前API的响应结果类型
     *
     * @return 响应类型
     */
    Class<T> getResponseClass();
}
