package debug;
/*
断点调试的作用
   查看程序的执行流程
   调试程序

断点
  其实就是一个标记

断点加在哪里
    哪里不会加哪里
如何加断点
  在代码区的左边双击即可
如何运行加断点的程序呢？
   代码区--右键---debug as---Java application
   弹出一个框框让我们选择是否进入debug试图，我们选择yes，并且记住选择的那个框框也选择上
如何让程序往下执行
 按f6

 看哪些区域
   代码区域：看持续的执行流程
   debug区域：看程序的执行流程
   variables：看变量的变化
   console：看程序的输入和输出
如何去掉断点
  把加断点的动作再做一遍
  在debug视图中，找到breakpoints，选中要删除的断点，点击双x即可
   */
public class Debug {
    //定义一个方法获取数据的最值
    public static void arges2(int [] a){
        int s=a[0];
        //最大值
        for (int x=1;x<a.length;x++){
            if (a[0]<a[x]){
                a[0]=a[x];
            }
        }
        System.out.println("数组最大值是："+a[0]);

        //最小值  因为经过上面的代码的运行a[0]的值已经变成最大数了所有为了不出错就要在程序一开始的时候定义一个数并且把a[0]的值赋给他然后以这个定义的数为比较大小的基准
        for (int x=0;x<a.length;x++){
            if (s>a[x]){
                s=a[x];
            }

        }
        System.out.println("数组最小值是："+s);
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        arges2(a);
    }
}
