package com.xiaowu5759.common.model.pay;


/**
 * @author xiaowu
 * @date 2021/5/28 2:09 PM
 */
public class QueryUmsOrderRequest {

    private String msgSrc;

    private String msgType = "bills.query";

    private String requestTimestamp;

    /**
     * 商户号
     */
    private String mid;

    /**
     * 终端号
     */
    private String tid;

    private String instMid;

    private String signType = "SHA256";

    private String sign;

    private String billNo;

    /**
     * 订单时间
     * yyyy-MM-dd
     */
    private String billDate;
}
