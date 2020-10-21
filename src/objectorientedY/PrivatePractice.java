package objectorientedY;
/*
private关键字练习
   要求：
     1、成员变量用private修饰
     2、提供对应的set、get方法
     3、一个标准的案例使用

类名作为形式参数传递
   类名作为形式参数，其实这里需要的是该类的对象

类名作为返回值类型
 */
public class PrivatePractice {
    private String name;
    private  int age;
    private  float qiang;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age>0&&age<150) {
            this.age = age;
        }else {
            System.out.println("你输入的年龄有误请检查");
        }
    }

    public void setQiang(float qiang) {
        if (qiang>=0){
            this.qiang = qiang;
        }else {
            System.out.println("你输入的收入有误请检查");
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getQiang() {
        return qiang;
    }
    //类名作为形式参数传递
    public void canshu(Student student){
        student.study("陈粒");
    }
    //类名作为返回值返回
    public Student fanhui(){
        Student su=new Student();
        return  su;
    }
}
