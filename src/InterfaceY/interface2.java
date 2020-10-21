package InterfaceY;
/*
接口成员的特点：
   接口只能有抽象方法
   接口只能有常量
   默认使用public和abstract修饰方法
   只能使用public和abstract修饰方法
   默认使用public static final来修饰成员常量
建议
  大家手动的加上修饰符
注意
   接口不能创建对象（也就是不能实例化）
   类与接口的关系是实现关系，一个类实现一个接口就必须实现接口的所有的抽象方法
 */
public class interface2 {
    public static void main(String[] args) {
        Cat ca=new Cat();
        ca.eat();
    }
}

interface Animal2{
    public static final int a=10;
    public abstract  void eat();
}
class Cat implements Animal2{

    @Override
    public void eat() {

        System.out.println(a+"在玩");
    }
}