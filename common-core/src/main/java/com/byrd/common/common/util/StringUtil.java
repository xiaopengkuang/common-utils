package com.byrd.common.common.util;

import org.apache.commons.lang3.RandomStringUtils;

import java.math.BigDecimal;

/**
 * DESCRIPTION:
 * Created by BYRD on 18/01/2018
 * Version 0.1
 *
 * @author kuangxiaopeng
 */
public class StringUtil {
    public static final String EMPTY_STRING = "";

    public static final String EMPTY_JSON_STRING = "{}";

    public static boolean isEmpty(String value) {
        return null == value || EMPTY_STRING.equals(value.trim());
    }

    public static boolean isNotEmpty(String value) {
        return null != value && !EMPTY_STRING.equals(value.trim());
    }

    /**
     * 获取字符串 默认""
     *
     * @param value
     * @return
     */
    public static String getString(Object value) {
        if (value == null) {
            return EMPTY_STRING;
        }

        if (value instanceof String) {
            return (String) value;
        } else if (value instanceof BigDecimal) {
            return value.toString();
        }

        return String.valueOf(value);
    }

    public static String getRandomString(int length) {
        return RandomStringUtils.randomAlphanumeric(length);
    }

    /**
     * 通过String字符串，分割后得到
     *
     * @param strArr 字符串数组
     * @return Integer 数组
     */
    public static Integer[] stringArrToIntegerArr(String[] strArr) {
        Integer[] tmps = new Integer[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            tmps[i] = Integer.parseInt(strArr[i]);
        }

        return tmps;
    }
}
