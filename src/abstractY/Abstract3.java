package abstractY;

import org.w3c.dom.ls.LSOutput;

/*
抽象类的成员特点：
  成员变量
    可以有成员变量
    可以有常量
   成员方法
     可以有抽象方法
     可以有非抽象方法
    构造方法
      可以有构造方法的，需要对抽象类的成员变量进行初始化

 final：修饰类、成员变量、成员方法（修饰的不可以被继承）
 */
public class Abstract3 {
    public static void main(String[] args) {
      God3 go=new God3("九尾狐");
      go.eat();
    }
}

abstract class Animal3 {
    String name = "哮天犬";
    final int a = 20;

    public abstract void eat();

    public void run() {
        System.out.println("我是动物");
    }

    public Animal3(String name2) {
        System.out.println(name2+"是猫妖");
    }
}

class God3 extends Animal3 {
    public God3(String name2) {
        super(name2);
    }

    public void eat(){
        System.out.println(name+"吃骨头"+"年龄"+a);
        super.run();
    }

}