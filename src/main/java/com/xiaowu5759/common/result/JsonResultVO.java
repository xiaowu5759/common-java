package com.xiaowu5759.common.result;


/**
 * 统一返回结果-封装类
 *
 * @author xiaowu
 * @date 2020/7/7 10:29
 */
public class JsonResultVO<T> {

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 错误消息
     */
    private String errorMsg;

    /**
     * 数据
     */
    private T data;

    // 包内私有，不允许自定义errCode,errMsg
    JsonResultVO(ErrorCodeEnum errorCodeEnum){
        this.errorCode = errorCodeEnum.getErrorCode();
        this.errorMsg = errorCodeEnum.name();
    }

    JsonResultVO(T data) {
        this.errorCode = ErrorCodeEnum.SUCCESS.getErrorCode();
        this.errorMsg = ErrorCodeEnum.SUCCESS.name();
        this.data = data;
    }

    JsonResultVO(ErrorCodeEnum errorCodeEnum, T data){
        this.errorCode = errorCodeEnum.getErrorCode();
        this.errorMsg = errorCodeEnum.name();
        this.data = data;
    }

    JsonResultVO(String errorCode, String errorMsg){
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    JsonResultVO(String errorCode, String errorMsg, T data){
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.data = data;
    }

    // 统一返回必须要get方法
    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public T getData() {
        return data;
    }
}
