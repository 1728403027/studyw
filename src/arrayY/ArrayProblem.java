package arrayY;
/*
数组常见的两个问题：
  1、java.lang.ArrayIndexOutOfBoundsException:数组下标越界异常也就是索引越界
       产生原因：我们访问不存在的索引
  2、java.lang.NullPointerException：空指针异常
      产生原因：数组已经不存在指向堆内存的数据了，你还使用数组名取访问元素
 */
public class ArrayProblem {
    public static void main(String[] args) {
        int [] a={1,5,3};
        //System.out.println(a[4]);

        //引用类型：类、接口、数组
        //常量：空常量，null，是可以赋值给引用类型的
        a=null;
        System.out.println(a[1]);
    }
}
