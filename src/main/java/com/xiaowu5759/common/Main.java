package com.xiaowu5759.common;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.xiaowu5759.common.config.JDBCProperties;
import com.xiaowu5759.common.constant.DateFormatConstants;
import com.xiaowu5759.common.util.ImpulseCharUtils;
import com.xiaowu5759.common.util.spring.SpringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.util.Date;

/**
 * @author xiaowu
 * @date 2021/5/28 4:18 PM
 */
@Import(SpringUtils.class)
@ComponentScan(basePackages = {"com.xiaowu5759.*"})
public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
        JDBCProperties jdbcProperties = SpringUtils.getBean(JDBCProperties.class);
        System.out.println("只有一个主方法");
        System.out.println(jdbcProperties.getUsername());
        m2();
    }

    private static void m1(){
        // subString，取头不取尾
//        String hello = "helloworld";
//        String hell = "hell";
//        System.out.println(hello.length());
//        System.out.println(hell.length());
//
//        String helloS = hello.substring(hell.length(), hello.length());
//        System.out.println(helloS);

        String targetSys = "WXPay";
        log.info("【银联商务回调】targetSys={}", targetSys);
        if(StrUtil.isBlank(targetSys) || !("WXPay".equals(targetSys) || targetSys.contains("Alipay"))){
            log.info("【银联商务回调】targetSys进入");
        }
    }

    private static void m2(){
        Date beginDate = DateUtil.parse("2021-06-06 00:00:00", "yyyy-MM-dd HH:mm:ss");
        Date endDate = DateUtil.parse("2021-06-07 00:02:00", "yyyy-MM-dd HH:mm:ss");

        long between = DateUtil.between(beginDate, endDate, DateUnit.DAY);
        System.out.println(between);
//        System.out.println(DateUtil.format(beginTime, DateFormatConstants.YYYY_MM_DD_HH_MM_SS));
//        System.out.println(DateUtil.format(endTime, DateFormatConstants.YYYY_MM_DD_HH_MM_SS));
    }
}
