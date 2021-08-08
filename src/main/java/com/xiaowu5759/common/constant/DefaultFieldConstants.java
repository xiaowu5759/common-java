package com.xiaowu5759.common.constant;

import cn.hutool.core.date.DateUtil;

import java.util.*;

/**
 * 参考js中六大数据类型
 * number
 * string
 * boolean
 * undefined 使用var声明了变量，但未给变量初始化值
 * null null类型被看做空对象指针，前文说到null类型也是空的对象引用
 * object {}
 * 时空属性
 *
 * @author xiaowu
 * @date 2021/6/22 11:28 AM
 */
public final class DefaultFieldConstants {

    private DefaultFieldConstants(){}

    // 默认int是0
    public static final Integer NumberVal = 0;

    // 默认string是 ''
    public static final String StringVal = "";

    // 默认boolean
    public static final Boolean BooleanVal = false;

    // 默认时间是 '1970-01-01 00:00:00'
    // 默认北京时间
    public static final Date DateVal = DateUtil.parse("1970-01-01 08:00:00", "yyyy-MM-dd HH:mm:ss");

    // 来自java开发手册，嵩山版
    // 前后端数据列表相关的接口返回，如果为空，则返回空数组[]或空集合{}
    public static final Map<String, Object> ObjectVal = new HashMap<>();

    public static final List<Object> ArrayVal = new ArrayList<>();

}
