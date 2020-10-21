package objectorientedY;
/*
this关键字
 this：代表所在类的对象引用（也就是父类，就是自己类里面的成员变量）
      方法被哪个对象调用，this就代表哪个对象
 使用场景
    局部变量隐藏成员变量
 */
public class KeywordThis {
    private  String name;
    private  int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
