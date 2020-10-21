package collectionY;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
使用HashSet存储字符串并遍历
  HashSet是Set的子接口，而set实现了collection所以HashSet间接实现了collection

Set集合的特点：
  无序（存储和读取的顺序有可能不一样）
  不予许重复（要求袁术唯一性）
  没有索引
 */
public class HashSetY {
    public static void main(String[] args) {
//      HashSet hash=new HashSet();
        Set<String> hash = new HashSet<String>();
        hash.add("123");
        hash.add("haha");
        hash.add("哈哈");
        method(hash);
        method02(hash);
        method03(hash);

    }

    public static void method03(Set<String> hash) {
        //转数组
        Object[] oje=hash.toArray();
        for (int i = 0; i <oje.length ; i++) {
            System.out.println(oje[i]);
        }
    }

    public static void method02(Set<String> hash) {
        //迭代器
        Iterator<String> ite=hash.iterator();
        while(ite.hasNext()){
            String s=ite.next();
            System.out.println(s);
        }
    }

    public static void method(Set<String> hash) {
        //for增强
        for (Object o : hash) {
            System.out.println(o);
        }
    }
}
