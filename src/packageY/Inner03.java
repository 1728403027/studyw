package packageY;

import org.w3c.dom.ls.LSOutput;

/*
匿名内部类：
  可以把匿名内部类看成是一个没有名字的局部类
  定义在方法中
  必须在定义匿名内部类的时候创建他的对象

格式：
 new 类/接口（）{
   如果创建了继承这个类的子类对象，我们可以重写父类的方法
   如果是创建类实现接口的子类对象，我们必须实现该接口的所有方法
 }；

 原理：而是创建继承这个类的子类对象或者是创建了实现这个接口的子类随心
 */
public class Inner03 {
    public static void main(String[] args) {
        Outer03 ou=new Outer03();
        ou.method();

    }
}

interface Inner2 {
    abstract public void function();
}

class  Si1{
    public  void si2(){
        System.out.println("父类");
    }
}

class Outer03  {
    public void method() {
//        new Inner2() {
//            public void function() {
//                System.out.println("匿名内部类");
//            }
//        }.function();

        Inner2 in=new Inner2() {
          public void  function(){
              System.out.println("匿名内部类");
          }
        };
        in.function();

//        new Si1(){
//            public  void si2(){
//                System.out.println("子类");
//            }
//        }.si2();
       Si1 si= new Si1(){
           public  void si2(){
               System.out.println("子类");
           }
       };
       si.si2();
    }
}