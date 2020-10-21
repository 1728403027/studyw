package apiY;

import java.util.Scanner;

/*
需求：判断一个数是否符合int类型的范围
  由于基本数据类型只能做一些简单的操作和运算，所以Java为我们封装了基本数据类型，为每种数据类型提供了包装类
  包装类就是封装类基本数据类型的类，为我们提供了更多复杂的方法和一些变量

基本数据类型     封装
byte            Byte
short           Short
char            Character
int             Integer
long            Long
float           Float
double          Double
boolean         Boolean

Integer:
   string类型转换成int类型
     方法一：int intValue（）
     方法二：static int parseInt（String s）
    int类型转换成string类型
      方法一：+“”
      方法二：string tostring（）

构造方法：
  Integer（int value）
  Integer(string s)
 */
public class IntegerY {

    public static void main(String[] args) {
        putong();
        integerv();
        integerp();
        kongge();
        tostring();
    }

    public static void tostring() {
        //int类型转换成string类型  方法二：string tostring（）
        Integer in=new Integer(20);
        String s=in.toString();
        System.out.println(s);
    }

    public static void kongge() {
        //int类型转换成string类型  方法一：+“”
        int s=10;
        System.out.println(s+"");
    }

    public static void integerp() {
        //string类型转换成int类型 方法二：static int parseInt（String s）
        int s = Integer.parseInt("20");
        System.out.println(s + 20);
    }

    public static void integerv() {
        //string类型转换成int类型 方法一：int intValue（）
        Integer in = new Integer("20");
        int s = in.intValue();
        System.out.println(s + 20);
    }

    public static void putong() {
        //普通判断一个数是否符合int类型的范围
        Scanner ac = new Scanner(System.in);
        System.out.println("请输入一个整数");
        String s = ac.nextLine();
        int a = Integer.parseInt(s);
        int z = 0;
        char[] cha = s.toCharArray();
        for (int i = 0; i < cha.length; i++) {
            if (cha[i] >= '0' && cha[i] <= '9') {
                z++;
            }
        }
        if (z != 0) {
            if (a >= Math.pow(-2, 31) && a <= Math.pow(2, 31) - 1) {
                System.out.println("你输入的值在这个范围内");
            } else {
                System.out.println("你输入的值不在这个范围内");
            }
        } else {
            System.out.println("你输入的整数有误");
        }
    }
}
