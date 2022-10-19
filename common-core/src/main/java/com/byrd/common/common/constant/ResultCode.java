package com.byrd.common.common.constant;

/**
 * @author xt
 * @date 2020-10-27
 */
public class ResultCode {
    /**
     * 成功
     */
    public static final int SUCCESS = 20000;

    /**
     * 请求错误
     */
    public static final int BAD_REQUEST = 40000;

    /**
     * 连接失败
     */
    public static final int ACCESS_FAILED = 40003;

    /**
     * 查找失败
     */
    public static final int NOT_FOUND = 40004;

    /**
     * 方法不允许
     */
    public static final int METHOD_NOT_ALLOWED = 40005;

    /**
     * app版本错误，app端必须进行更新
     */
    public static final int APP_VERSION_ERROR = 40007;

    /**
     * 版本冲突
     */
    public static final int VERSION_ERROR = 40009;

    /**
     * 访问服务器失败
     */
    public static final int FAILED = 50000;

    /**
     * 参数缺失
     */
    public static final int PARAMETER_MISSING = 50001;

    /**
     * 参数值格式/值错误
     */
    public static final int PARAMETER_VALUE_ERROR = 50002;
    /**
     * token 缺失
     */
    public static final int OAUTH_CENTER_ERROR = 60000;
    /**
     * token 缺失
     */
    public static final int ACCESS_TOKEN_MISSING = 60001;

    /**
     * 无效token
     */
    public static final int INVALID_ACCESS_TOKEN = 60002;

    /**
     * token 过期
     */
    public static final int ACCESS_TOKEN_EXPIRED = 60003;

    /**
     * token有效，但是用户在该系统还未注册
     */
    public static final int USER_NOT_REGISTERED = 60004;

    /**
     * token有效，但是用户在该系统还未注册
     */
    public static final int USER_NOT_REGISTERED_WITH_THIRDPART = 60005;

    /**
     * token有效，已经被禁用
     */
    public static final int USER_DISABLED = 60006;

    /**
     * token有效，已经被禁用
     */
    public static final int API_KEY_NOT_ALLOWED = 60008;

    /**
     * 目标数据对象不存
     */
    public static final int DATA_OBJECT_NOT_EXIST = 70001;

    /**
     * 目标对象数据已经归档
     */
    public static final int DATA_OBJECT_IS_ARCHIVED = 70002;

    /**
     * 权限不足  需要操作权限
     */
    public static final int NEED_ACCESS_PERMISSION = 70003;
    public static final String NEED_ACCESS_PERMISSION_MESSAGE = "权限不足,需要操作权限";
}
