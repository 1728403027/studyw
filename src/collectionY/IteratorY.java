package collectionY;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/*
集合的遍历方式：
 toArray(),可以把集合装换成数组，然后遍历数组即可
 iterator（），可以返回一个迭代器对象，我们可以通过迭代器对象来迭代集合

Iterator：可以用于遍历集合
 E next():返回下一个元素
 boolean hasNext（）：判断是否有元素可以获取

 Exception in thread "main" java.util.NoSuchElementException:使用next方法获取下一个值如果没有值后出NoSuchElementException错误
 */
public class IteratorY {
    public static void main(String[] args) {
        //putong();
        iteratory();

    }

    public static void iteratory() {
        //迭代器遍历集合
        Collection c = new ArrayList();
        c.add("123");
        c.add("ladj");
        //获取迭代器
        Iterator tie = c.iterator();
        while (tie.hasNext()) {
            System.out.println(tie.next());
        }

    }


    public static void putong() {
        //可以把集合装换成数组，然后遍历数组即可
        Collection ar = new ArrayList();
        ar.add("123");
        ar.add("ladj");
        Object[] obj = ar.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
    }
}
