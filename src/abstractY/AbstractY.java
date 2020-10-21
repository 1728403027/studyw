package abstractY;

/*
抽象类：
 abstract；关键字，用于修饰方法和类
 抽象方法：不同的方法是相似，但是具体内容又不太一样，所以我们只能抽取他的申明，没有具体的方法，没有具体方法的方法就是抽象方法
 抽象类：有抽象方法的类必须是抽象类

注意：一个类继承了抽象类需要重写他所有的抽象方法，否则这个类就是抽象类
 */
public class AbstractY {
}

abstract class Animal {
    public abstract void eat();

    //非抽象方法子类可以不重写
    public void run() {
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

abstract class Dog extends Animal {

}