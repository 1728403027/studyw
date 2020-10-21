package collectionY;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
使用HashMap存储数据并遍历(key是int类型)
使用HashMap存储数据并遍历(自定义对象作为key)

 */
public class HashMapY {
    public static void main(String[] args) {
        anliyi();
        anlier();
    }

    public static void anlier() {
        //案例二
        //使用HashMap存储数据并遍历(自定义对象作为key)
        HashMap<Student03,String> map=new HashMap<>();
        Scanner na=new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name=na.nextLine();
        Scanner ag=new Scanner(System.in);
        System.out.println("请输入你的年龄：");
        String age=ag.nextLine();
        Student03 st=new Student03(name,age);
        map.put(st,"1");
        //遍历
        //方法一
        Set<Student03> set=map.keySet();
        for (Student03 key:set) {
            System.out.println("key:"+key.toString()+",value:"+map.get(key));
        }
        //方法二
        Set<Map.Entry<Student03,String>>entries=map.entrySet();
        for (Map.Entry<Student03,String> entr:entries) {
            System.out.println("key:"+entr.getKey().toString()+"value:"+entr.getValue());
        }
    }

    public static void anliyi() {
        // 使用HashMap存储数据并遍历(key是int类型)
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"张三");
        map.put(2,"王五");
        map.put(3,"lihua");
        //遍历
        method(map);
        method02(map);
    }

    public static void method02(HashMap<Integer, String> map) {
        //方法二
        Set<Map.Entry<Integer,String>> entries=map.entrySet();
        for (Map.Entry<Integer,String> entry:entries) {
            System.out.println("kye:"+entry.getKey()+",vaule:"+entry.getValue());
        }
    }

    public static void method(HashMap<Integer, String> map) {
        //方法一
        Set<Integer> inte=map.keySet();
        for (Integer s:inte) {
            System.out.println("kvy:"+s+",value:"+map.get(s));
        }
    }
}
class Student03{
    private  String name;
    private String age;

    public Student03(String name, String age) {
        if(name.matches("[^0-9]{4}")){
            this.name = name;
        }else {
            System.out.println("你输入的名字包含特殊字母");
        }
        if(age.matches("[1-9][0-9]{0,2}")){
            this.age = age;

        }else {
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
        return "Student03{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}