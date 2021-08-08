package com.xiaowu5759.common.exception;


import com.xiaowu5759.common.result.ErrorCodeEnum;

/**
 * 通用业务异常类，向上抛出处理
 *
 * @author xiaowu
 * @date 2020/7/7 10:14
 */
public abstract class BusinessException extends RuntimeException {
    private String errorCode;

    private String errorMsg;

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

//    public  BusinessException(){
//        super();
//    }

    // 为了和Exception融合，给它添加message
    // 可以打印出，Resolved [com.xiaowu5759.springbootmaven.domain.exception.UserException: errCode: A0001, errMsg: 用户端错误]
    BusinessException(ErrorCodeEnum errorCodeEnum){
        super("errorCode: " + errorCodeEnum.getErrorCode() + ", errorMsg: " + errorCodeEnum.name());
        this.errorCode = errorCodeEnum.getErrorCode();
        this.errorMsg = errorCodeEnum.name();
    }
}
