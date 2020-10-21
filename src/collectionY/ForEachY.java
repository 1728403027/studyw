package collectionY;

import java.util.*;

/*
foreach：增强for循环，一般用于遍历集合或者数组

 格式：
   for(元素的类型变量：集合或者数组对象){
   可以直接使用变量；
   }
   注意：在使用增强for循环中不能修改集合，否则会出现并发异常

   public interface Iterable<T>
   实现这个接口允许对象成为“foreach”语句的目标
 */
public class ForEachY {
    public static void main(String[] args) {
        foreachY();
    }

    public static void foreachY() {
        Collection co = new ArrayList();
        co.add("haha");
        co.add("123");
        co.add("哈哈");

        for (Object obje : co) {

            System.out.println(obje);
        }
    }
}
