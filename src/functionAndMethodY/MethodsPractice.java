package functionAndMethodY;

import java.util.Scanner;

/*
有明确返回值的方法练习
 */
public class MethodsPractice {
    //比较值的大小
    public static String compare(int a,int b){
        if (a>b){
            return "a";
        }else if (a<b){
            return "b";
        }else {
            return "00";
        }
    }
   //比较值是否相等
    public  static  String equal(String c,String v) {
        if (c .equals(v)) {
            return "值相等";
        } else {
            return "值不相等";
        }
    }

    //比较三个数的最大值
    public  static  int max(int q,int w,int e){
        if (q>=w&&q>=e){
            return q;
        }else if (w>=q&&w>=e){
            return w;
        }else  {
            return e;
        }
    }

    public static void main(String[] args) {
//        //三个要比较大小
        Scanner s=new Scanner(System.in);
        Scanner k=new Scanner(System.in);
        Scanner y=new Scanner(System.in);
        System.out.println("请输入三个要比较的值");
        int q=s.nextInt();
        int w=k.nextInt();
        int e=y.nextInt();
        int f=max(q,w,e);


        if (f==q){
            System.out.println("最大值"+f);

        }else if (f==w){
            System.out.println("最大值"+f);
        }else if (f==e){
            System.out.println("最大值"+f);
        } else {
            System.out.println(f);
        }

//        //两个要比较大小
//        Scanner l=new Scanner(System.in);
//        Scanner n=new Scanner(System.in);
//        System.out.println("请输入两个要比较大小的值");
//        int a=l.nextInt();
//        int b=n.nextInt();
//        int m=compare(a,b);
//        if (m==00){
//            System.out.println("你输入的值有误");
//        }else {
//            System.out.println(m);
//        }
//
//
//        //两个要比较是否相等
//        Scanner o=new Scanner(System.in);
//        Scanner p=new Scanner(System.in);
//        System.out.println("请输入两个内容是否相等");
//        String v=o.next();
//        String c=p.next();
//        String t=equal(v,c);
//        System.out.println(t);
    }
}
