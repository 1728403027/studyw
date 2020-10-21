package packageY;
/*
匿名内部类的使用场景：
  作为参数进行传递，而且只使用一次
 */
public class Inner04 {
    public static void method(Animal an){
        an.eat();
    }

    public static void main(String[] args) {
        method(new Animal() {
            @Override
            public void eat() {
                System.out.println("猫吃鱼");
            }
        });
        Animal an=new Animal() {
            @Override
            public void eat() {
                System.out.println("狗吃古头");
            }
        };
        method(an);
    }
}
