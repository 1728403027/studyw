package collectionY;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

/*
使用集合存储自定义对象并遍历
 由于集合可以存储任意类型的对象，当我们存储不同类型的对象，就有可能在转换的时候出现类型转换异常，
 所以Java为了解决这个问题，给我们提供了一种机制，叫做泛型

 泛型：是一种广泛的类型，把明确数据类型工作提前到编译时期，借鉴了数组的特点

 泛型的好处：
   避免了类型转换的问题
   可以减少黄色警告线
   可以简化我们代码的书写

 什么时候可以使用泛型？
   当我们看到<E>,就可以使用泛型了
 */
public class GenericY {
    public static void main(String[] args)  {
        //使用集合存储自定义对象并遍历
        int a=0;
        while (a<=2) {
            Scanner na = new Scanner(System.in);
            System.out.println("请输入你的名字");
            String name = na.nextLine();
            Scanner ag = new Scanner(System.in);
            System.out.println("请输入年龄");
            String age = ag.nextLine();
            try {
                generic(name, age);
            } catch (IOException e) {
                System.out.println("你输入的内容有误");
            }
            a++;
        }
    }

    public static void generic(String name, String age) throws IOException {
        //使用集合存储自定义对象并遍历
        Collection<Student> co=new ArrayList<Student>();
        Student st=new Student(name,age);
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\JAVA学习\\学生信息.txt",true));
        co.add(st);
        Iterator<Student> ite=co.iterator();
        while (ite.hasNext()){
            Student su=ite.next();
            bw.write(su.getName());
            bw.write(su.getAge());
            bw.newLine();
            System.out.println(su.getName());
            System.out.println(su.getAge());
        }
        bw.close();
    }
}
class Student{
    private  String name;
    private  String age;

    public Student(String name, String age) {
        if(name.matches("[^0-9]{0,10}")){
            this.name = name;
        }else {
            System.out.println("你输入的姓名有误");
        }

        if(age.matches("[1-9][0-9]{0,1}")){
            this.age = age;
        }else {
            System.out.println("你输入的年龄有误");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.matches("[^0-9]")){
            this.name = name;
        }else {
            System.out.println("你输入的姓名有误");
        }
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        if(age.matches("[1-9][0-9]{0,1}")){
            this.age = age;
        }else {
            System.out.println("你输入的年龄有误");
        }
    }
}