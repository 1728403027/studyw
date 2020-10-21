package apiY;

import java.util.Date;

/*
Date:表示特定的瞬间，精确到毫秒，他可以通过方法来设定自己所表示的时间，可以表示任意时间
System.currentTimeMillis():返回的是当前时间，1970-1-1到至今

构造方法：
  date（）：创建的是一个表示当前系统时间的date对象
  date（long date）：根据“指定时间”创建达特对象

  date的常用方法：
   毫秒值转换成date
      设置
      返回值是void，参数long
      void setTime（long time）
      date（long date）
     date转换毫秒值
     获取
     返回long，无参数
     long getTime（）
 */
public class DateY {
    public static void main(String[] args) {
        method();
        method02();
        method04();
        method03();

    }

    public static void method03() {
        //毫秒值转换成date
        Date d = new Date();
        Date da = new Date(1602755444055L);
        d.setTime(1602755444055L);
        System.out.println(d.toLocaleString());
        System.out.println(d.toLocaleString());
    }

    public static void method04() {
        //date转换成毫秒值
        Date d = new Date();
        System.out.println(d.toLocaleString());
        //1602755215021
        System.out.println(d.getTime());
    }

    public static void method02() {
        //date（long date）
        Date d = new Date((1000 * 60 * 60 * 24) * 365L);
        System.out.println(d);
        System.out.println(d.toLocaleString());
    }

    //date
    public static void method() {
        Date d = new Date();
        //Thu Oct 15 17:25:10 CST 2020
        System.out.println(d);
        //2020年10月15日 下午5:25:10
        System.out.println(d.toLocaleString());
    }
}
