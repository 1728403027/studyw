package objectorientedY;
/*
构造方法：
   给对象的数据进行初始化

格式：
    方法名和类名相同
    没有返回值类型，连void都不用写
    没有具体的返回值
调用构造方法
   通过new关键字调用
   格式
     类名  对象名=new  构造方法（....）；

构造方法的注意事项：
 如果我们没有给出构造方法，系统会提供一个默认的无参构造方法供我们使用
 如果我们给出了构造方法，系统将不再提供默认的无参构造方法供我们使用
  这时候，如果我们想使用无参构造方法，就必须自己提供
  推荐：自己给无参构造方法
  构造方法也是可以重载的

 成员变量赋值方法
    setXxx（）方法
    带参构造方法
 */
public class Constructor {
    private  String name;
    private  int age;
    //构造方法
//    public Constructor(){
//        System.out.println("调用构造方法");
//    }
    //无参的构造方法
    public Constructor(){}
    //带一个参数的构造方法
    public Constructor(String name ){
        this.name=name;
    }
    //带一个参数不同参数类型的构造方法
    public Constructor(int age){
        if(age>=0&&age<150){
            this.age=age;
        }else {
            System.out.println("你输入的年龄有误");
        }

    }
    //带两个参数的构造方法
    public  Constructor(String name,int age){
        this.name=name;
        if(age>=0&&age<150){
            this.age=age;
        }else {
            System.out.println("你输入的年龄有误");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
        System.out.println("名字："+name);
        System.out.println("年龄："+age);
    }
}
