package typeconversion;
/*
+:这是一个运算符，用于做加法预算的
   我们在做运算的时候，一般要求参与的运算的数据类型必须一样
  类型转换
   隐形转换
   强制转换

   隐形转换
    byte、short、char、--int--long--float--double   从小到大是可以隐式转换的
 */
public class TypeConversion {
    public static void main(String[] args) {
        //定义个变量
        int a=1;
        int b=2;
        int c=a+b;
        System.out.println(c);

        //定义一个byte类型的变量，一个int类型的变量
        byte bb=2;
        int cc=5;
        System.out.println(cc+bb);

        //我们直接输出这个结果是可以的，说明我们也应该可以接受这个数据
        //我们要求参与运算的数据类型一致，我们应该用什么类型接受呢
        //如果下面这种方法用的话会导致数据失去精准度
        // byte dd= bb+cc；
        //System.out.println(dd);
        int ee=bb+cc;
        System.out.println(ee);
    }
}
