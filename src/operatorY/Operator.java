package operatorY;
/*
运算符：就是用于对常量和变量进行操作的符号

  表达式：用运算符连接起来的符合Java语法的式子，不同的运算符连接的表达式是不同类型的表达式
     举例：int a=10, int b=20；
     a+b

   运算符分类：
    算术运算符
    赋值运算符
    关系运算符
    逻辑运算符
    三元运算符

  算术运算符：
    +、-、*、%、++、--

 */
public class Operator {
    public static void main(String[] args) {
        int a=10;
        int b=100;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        //整数相除只能得整数，想要得到小数，就必须有浮点数参与运算,所以必须把一个数据类型转换成浮点型的数据类型
        double c=a;
        System.out.println(c/b);
        float s=b;
        System.out.println(a/s);
    }
}
