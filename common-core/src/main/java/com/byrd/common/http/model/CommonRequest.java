package com.byrd.common.http.model;

/**
 * @author kuangxiaopeng
 * @version 0.1
 * @description 通用基础请求
 * @date 19-10-21
 */
public class CommonRequest implements BaseRequest<CommonResponse> {
    @Override
    public Class<CommonResponse> getResponseClass() {
        return CommonResponse.class;
    }
}
