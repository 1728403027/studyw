package arrayY;
/*
数组
  存储同一种数据类型的多个元素的容器

定义格式：
  数据类型[] 数组名；
  数据类型 数组名

举例：
   int[] arry;  定义一个int类型的数组，数组名是arry
   int arry[]； 定义了一个int类型的变量，变量名是arry数组

数组的初始化：
   所谓的初始化，就是为数组开辟存储空间，并为数组的每一个元素赋予初始值
   我们有两种方式可以实现数组的初始化
      动态初始化    只是给出长度，由系统给出初始化值
      静态初始化    给出初始化值，由系统决定长度


动态初始化：
   数据类型 [] 数组名=new 数据类型[数组长度]；

 */
public class ArrayLearning {
    public static void main(String[] args) {
       //动态初始化
        /*
        左边：
          int：说明数据组中的元素类型是心态类型
          []：说明这是一个数组
          a：这是数组的名字
        右边：
         new：为数组申请内存分配，并开辟空间
         int：说明数组的元素是什么类型的
         []：说明是一个数组
         5：是数组的长度
         */
        int [] a=new int[5];

        //输出数组内容
        //其实数组中的每一个元素都是有编号的，编号是从0开始，最大的编号是数组的长度-1
        //通过数组名和编号我们就可以获取到数组编号指定内容了
        //这编号的专业叫法叫索引
        //访问格式：数组名[索引]
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);


    }
}