package collectionY;

import java.util.*;

/*
需求：判断Java中是否包含java如果由则添加android
Exception in thread "main" java.util.ConcurrentModificationException：并发修改异常
迭代器是依赖集合，相当于集合的一个副本，当迭代器在操作的时候，如果发现和集合不一样，则抛出异常

解决方案：
  1、不用迭代器
  在使用迭代器进行遍历的时候使用迭代器进行修改
 */
public class IteratorY02 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        //需求：判断Java中是否包含java如果由则添加android
        List c = new ArrayList();
        c.add("adasd");
        c.add("java");
        c.add("123");
//        Iterator ite=c.iterator();
//        while (ite.hasNext()){
//            if(ite.next().equals("java")){
//                c.add("java");
//                System.out.println(ite.next());
//            }
        ListIterator lit = c.listIterator();
        while (lit.hasNext()) {
            String s = (String) lit.next();
            if (s.equals("java")) {
                lit.add("android");
            }
        }
        System.out.println(c);
    }
}

