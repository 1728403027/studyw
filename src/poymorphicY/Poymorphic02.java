package poymorphicY;
/*
多态成员的特点：
   成员变量：编译时看左边，运行时看左边
   成员方法：编译时看的是左边，运行是看的是右边
   静态方法：编译时看的是左边运行是看的也是左边

 总结：编译时度看左边，运行时成员方法看右边，其他（成员变量和静态方法）的看左边
 */
public class Poymorphic02 {
    public static void main(String[] args) {
        Dad da=new Kid();
        //编译时看的是左边，运行是看的是右边
        da.eat();
        //因为常量不存在重写使用它的多态也就不存在
        System.out.println(da.a);
        //编译时看的是左边运行是看的也是左边
        da.god();
    }
}
class Dad{
    int a=20;
    public void eat(){

        System.out.println("父类方法");
    }
    public  static  void god(){
        System.out.println("父类的静态方法");
    }
}
class Kid extends Dad{
    int a=30;
    public void eat(){

        System.out.println("子类方法");
    }
    public  static  void god(){
        System.out.println("子类的静态方法");
    }
}