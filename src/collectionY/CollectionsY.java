package collectionY;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
collections
  面试题：collection和collections有什么区别
  collection是集合体系的最顶层，包含集合体系的共性
  collections是一个工具类，方法都是用于操作collection
  static void swap（List list,int i,int i）:将列表中的两个索引的元素互换
  int binarSearch（List list，T key）：使用二分查找指定元素在列表的索引位置，返回查找到的索引位置
  void copy（List dest，List src）：把原列表中的数据覆盖到目标列表中
  void fill（List list，Object obje）：使用指定对象填充到指定列表的所有元素
  void reverse（List list）:把列表中的所有元素反转
  void shuffle（List list）：傻否。随机置换
  void sort（List list）：按照列表中元素的自然顺序进行排序

 */
public class CollectionsY {
    public static void main(String[] args) {
        method();
        method02();
        method03();
        method04();
        method05();
        method06();
        method07();
    }

    public static void method07() {
        //void sort（List list）：按照列表中元素的自然顺序进行排序,如果是string类型的则按照ascii码表排序的
        List<String> list=new ArrayList<>();
        list.add("20");
        list.add("哈哈");
        list.add("456");
        list.add(" ");
        Collections.sort(list);
        System.out.println(list);
    }

    public static void method06() {
        //  void shuffle（List list）：傻否。随机置换,把列表中的元素随机调换位置
        List<Integer> list=new ArrayList<>();
        list.add(123);
        list.add(456);
        list.add(789);
        Collections.shuffle(list);
        System.out.println(list);
    }

    public static void method05() {
        //void reverse（List list）:把列表中的所有元素反转
        List<Integer> list=new ArrayList<>();
        list.add(123);
        list.add(456);
        list.add(789);

        Collections.reverse(list);
        System.out.println(list);
    }

    public static void method04() {
        //void fill（List list，Object obje）：使用指定对象填充到指定列表的所有元素
        List<String> list=new ArrayList<>();
        list.add("20");
        list.add("哈哈");
        Collections.fill(list,"50");
        System.out.println(list);
    }

    public static void method03() {
        // void copy（List dest，List src）：把原列表中的数据覆盖到目标列表中,把后面的列表复制给前面的列表，目标列表的长度至少等于原列表的长度，不然会出错
        List<Integer> list=new ArrayList<>();
        list.add(123);
        list.add(456);
        list.add(789);
        List<Integer> li=new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            li.add(i);
        }
        Collections.copy(list,li);
        System.out.println(list);
    }

    public static void method02() {
        //int binarSearch（List list，T key）：使用二分查找指定元素在列表的索引位置，返回查找到的索引位置,不可以使用string类型的
        List<Integer> list=new ArrayList<>();
        list.add(123);
        list.add(456);
        list.add(789);
        int a= Collections.binarySearch(list,123);
        System.out.println(a);
    }

    public static void method() {
        //static void swap（List list,int i,int i）:将列表中的两个索引的元素互换
        List<String> list=new ArrayList<>();
        list.add("20");
        list.add("哈哈");
        Collections.swap(list,0,1);
        System.out.println(list);
    }
}
