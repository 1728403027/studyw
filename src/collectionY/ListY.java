package collectionY;

import java.util.ArrayList;
import java.util.List;

/*
list：
  有序的（存储和读取的顺序是一致的）
   由证书索引
   允许重复的

 list的特有功能：
   void add（int idex ， E element）:在指定索引输入需要的元素
   E get(int index):查找指定索引里面的元素,返回查找到的数
   E remove(int index):删除指定索引的元素，返回删除的元素
   E set(int index , E element)：在指定索引修改元素，返回修改前的元素
 */
public class ListY {
    public static void main(String[] args) {
        lisy();
    }

    public static void lisy() {
        List<String> list = new ArrayList<String>();
        list.add("123");
        list.add("haha");
        list.add("哈哈");
        // void add（int idex ， E element）:在指定索引输入需要的元素
        list.add(0, "456");
        //E get(int index):查找指定索引里面的元素,返回查找的元素
        String s = list.get(2);
        System.out.println(s);
        //E remove(int index):删除指定索引的元素,返回删除的元素
        String re = list.remove(0);
        System.out.println(re);
        //E set(int index , E element)：在指定索引修改元素，返回修改前的元素
        String s1 = list.set(1, "789");
        System.out.println(s1);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
