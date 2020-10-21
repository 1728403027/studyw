package overloadingY;

import java.util.Scanner;

/*
方法重载练习
 */
public class OverloadingPractice {
    //比较俩个数据是否相等，参数类型分别是两个int、byte、short、long类型，每个两个
    //byte类型
    public static byte equal(byte a,byte b){
        if (a==b){
            return 1;
        }else {
            return 0;
        }
    }
    //int类型
    public static int equal(int a,int b){
        if (a==b){
            return 1;
        }else {
            return 0;
        }
    }
    //long类型
    public static long equal(long a,long b){
        if (a==b){
            return 1;
        }else {
            return 0;
        }
    }
    //short类型
    public  static short equal(short a, short b){
        if (a==b){
            return 1;
        }else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Scanner v=new Scanner(System.in);
        System.out.println("请输入你要比较的两个数值");
        int a=s.nextInt();
        int b=v.nextInt();
        //byte类型
       int n=equal(a,b);
//        //int类型
//        int n=equal(a,b);
//        //long类型
//        int n=equal(a,b);
//        //short类型
//        int n=equal(a,b);
        if (n==1){
            System.out.println("你输入的值相等");
        }else {
            System.out.println("你输入的值不相等");
        }
    }
}
