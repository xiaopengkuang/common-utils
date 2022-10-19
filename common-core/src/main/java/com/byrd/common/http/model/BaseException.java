package com.byrd.common.http.model;

import com.byrd.common.common.constant.ResultCode;
import lombok.Data;

/**
 * @author muyu
 * @date 2020-10-16
 */
@Data
public class BaseException extends RuntimeException {
    /**
     * 异常编码枚举
     */
    private int code;

    /**
     * 异常描述
     */
    private String message;

    private Object data;

    public BaseException(int code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public BaseException(int code, String message, Object data) {
        super(message);
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public BaseException(String message) {
        this(ResultCode.FAILED, message);
    }

    @Override
    public String getMessage() {
        return message;
    }
}
