package collectionY;

import java.util.LinkedList;

/*
list的常用子类：
  arraylist
    底层是数组结构，查询快，增删慢
  linkedlist
    底层结构是链表，查询慢，增删快

如何选择使用不同的集合
  如果查询多，增删少，则使用ArrayList
  如果查询少，增删多，则使用LinkedList
  如果你还不知道使用什么，则使用ArrayList

LinkedList的特有功能：
  void addFirst(E e)：将元素添加到索引0的位置
  void addLast（E e）:将元素添加到索引size（）-1的位置
  E getFirat（）：获取到索引0的元素,返回获取到的元素
  E  getLast（）：获取到索引size（）-1的元素，返回获取到的元素
  E  removeFirst（）：删除索引0的元素，返回删除的元素
  E  removeLast():删除索引size（）的元素，返回删除的元素
 */
public class LinkedListY {
    public static void main(String[] args) {
        LinkedListY();
    }

    public static void LinkedListY() {
        LinkedList<String> like=new LinkedList<String>();
        like.add("123");
        like.add("哈哈");
        like.add("haha");

        //void addFirst(E e)：将元素添加到索引0的位置
        like.addFirst("20");
        //void addLast（E e）:将元素添加到索引size（）-1的位置
        like.addLast("1000");
        //E getFirat（）：获取到索引0的元素,返回获取到的元素
        String s=like.getFirst();
        System.out.println(s);
        // E  getLast（）：获取到索引size（）-1的元素，返回获取到的元素
        String l=like.getLast();
        System.out.println(l);
        // E  removeFirst（）：删除索引0的元素，返回删除的元素
        String re=like.removeFirst();
        System.out.println(re);
        //E  removeLast():删除索引size（）的元素，返回删除的元素
        String rl=like.removeLast();
        System.out.println(rl);
        System.out.println(like);
    }
}
