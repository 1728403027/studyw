package InterfaceY;
/*
final关键字（最终修饰符）：修饰符，可以用于修饰类，成员方法和变量
final所修饰的类：不能被继承，不能有子类
final所修饰的方法：不能被重写
final所修饰的变量：不可以被修改的，是常量

 常量：
   字面值常量：1，2，3
   自定义常量：被final修饰的成员变量，一旦初始化则不可改变
注意： 自定义常量必须初始化，可以选择显示初始化和构造初始化
 */
public class FinalY {
    public static void main(String[] args) {
        Mao ma=new Mao();
        ma.aaa();
        //ma.a=20;
    }


}
/*final*/ class God{
    final int a=10;
    final public void eat(){
        System.out.println("吃东西");
    }
}
class Mao extends God{
public void aaa(){
    System.out.println("哈哈哈哈");
}
}