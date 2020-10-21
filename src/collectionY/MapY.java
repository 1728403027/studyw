package collectionY;

import java.util.HashMap;
import java.util.Map;

/*
需求：实现学号和姓名这样对应关系的数据存储
为了体现这种对应关系的数据，我们使用以前所学习的内容可以实现的，但是略由不变所以java又给我们提供了一种专门用于存储对应关系的集合。MAAP

Map:将键映射到值的对象，一个映射不能包含重复的键；每一个键最多只能映射到一个值

Map和Collection有什么区别？
   Map：是一个双列集合，常用处理对应关系的数据，key是不可以重复的，我们也称之为夫妻集合
   Collection：是单列集合，collection有不同的子体系，有的允许重复有索引有序，有的不允许重复而且无序，那么我们也称之为单身集合

 一对一：一个学号对于一个姓名
 Map的常用功能：
   v put（k key， v value）：就是将key映射到value，如果key存在，ze覆盖value，并将原来的value返回
   boolean containskey（ object key）：判断指定key是否存在
   boolean containvalue（object value）：判断指定的value是否存在
   boolean  isEmpty（）：判断是否有对应关系
   void clear（）：清空所有的对应关
   v remove（object key）：根据指定的key删除对应关系，并返回key所对应的值，如果没有删除成功则返回null
   int size（）：返回对应关系的个数
   v get（object key）：根据指定的key返回对应的value

 */
public class MapY {
    public static void main(String[] args) {
        Map<String,String> ma=new HashMap<String,String>();
        //v put（k key， v value）：就是将key映射到value，如果key存在，ze覆盖value，并将原来的value返回
        System.out.println(ma.put("1","哈哈"));
        System.out.println(ma.put("1","呵呵"));
        System.out.println(ma.put("2","哈哈"));
        //boolean containskey（ object key）：判断指定key是否存在
        System.out.println(ma.containsKey("1"));
        // boolean containvalue（object value）：判断指定的value是否存在
        System.out.println(ma.containsValue("呵呵"));
        // boolean  isEmpty（）：判断是否有对应关系
        System.out.println(ma.isEmpty());
        //void clear（）：清空所有的对应关
        //ma.clear();
        //v remove（object key）：根据指定的key删除对应关系，并返回key所对应的值，如果没有删除成功则返回null
        System.out.println(ma.remove("1"));
        //int size（）：返回对应关系的个数
        System.out.println(ma.size());
        //v get（object key）：根据指定的key返回对应的value
        System.out.println(ma.get("2"));
        System.out.println(ma);
    }
}
