package collectionY;


import java.util.ArrayList;
import java.util.Scanner;

/*
arraylist集合练习
  1、储存字符串并遍历
  2、给定一个字符串数组：{张三丰、宋远桥、张无忌、殷梨亭、张翠山、莫声谷}将数组的元素添加到集合中，并把所以新张的人员打印到控制台
  3、存储自定义对象并遍历
  4、创建一个集合，存储学生对象，学生对象的数据来自于键盘录入，最后遍历集合
 */
public class ArrayListPractice {
    //储存字符串并遍历
    public void storage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要储存的字符串");
        String str = sc.nextLine();
        ArrayList<String> arr = new ArrayList<String>();
        arr.add(str);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

    //给定一个字符串数组将数组的元素添加到集合中，并把所以新张的人员打印到控制台
    public ArrayListPractice() {
        String[] str = {"张三丰", "宋远桥", "张无忌", "殷梨亭", "张翠山", "莫声谷"};
        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 0; i < str.length; i++) {
            if (str[i].startsWith("张")) {
                System.out.println(str[i]);
            }
            arr.add(i, str[i]);
        }
    }

    //存储自定义对象并遍历
    public void obj() {
        ArrayList<ArrayLIstPractice2> arr = new ArrayList<ArrayLIstPractice2>();
        ArrayLIstPractice2 ap = new ArrayLIstPractice2("梨花", 20);
        ArrayLIstPractice2 ap1 = new ArrayLIstPractice2("苏尴尬", 28);
        arr.add(ap);
        arr.add(ap1);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).getName());
            System.out.println(arr.get(i).getAge());
        }
    }

    //创建一个集合，存储学生对象，学生对象的数据来自于键盘录入，最后遍历集合
    public void obje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的名字");
        String name = sc.nextLine();
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入你的年龄");
        int age = sca.nextInt();
        Students stu = new Students(name, age);
        ArrayList<Students> arr = new ArrayList<Students>();
        arr.add(stu);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).getName());
            System.out.println(arr.get(i).getAge());
        }
    }

}
