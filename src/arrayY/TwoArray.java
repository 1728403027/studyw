package arrayY;

import org.w3c.dom.ls.LSOutput;

/*
二维数组：
  其实就是元素为一维数组的数组
定义格式：
   数组类型[][] 数组名；（推荐的方式）
   数据类型 数组名[][];
   数据类型[] 数组名[];
初始化：
   动态初始化
      数据类型[][] 数组名 =new 数据类型[m][n];
      m表示的是二维数组中的一维数组的个数
      n表示的是一个数组中的元素个数
    静态初始化
      数据类型[][] 数组名=new 数据类型[][]{{元素。。。。},{元素。。。。},{元素。。。。}}；
     简化格式：
      数据类型[][] 数组名={{元素。。。。},{元素。。。。},{元素。。。。}}；
 */
public class TwoArray {
    public static void main(String[] args) {
        //二维数组
        int [][] a={{1,2,3},{4,5,6},{7,8,9}};
        //获取二维数组中的数据
        System.out.println(a[0][0]);
        System.out.println(a[1][2]);
        System.out.println(a[2][1]);

    }

}
