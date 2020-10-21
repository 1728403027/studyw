package collectionY;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

/*
使用hashset存储自定义对象并遍历
  为什么hashset在自定义对象是没有去重
    通过查看源码发现：
     hashset的add（）方法，首先会使用当前集合中的每个元素和新添加元素的hash值进行比较
     如果哈市值不一样，则直接添加新的元素；
     如果hash值一样，比较地址值或者使用equals方法进行比较
     比较结果一样，则认为是重复不添加
     所有的比较结果都不一样则添加
  hashset怎么在自定义对象去重
   重写equals方法和hashCode方法
 */
public class HashSet02 {
    public static void main(String[] args) {
        Scanner na = new Scanner(System.in);
        System.out.println("请输入你的名字");
        String name = na.nextLine();
        Scanner ag = new Scanner(System.in);
        System.out.println("请输入你的年龄");
        String age = ag.nextLine();
        method(name, age);
    }

    public static void method(String name, String age) {
        HashSet<Student02> ha = new HashSet<Student02>();
        Student02 st02 = new Student02(name, age);
        ha.add(st02);
        for (Student02 stu : ha) {
            System.out.println(stu.toString());
        }
    }
}

class Student02 {
    private String name;
    private String age;

    public Student02(String name, String age) {
        if (name.matches("[^0-9]{1,3}")) {
            this.name = name;
        } else {
            System.out.println("你输入的姓名有误");
        }
        if (age.matches("[1-9][0-9]{0,2}")) {
            this.age = age;
        } else {
            System.out.println("你输入的年龄有误");
        }


    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "名字：" + name +
                ",年龄：" + age;
    }

    @Override
    public boolean equals(Object o) {
        //提高效率
        if (this == o) {
            return true;
        }
        //提高健壮性
        if (this.getClass() == o.getClass()) {


            Student02 s = (Student02) o;
            if (s.name.equals(this.name)) {
                return false;
            }
            if (this.age.equals(s.age)) {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        /*
            我们发现当、hashcoode方法永远返回整数1时，所有对象的hash指的是一样的
            有一些对象他的成员变量完全不同，但是他们还是需要进行hash和equals方法的比较
            如果我们可以让成员变量不同的对象，他们的hash值夜不同，这就可以减少一部分的equals方法的比较
            从而可以提高我们程序的效率

            可以尝试让hashcoode方法的返回值和对象的成员变量有关
            可以让hashcoode方法返回所有成员变量之和
            让基本数据类型直接相加，然后引用数据类型获取hashcoode方法返回值后再相加（boolean不可以参与运算）
         */
        return age.hashCode() + name.hashCode();
    }
}
