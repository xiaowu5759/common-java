package com.xiaowu5759.common.result;


import com.xiaowu5759.common.exception.BusinessException;

/**
 * 统一返回结果-包装器
 *
 * @author xiaowu
 * @date 2020/7/7 10:35
 */
public class ResultWrapper {

    public static JsonResultVO ok(){
        return new JsonResultVO(ErrorCodeEnum.SUCCESS);
    }

    public static <T> JsonResultVO<T> ok(T data){
        return new JsonResultVO<T>(data);
    }

    public static JsonResultVO fail(){
        return new JsonResultVO(ErrorCodeEnum.SYSTEM_ERROR);
    }

    public static <T> JsonResultVO<T> fail(T data){
        return new JsonResultVO<T>(ErrorCodeEnum.SYSTEM_ERROR, data);
    }

    public static JsonResultVO wrap(ErrorCodeEnum errorCodeEnum){
        return new JsonResultVO(errorCodeEnum);
    }

    public static JsonResultVO wrap(BusinessException e){
        return new JsonResultVO(e.getErrorCode(), e.getErrorMsg());
    }

    public static <T> JsonResultVO<T> wrap(ErrorCodeEnum errorCodeEnum, T data){
        return new JsonResultVO<T>(errorCodeEnum, data);
    }

    public static <T> JsonResultVO<T> wrap(BusinessException e, T data){
        return new JsonResultVO<T>(e.getErrorCode(), e.getErrorMsg(), data);
    }

}
