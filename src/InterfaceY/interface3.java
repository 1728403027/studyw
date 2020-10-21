package InterfaceY;
/*
类与类：继承关系，单继承，多层继承
类与接口：实现关系，多实现
接口与接口的关系：继承关系，多继承
 */
public class interface3 {
    public static void main(String[] args) {
        B b=new B();
        b.A2();
        b.A3();
        b.eta();
    }
}

interface  Animal3{
    public abstract void eta();
}

interface  A2{
    public  abstract void A2();
}
//多继承
interface  A1 extends Animal3,A2{
    public  abstract  void A3();
}
//多实现
class  B implements Animal3,A1{

    @Override
    public void eta() {
        System.out.println("吃");
    }

    @Override
    public void A2() {
        System.out.println("A2");
    }

    @Override
    public void A3() {
        System.out.println("A3");
    }
}