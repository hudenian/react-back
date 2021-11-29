package com.huma.myreactback.Vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.huma.myreactback.enums.RespCodeEnum;
import lombok.Data;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseVo<T> {

    private final int code;

    private final String msg;

    private T data;

    private ResponseVo(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private ResponseVo(int code, String msg, T data) {
        this(code, msg);
        this.data = data;
    }

    private ResponseVo(RespCodeEnum respCodeEnum) {
        this(respCodeEnum.getCode(), respCodeEnum.getMsg());
    }

    private ResponseVo(RespCodeEnum respCodeEnum, T data) {
        this(respCodeEnum.getCode(), respCodeEnum.getMsg(), data);
    }

    public static <T> ResponseVo<T> createSuccess() {
        return new ResponseVo<>(RespCodeEnum.SUCCESS);
    }

    public static <T> ResponseVo createFail() {
        return new ResponseVo<>(RespCodeEnum.FAIL);
    }

    public static <T> ResponseVo<T> createSuccess(T data) {
        return new ResponseVo<>(RespCodeEnum.SUCCESS, data);
    }

    public static <T> ResponseVo<T> create(RespCodeEnum respCodeEnum) {
        return new ResponseVo<>(respCodeEnum);
    }

    public static <T> ResponseVo<T> create(int code, String msg) {
        return new ResponseVo<>(code, msg);
    }

}
