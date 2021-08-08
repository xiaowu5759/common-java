package com.xiaowu5759.common.exception;


import com.xiaowu5759.common.result.ErrCodeEnum;

/**
 * 用户端错误
 *
 * @author xiaowu
 * @date 2020/7/7 15:09
 */
public class UserException extends BusinessException{
    // 构造函数
    public UserException(){
        super(ErrCodeEnum.USER_ERROR);
    }

    public UserException(ErrCodeEnum errCodeEnum){
        super(errCodeEnum);
    }

}
