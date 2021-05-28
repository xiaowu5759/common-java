package com.xiaowu5759.common;

import com.xiaowu5759.common.util.spring.SpringUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * @author xiaowu
 * @date 2021/5/28 4:18 PM
 */
@Import(SpringUtils.class)
@ComponentScan(basePackages = {"com.xiaowu5759.*"})
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
        System.out.println("只有一个主方法");
    }

    private static void m1(){

    }
}
