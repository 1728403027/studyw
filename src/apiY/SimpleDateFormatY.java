package apiY;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
SimpleDateFormat:
  格式化：
    date转化成string类型
    2049-8-26转化成2049年8月26日
    string format（date date）
   解析：
    string转换成date
    “2049-8-26”
    date parse（string source）

构造方法：
     simpleDateFormat（）：使用默认的模式进行对象的构建
     simpleDateFormat（String pattern）：使用的指定的模式进行对象的构建

注意：Exception in thread "main" java.text.ParseException: Unparseable date: "2020/10/15 下午6:51" 表示的是指定模式和解析的模式不一样的错误
     所以指定的模式和解析的模式要一样
 */
public class SimpleDateFormatY {
    public static void main(String[] args) throws ParseException {
        method();
        method02();
        method03();
        mehtod04();
    }

    public static void mehtod04() throws ParseException {
        //使用指定模式进行构建  年月日时分秒
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        Date d=new Date();
        String s=sdf.format(d);
        System.out.println(s);
        Date da=sdf.parse("2020年10月15日18:54:42");
        System.out.println(da);
    }

    public static void method03() throws ParseException {
        //使用指定模式进行构建  年月日
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
        Date d=new Date();
        String s=sdf.format(d);
        System.out.println(s);
        Date da=sdf.parse(s);
        System.out.println(da);
    }

    public static void method02() throws ParseException {
        //解析
        SimpleDateFormat sdf=new SimpleDateFormat();
        Date d=sdf.parse("2020/10/15 下午6:29");
        System.out.println(d);
    }

    public static void method() {
        //默认格式化
        SimpleDateFormat sdf=new SimpleDateFormat();
        Date da=new Date();
        String f=sdf.format(da);
        System.out.println(f);
    }
}
