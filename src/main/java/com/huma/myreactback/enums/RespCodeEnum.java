package com.huma.myreactback.enums;

/**
 * 返回码定义
 *
 * @author hudenian
 * @date 2021/11/29
 */
public enum RespCodeEnum {
    /**
     * 成功
     */
    SUCCESS(10000, "SUCCESS"),

    /**
     * 失败
     */
    FAIL(20000, "FAIL"),

    /**
     * 参数类型错误
     */
    PARAM_TYPE_ERROR(20001, "Param type error"),

    /**
     * 请求方式错误
     */
    REQUEST_METHOD_ERROR(20002, "Request method error"),

    /**
     * 参数格式错误
     */
    PARAM_FORMAT_ERROR(20003, "Param format error"),

    /**
     * 请求参数错误
     */
    PARAM_ERROR(20004, "Request param error"),

    /**
     * 请求头不包含token
     */
    UN_TOKEN(20005, "Missing parameters TOKEN"),

    /**
     * 用户未登录
     */
    UN_LOGIN(20006, "User not login"),

    /**
     * token invalid
     */
    TOKEN_INVALID(20007, "Token invalid"),

    /**
     * user not exist
     */
    USER_NOT_EXIST(20008, "User not exist"),

    /**
     * 业务失败
     */
    BIZ_FAILED(20009, "Business failed"),

    /**
     * 系统异常
     */
    EXCEPTION(30000, "System exception,please contact the administrator"),

    /**
     * 业务异常
     */
    BIZ_EXCEPTION(30001, "Business exception"),

    /**
     * nonce invalid
     */
    NONCE_INVALID(30002, "Nonce invalid");

    private final int code;
    private final String msg;

    RespCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
