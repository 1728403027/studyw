package objectorientedY;
/*
private关键字
   通过对象直接访问成员变量，会存在数据安全问题
   这时候，我们想能不能不让外界对象直接访问成员变量呢？
   可以
   任何实现
      private关键字

  private：是一个修饰符
     可以修饰成员变量，也可以修饰成员方法
     被private修饰的成员只能在本类中被访问

针对private修饰的成员变量，我们会相应的提供getXxx（）和setXxx（）方法用于获取和设置成员变量的值，方法用public修饰
 */
public class KeywordPrivate {
    String name;
    //private表示私有的也就是说这个成员变量只能在本类中使用
    private  int age;
    //用于给private修饰的成员变量赋值
    public void setAge(int ag){
        if(ag>=0&&ag<150){
            age=ag;
        }else {
            System.out.println("你输入的年龄有误请检查");
        }

    }
    //用于获取private修饰的成员变量
    public int  getAge(){

        return age;
    }
    public void show(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
    }

}
