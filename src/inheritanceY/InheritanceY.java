package inheritanceY;

/*
继承：多个类有共同的成员变量和成员方法，抽取到另外一个类中（父类），再让多个类去继承父类那我们就能获取到父类的成员
 关键字：extends
 java中继承的特点：
   Java语言中只支持单一继承，只能继承一个父类（一个儿子只能有一个亲爹）
   Java语言中支持多层继承（一个儿子可以有一个亲爹和一个亲爷爷）

 继承中成员变量的特点：
   子类只能获取父类非私有成员
   子父类中成员变量的名字不一样直接获取父类的成员变量
   子父类中成员变量名字是一样的获取的是子类的成员变量
  就近原则：谁离我近我就用谁
    如果有局部变量就是用局部变量
    如果没有局部变量，有子类的成员变量就使用子类的成员变量
    如果没有局部变量和子类的成员变量，有父类的成员变量就使用父类的成员变量
    啥都没有，就出错了!!!

  super：可以获取父类的成员变量和成员方法，他的用法和this一样

  继承中成员方法的特点：
    子类中没有这个方法，调用父类的
    子类中有这个方法重写这个方法，调用子类的

    方法重写：在子父当中，子类的方法和父类的方法完全一样，子类重写父类的方法（也叫覆盖），当子类重写了父类的方法后，使用子类对象调用的就是子类的方法
    方法重载：在一个类中，有多个重名的方法，但是其参数不一样（参数个数，参数的类型，参数的顺序）和返回值无关


 继承的优缺点
  优点
    提高了代码的复用性
    提高了代码的可维护性
  缺点
   类的耦合性增强
   开发的原则：高内聚低耦合
    内聚：就是自己完成某件事情的能力
    耦合：类与类的关系
 */
public class InheritanceY {
    public static void main(String[] args) {
        Father fa = new Father();
        //子父类中成员变量名字是一样的获取的是子类的成员变量
        System.out.println(fa.name1);
        //子类中有这个方法重写这个方法，调用子类的
        fa.eatf();
        //子父类中成员变量的名字不一样直接获取父类的成员变量
        System.out.println(fa.name1);
        //子类中没有这个方法，调用父类的
        fa.eatg();
        Son so = new Son();
        so.eat();

    }
}

//爷爷类
class Grandpa {
    //private修饰的无法继承
    private String name="哈哈1";
    String name1="哈哈1";
    static {
        System.out.println("在吃饭");
    }

    public void eatg() {
        System.out.println("爷爷在吃饭");
    }
    public void eatf() {
        System.out.println("爷爷在吃饭");
    }
}

//父亲类
class Father extends Grandpa {
    //String name1="哈哈1";
    String name2="哈哈2";
    public void eatf() {
        System.out.println("爸爸在吃饭");
    }
}

//儿子类
class Son extends Father {
    String name1="哈哈3";
    public void eat() {
        // super：可以获取父类的成员变量和成员方法
        System.out.println(super.name1);
        super.eatf();
        System.out.println("儿子在吃饭");
    }
}