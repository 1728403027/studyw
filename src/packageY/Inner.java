package packageY;
/*
成员内部类：
  在类的成员位置，和成员变量以及成员方法所在的位置是一样的

  成员内部类的修饰符：
    我们可以使用权限修饰符修饰成员内部类，但如果使用私有来修饰，则无法在其他类中访问
    我们可以使用static修饰内部类，不在创建外部类对象

我们可以使用abstract，final修饰成员内部类
 */
public class Inner {
    public static void main(String[] args) {
        Outer ou=new Outer();
        ou.method();
        //创建内部类对象
//        Outer.Inner in=new Outer().new Inner();
//        in.function();
        Outer.Inner.function();
    }
}

class Outer{
    private  int a=10;
    public  void method(){
        Inner in=new Inner();
        in.function();
    }
   static class Inner{
        public static void function(){
//            System.out.println(a);
            System.out.println("内部类");
        }
    }
}