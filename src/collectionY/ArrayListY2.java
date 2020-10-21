package collectionY;

import java.util.ArrayList;

/*
arraylist
   获取元素
   public e get(int index):返回指定索引处的元素
   集合长度
   public int size（）:返回聚合中的元素个数
   删除元素
     public boolean remove（object obj）：删除指定元素，返回是否删除成功
     public E remove（int index）：删除指定索引的元素，返回被删除的元素
   修改元素
     public E set(int index,E element)：修改指定索引处的元素，返回被修改的元素
 */
public class ArrayListY2 {
    public ArrayListY2() {
        ArrayList<String> list = new ArrayList<String>();

        list.add("哈哈");
        list.add("wowo");
        list.add("13456");


        //获取元素
        String s = list.get(2);
        System.out.println(s);

        //集合长度
        int c = list.size();
        System.out.println(c);

        //删除元素
        boolean z = list.remove("哈哈");
        String x = list.remove(1);

        //修改元素
        String v = list.set(0, "集合");
        System.out.println(list);

    }
}
