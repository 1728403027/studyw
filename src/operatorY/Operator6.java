package operatorY;
/*
关系运算符
  ==、!=、>、>=、<、<=
  关系运算符的结果都是boolean类型的
  注意事项
    在进行关系运算的时候千万不要把两个等于号写出一个等于号
 */

public class Operator6 {
    public static void main(String[] args) {
        //定义变量
        int a=10;
        int b=20;
        int c=10;

        //==
        System.out.println(a==b);
        System.out.println(a==c);

        //!=
        System.out.println(a!=c);
        System.out.println(a!=b);

        //>
        System.out.println(a>c);
        System.out.println(a>b);

        //>=
        System.out.println(a>=c);
        System.out.println(a>=b);

        //<
        System.out.println(a<c);
        System.out.println(a<b);

        //<=
        System.out.println(a<=c);
        System.out.println(a<=b);

        //注意事项
        System.out.println(a==b);
        //把b的值赋给a，然后把a的值输出出来
        System.out.println(a=b);


    }
}
