package apiY;

import java.util.Scanner;

/*
用api学习scanner
   scanner：用于获取键盘录入的数据（基本数据类型：字符串类型）
     用public string nextLine（）：获取键盘录入的字符串数据
 */
public class ApiScanner {
    public static void main(String[] args) {
        //创建键盘录入
        Scanner sc=new Scanner(System.in);
        //接收数据
        System.out.println("请输入字符串类型的数据：");
        String s=sc.nextLine();
        System.out.println("s:"+s);
    }
}
