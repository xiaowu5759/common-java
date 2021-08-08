package com.xiaowu5759.common.exception;


import com.xiaowu5759.common.result.ErrCodeEnum;

/**
 * 调用第三方服务出错
 *
 * @author xiaowu
 * @date 2020/7/7 16:29
 */
public class ServiceException extends BusinessException{
    public ServiceException(){
        super(ErrCodeEnum.SERVICE_ERROR);
    }

    public ServiceException(ErrCodeEnum errCodeEnum){
        super(errCodeEnum);
    }
}
