package scannerY;

import java.util.Scanner;

/*
键盘录入
  为了提高程序的灵活性，我们就把数据改进为键盘录入
  如何实现键盘录入数据呢？目前我们使用jdk提供的类scanner
  如何使用scanner获取键盘数据录入呢？如下步骤,大家面前只能记住
   导包
    import java.util.scanner
     在一个类中顺序：package>import>class
    创建键盘录入对象
      scanner sc=new scanner（system.in）
    接收数据
     int i=sc.nextint()
 */
public class ScannerY {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你想输入的内容");
       // 接收数据
        String s=sc.next();
        //输出结果
        System.out.println("你输入的内容是："+s);
    }
}
