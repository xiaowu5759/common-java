package com.xiaowu5759.common.enums;

/**
 * @author xiaowu
 * @date 2021/5/23 11:00 PM
 */
public enum WeekEnum {

    MONDAY("周一", "Monday", "Mon.", 1),
    TUESDAY("周二", "Tuesday", "Tues.", 2),
    WEDNESDAY("周三", "Wednesday", "Wed.", 3),
    THURSDAY("周四", "Thursday", "Thur.", 4),
    FRIDAY("周五", "Friday", "Fri.", 5),
    SATURDAY("周六", "Saturday", "Sat.", 6),
    SUNDAY("周日", "Sunday", "Sun.", 7);

    String cnName;
    String enName;
    String enShortName;
    int number;

    WeekEnum(String cnName, String enName, String enShortName, int number) {
        this.cnName = cnName;
        this.enName = enName;
        this.enShortName = enShortName;
        this.number = number;
    }

    public String getCnName() {
        return cnName;
    }

    public String getEnName() {
        return enName;
    }

    public String getEnShortName() {
        return enShortName;
    }

    public int getNumber() {
        return number;
    }
}
