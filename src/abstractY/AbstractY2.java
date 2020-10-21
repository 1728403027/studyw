package abstractY;
/*
抽象类的特点：
  抽象方法只能在抽象类里面
  抽象方法和抽象类必须被abstract修饰
  抽象类不能创建对象（不能实例化）
  抽象类中可以有非抽象方法
  抽象类和类的关系也是继承
  一个类继承了抽象要么重写所有的抽象方法，要么他自己是抽象类
 */
public class AbstractY2 {
    public static void main(String[] args) {
     Gog2 go=new Gog2();
     go.eat();
     go.run();
     Cat2 ca=new Cat2();
     ca.eat();
     ca.run();
    }
}
abstract  class  Animal2{
    public abstract  void eat();
    public void run(){
        System.out.println("我是动物");
    }
}
class Cat2 extends Animal2{
    public  void eat(){
        System.out.println("猫吃鱼");
    }
}
class Gog2 extends Animal2{
    public void eat(){
        System.out.println("狗吃骨头");
    }
}
