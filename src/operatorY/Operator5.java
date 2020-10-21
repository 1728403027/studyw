package operatorY;
/*
赋值运算符：
 基本的赋值运算符：==
 扩展的赋值运算符：+=、-=、*=、/=...
 */

public class Operator5 {
    public static void main(String[] args) {
        //定义变量
        //把10赋值给心态类型的变量a
        int a=10;

        //+=的操作
        //拿+=的左边和右边的数据做+然后把结果赋值给左边
        a+=20;
        System.out.println("a的值："+a);

        //注意:扩展的赋值运算符，隐含了强制类型转换
        //有一个变量a，a+=10；
        //相当于：a=（a的数据类型）（a+10）
       double s=1;
        s+=1;
        System.out.println(s);
    }
}
