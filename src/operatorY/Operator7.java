package operatorY;
/*
逻辑运算符；用于连接关系表达式
  &、|、^、!
  &&、||
  &:有则false则false
  |:有true则true
  ^相同则false不同则true
  !truez则false，false则true
 */
public class Operator7 {
    public static void main(String[] args) {
        //定义变量
        int a=10;
        int b=6;
        int c=7;

        //&
        //false&false
        System.out.println((a>b)&(a>c));
        //true&false
        System.out.println((a<b)&(a>c));
       // false&true
        System.out.println((a>b)&(a<c));
        //true&true
        System.out.println((a<b)&(a<c));

        //|
        //false|false
        System.out.println((a>b)|(a>c));
        //true|false
        System.out.println((a<b)|(a>c));
        //false|true
        System.out.println((a>b)|(a<c));
        //true|true
        System.out.println((a<b)|(a<c));


        //^
        //false|false
        System.out.println((a>b)^(a>c));
        //true|false
        System.out.println((a<b)^(a>c));
        //false|true
        System.out.println((a>b)^(a<c));
        //true|true
        System.out.println((a<b)^(a<c));

        //!
        System.out.println((a>b));
        System.out.println(!(a>b));
        System.out.println(!!(a>b));
}
}
