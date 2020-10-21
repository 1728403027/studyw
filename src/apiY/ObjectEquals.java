package apiY;

import java.util.ArrayList;
import java.util.Objects;

/*
boolean equals (object oje): 使用==比较对象是否相等，引用类型比较地址值是否相等
 */
public class ObjectEquals {
    public static void main(String[] args) {
    Person pe=new Person("哈哈",20);
        Person pe2=new Person("哈哈",20);
        ArrayList<String> st=new ArrayList<String>();
        System.out.println(pe.equals(st));
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    //重写equals方法
//    public boolean equals(Object o) {
//
//        //判断地址只是否一样
//        if(this==o){
//            return true;
//        }
//        //提高代码的安全性,判断传递进来的对象类型是否一样
//        if(this.getClass()!=o.getClass()){
//            return  false;
//        }
//
//        Person pe = (Person) o;
//        if (this.name.equals(pe.name)) {
//            if(this.age==((Person) o).age){
//                return true;
//            }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

}
