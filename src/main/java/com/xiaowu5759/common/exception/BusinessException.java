package com.xiaowu5759.common.exception;


import com.xiaowu5759.common.result.ErrCodeEnum;

/**
 * 通用业务异常类，向上抛出处理
 *
 * @author xiaowu
 * @date 2020/7/7 10:14
 */
public abstract class BusinessException extends RuntimeException {
    private String errCode;

    private String errMsg;

    public String getErrCode() {
        return errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

//    public  BusinessException(){
//        super();
//    }

    // 为了和Exception融合，给它添加message
    // 可以打印出，Resolved [com.xiaowu5759.springbootmaven.domain.exception.UserException: errCode: A0001, errMsg: 用户端错误]
    BusinessException(ErrCodeEnum errCodeEnum){
        super("errCode: " + errCodeEnum.getErrCode() + ", errMsg: " + errCodeEnum.getErrMsg());
        this.errCode = errCodeEnum.getErrCode();
        this.errMsg = errCodeEnum.getErrMsg();
    }
}
