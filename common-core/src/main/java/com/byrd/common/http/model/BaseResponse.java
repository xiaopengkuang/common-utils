package com.byrd.common.http.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseResponse implements Serializable {
    private int code;
    private Boolean success;
    private String msg;
}
