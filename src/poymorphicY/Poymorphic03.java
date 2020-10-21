package poymorphicY;
/*
向下转型和向上转型
    向上转型：
      由小到大（子类转换成父类）
    向下转型:
      由大到小
   基本数据类型转换：
     自动类型转换
       由小到大
        byte  short char-----int -----long----float-----double
     强制类型转换
        由大到小（会丢失精准度）
 */
public class Poymorphic03 {
    public static void main(String[] args) {
        //向上转型
        Animal2 an=new Dog();
        an.eat();
        //向下转型
        Dog d=(Dog) an;
        d.swin();

    }
}
class Animal2{
    public void eat(){
        System.out.println("吃东西");
    }
}
class Dog extends  Animal2{
    public  void  eat(){
        System.out.println("吃骨头");
    }
    public void swin(){
        System.out.println("狗刨游泳");
    }
}
