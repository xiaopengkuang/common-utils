package com.byrd.common.common.util;

import com.alibaba.fastjson.JSONObject;

/**
 * @author kuangxiaopeng
 * @version 0.1
 * @description
 * @date 19-10-19
 */
public class JsonUtil {

    /**
     * 转换数据结构
     */
    public static <T> T convertObject(Object object, Class<T> clazz) {
        T data = null;

        if (object == null) {
            return data;
        }

        try {
            String jsonStr = toJsonString(object);
            data = JSONObject.parseObject(jsonStr, clazz);
        } catch (Exception e) {
        }

        return data;
    }

    /**
     * 转换数据
     */
    public static <T> T parseObject(String text, Class<T> clazz) {
        T data = null;

        if (StringUtil.isEmpty(text)) {
            return data;
        }

        try {
            data = JSONObject.parseObject(text, clazz);
        } catch (Exception e) {
        }

        return data;
    }

    /**
     * 将数据结构转换成string
     */
    public static String toJsonString(Object object) {
        try {
            return JSONObject.toJSONString(object);
        } catch (Exception e) {
            return StringUtil.EMPTY_STRING;
        }
    }
}
