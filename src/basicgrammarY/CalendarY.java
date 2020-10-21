package basicgrammarY;

import java.util.Calendar;

/*
Calendar: 日历，提供个一些操作年月日时的方法
calendar。getInstance（）：使用默认时区获取日历
获取：int get（int field）：返回指定日历字段的值
修改：void set（int field，int value）：把指定的字段修改成指定的值
增加：void add（int field，int amount）：在指定的字段加上指定的值

 */
public class CalendarY {
    public static void main(String[] args) {
        calendarget();
        calendarset();
        calendaradd();

    }

    public static void calendaradd() {
        //增加：void add（int field，int amount）：在指定的字段加上指定的值
        Calendar ca=Calendar.getInstance();
        ca.add(Calendar.YEAR,10);
        int n=ca.get(Calendar.YEAR);
        //月 要加一不然不系统的少一个月
        int y=ca.get(Calendar.MONTH)+1;
        //日
        int r=ca.get(Calendar.DAY_OF_MONTH);
        System.out.println(n+"年"+y+"月"+r+"日");
    }

    public static void calendarset() {
        //修改：void set（int field，int value）：把指定的字段修改成指定的值
        Calendar ca=Calendar.getInstance();
        ca.set(Calendar.YEAR,2021);
        int n=ca.get(Calendar.YEAR);
        //月 要加一不然不系统的少一个月
        int y=ca.get(Calendar.MONTH)+1;
        //日
        int r=ca.get(Calendar.DAY_OF_MONTH);
        System.out.println(n+"年"+y+"月"+r+"日");
    }

    public static void calendarget() {
        //获取：int get（int field）：返回指定日历字段的值
        Calendar ca=Calendar.getInstance();
        //年
        int n=ca.get(Calendar.YEAR);
        //月 要加一不然不系统的少一个月
        int y=ca.get(Calendar.MONTH)+1;
        //日
        int r=ca.get(Calendar.DAY_OF_MONTH);
        System.out.println(n+"年"+y+"月"+r+"日");
    }
}
