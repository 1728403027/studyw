package collectionY;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
需求：定义一个方法，返回指定列表中指定元素的索引位置
  扩展：判断元素是否存在
 */
public class ListTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查找的元素");
        String s = sc.nextLine();
        List list = new ArrayList();
        list.add("123");
        list.add("haha");
        list.add("哈哈");
        int i = index(list, s);
        System.out.println(i);
        boolean bo = contains(list, s);
        System.out.println(bo);
    }

    public static int index(List list, Object obje) {
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            if (o.equals(obje)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean contains(List list, Object object) {
        int i = index(list, object);
        if (i != -1) {
            return true;
        }
        return false;
    }
}
