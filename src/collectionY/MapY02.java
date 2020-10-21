package collectionY;

import java.util.*;

/*
map获取所有的key和value
 Set<k> keySet()
 collection<v> values()

 map的第一种遍历方式：
    首先召集所有的丈夫
    遍历所有的丈夫
    获取每一个丈夫
    让每一个丈夫取去找自己的媳妇

 map的第二种遍历方式：
    通过结婚证对象获取丈夫和媳妇
    使用Set<Map.Entry<K,V>> entrySet()
 */
public class MapY02 {
    public static void main(String[] args) {
        method();
        method02();
        //map的第二种遍历方式
        Map<String,String> map=new HashMap<>();
        map.put("1","2");
        map.put("2","3");
        map.put("3","4");
        Set<Map.Entry<String, String>> ents=map.entrySet();
        for (Map.Entry<String, String> ent:ents) {
            System.out.println("kvy:"+ent.getKey());
            System.out.println("value:"+ent.getValue());
        }
    }

    public static void method02() {
        // map的第一种遍历方式
        Map<String,String> map=new HashMap<>();
        map.put("1","2");
        map.put("2","3");
        map.put("3","4");
        Set<String> key=map.keySet();
        for (String str:key) {
            System.out.println("key:"+str+",value:"+map.get(str));
        }
    }

    public static void method() {
        Map<String,String> map=new HashMap<>();
        map.put("1","123");
        map.put("2","1234");
        Set<String> key=map.keySet();
        for (String str:key) {
            System.out.println(str);
        }
        Collection<String> co=map.values();
        for (String str:co) {
            System.out.println(str);
        }
    }
}
