package com.byrd.common.http.util;

import com.byrd.common.common.constant.CommonConstants;
import com.byrd.common.common.util.JsonUtil;
import com.byrd.common.common.util.StringUtil;
import com.byrd.common.http.model.BaseRequest;
import com.byrd.common.http.model.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class CommonResponseUtil {
    private static Logger logger = LoggerFactory.getLogger(CommonResponseUtil.class);

    private CommonResponseUtil() {
    }

    public static <T extends BaseResponse> T executePostRequest(String baseAddress, String method, BaseRequest<T> request, boolean printLog, String issue) {
        //  构建请求参数
        HashMap<String, String> para = buildParaMap(request);

        T response = null;
        try {
            String responseBody = HttpUtil.doPost(baseAddress,
                    method,
                    CommonConstants.EMPTY_MAPS,
                    CommonConstants.EMPTY_MAPS,
                    para
            );

            // 转换响应结果
            if (printLog) {
                logger.info("【{}】响应结果：{}", issue, responseBody);
            }

            if (StringUtil.isNotEmpty(responseBody)) {
                response = JsonUtil.parseObject(responseBody, request.getResponseClass());
            }
        } catch (Exception e) {
            logger.error("【{}】异常：{}", issue, e.getMessage());
        }

        return response;
    }

    public static <T extends BaseResponse> T executeJsonPostRequest(String baseAddress, String method, BaseRequest<T> request, boolean printLog, String issue) {
        //  构建请求参数

        T response = null;
        try {
            String responseBody = HttpUtil.doPostWithJson(baseAddress,
                    method,
                    CommonConstants.EMPTY_MAPS,
                    request
            );

            // 转换响应结果
            if (printLog) {
                logger.info("【{}】响应结果：{}", issue, responseBody);
            }

            if (StringUtil.isNotEmpty(responseBody)) {
                response = JsonUtil.parseObject(responseBody, request.getResponseClass());
            }
        } catch (Exception e) {
            logger.error("【{}】异常：{}", issue, e.getMessage());
        }

        return response;
    }

    private static <T extends BaseResponse> HashMap<String, String> buildParaMap(BaseRequest<T> request) {
        HashMap<String, Object> paraData = JsonUtil.convertObject(request, HashMap.class);
        HashMap<String, String> para = new HashMap<>();
        for (Map.Entry<String, Object> entry : paraData.entrySet()) {
            para.put(entry.getKey(), StringUtil.getString(entry.getValue()));
        }

        return para;
    }

    public static <T extends BaseResponse> T executeGetRequest(String baseAddress, String method, BaseRequest<T> request, boolean printLog, String issue) {
        //  构建请求参数
        HashMap<String, String> para = buildParaMap(request);

        T response = null;
        try {
            String responseBody = HttpUtil.doGet(baseAddress,
                    method,
                    CommonConstants.EMPTY_MAPS,
                    para
            );

            // 转换响应结果
            if (printLog) {
                logger.info("【{}】响应结果：{}", issue, responseBody);
            }

            if (StringUtil.isNotEmpty(responseBody)) {
                response = JsonUtil.parseObject(responseBody, request.getResponseClass());
            }
        } catch (Exception e) {
            logger.error("【{}】异常：{}", issue, e.getMessage());
        }

        return response;
    }
}
