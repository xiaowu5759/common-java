package com.xiaowu5759.common.result;


/**
 * 统一返回结果-封装类
 *
 * @author xiaowu
 * @date 2020/7/7 10:29
 */
public class ResultVO<T> {

    /**
     * 错误码
     */
    private String errCode;

    /**
     * 错误消息
     */
    private String errMsg;

    /**
     * 数据
     */
    private T data;

    // 包内私有，不允许自定义errCode,errMsg
    ResultVO(ErrCodeEnum errCodeEnum){
        this.errCode = errCodeEnum.getErrCode();
        this.errMsg = errCodeEnum.getErrMsg();
    }

    ResultVO(T data) {
        this.errCode = ErrCodeEnum.SUCCESS.getErrCode();
        this.errMsg = ErrCodeEnum.SUCCESS.getErrMsg();
        this.data = data;
    }

    ResultVO(ErrCodeEnum errCodeEnum, T data){
        this.errCode = errCodeEnum.getErrCode();
        this.errMsg = errCodeEnum.getErrMsg();
        this.data = data;
    }

    ResultVO(String errCode, String errMsg){
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    ResultVO(String errCode, String errMsg, T data){
        this.errCode = errCode;
        this.errMsg = errMsg;
        this.data = data;
    }

    // 统一返回必须要get方法
    public String getErrCode() {
        return errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public T getData() {
        return data;
    }
}
