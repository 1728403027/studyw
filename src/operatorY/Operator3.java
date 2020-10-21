package operatorY;
/*
 +
   加法运算
     字符参加加法运算，其实是拿字符串在计算机中储存的数据值来参加运算的
       如：'A'  数值65
           'a'  数值97
           '0'  数值48
      字符串参与加法运算，其实做的不是加法运算，而是字符串的拼接
 */
public class Operator3 {
    public static void main(String[] args) {
        //定义变量
        int a=10;
        int b=20;
        System.out.println(a+b);

        //字符参与加法运算
        char c='a';
        System.out.println(a+c);

        //字符串参加运算
        System.out.println("我"+a);
        //字符串在前面的加法运算 因为字符串是string类型  string类型的大于int类型的所以隐形转换成string类型的 所以字符串+a=字符串类型(string)所以运行后就是一个字符串的拼接
        System.out.println("我"+a+b);
        //字符串在后面的加法运算 因为string类型的大于int类型的所以隐形转换成string类型的  a+b=int类型的整数所以a+b+字符串（string）类型的是前面做加法后面做拼接
        System.out.println(a+b+"我");
    }
}
