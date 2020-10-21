package poymorphicY;
/*
多态的前提：
  子父类的继承关系
  方法重写
  父类引用指向子类对象

  动态绑定：运行期间调用的方法，是根据其具体的类型
 */
public class Poymorphic01 {
    public static void main(String[] args) {
        Animal an=new Cat();
        an.eat();
    }
}


class Animal{
    public void eat(){
        System.out.println("吃东西");
    }
}
class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }
}