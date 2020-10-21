package InterfaceY;

/*
匿名对象：没有名字的对象

匿名对象的应用场景
    当方法只调用一次的时候就可以使用匿名对象
    可以当做参数进行传递，但是无法在传参之前做其他的事情
注意：匿名对象可以调用成员变量并赋值，但是赋值并没有有意义
 */
public class Anonymous {
    public static void main(String[] args) {
        new Stdent().eat();//匿名对象，没有变量引用的对象
    }
}

class Stdent {
    public void eat() {
        System.out.println("吃东西");
    }
}