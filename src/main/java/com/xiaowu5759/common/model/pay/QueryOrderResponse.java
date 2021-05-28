package com.xiaowu5759.common.model.pay;


/**
 * @author xiaowu
 * @date 2021/5/28 2:04 PM
 */
public class QueryOrderResponse {
    /**
     * 以下参数只有微信支付会返回 (在微信付款码支付使用)
     * returnCode returnMsg resultCode errCode errCodeDes
     */
    // SUCCESS/FAIL，此字段是通信标识，
    // 主要使用
    private String returnCode;

    // return_code为FAIL时返回信息为错误原因 ，例如签名失败
    // 主要使用
    private String returnMsg;

    // SUCCESS/FAIL，交易标识
    private String resultCode;

    // 当result_code为FAIL时返回错误代码
    private String errCode;

    // 当result_code为FAIL时返回错误描述
    private String errCodeDes;

    // 订单号
    private String orderId;

    // 订单状态
    private String orderStatus;

    // 交易状态
    private String tradeStatus;

}
