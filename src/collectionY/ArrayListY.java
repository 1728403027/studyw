package collectionY;

import java.util.ArrayList;

/*
集合
   我们学习的是面向对象编程语言，而面向对象编程语言对事物的描述都是通过对象来体现的
   为了方便对多个对象进行操作，我们就必须堆多个对象进行存储，而想要对多个对象进行存储
   就不能是一个基本的变量，而应该是一个容器类型的变量
   到目前为止我们学习过哪些容器类型的变量
   stringbuilder和数组
   stringbuilder的结果只能是一个字符串类型，不一定满足我们的需求
   所以我目前只能选择数组了，适应不了变化的需求，那么我们该如何选择呢？
   这个时候，Java就提供了集合供我们使用

集合的特点
    长度可变

 arraylist<e>
     大小可变数组的实现

     <e>；是一种特殊数据类型：泛型
     怎么用呢？
      在出现e的地方我们使用引用数据类型替换即可
      举例： arraylist<string>，arraylist<student>

   构造方法：
      arraylist（）
   添加元素
     public boolean add(E e)：添加元素
     public void add（int index，E element）：在指定的索引处添加一个元素

 */
public class ArrayListY {
    public ArrayListY(){
    //创建集合对象
        ArrayList<String> list=new ArrayList<String>();

        //往集合里面添加元素 add()
        list.add("你好");
        list.add("1256");
        list.add("jihe");

        //在指定位置添加元素add（index，e）
        list.add(3,"haha");

        System.out.println(list);
    }
}
