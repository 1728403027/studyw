package ioY;

import java.io.*;
import java.util.Scanner;

/*
缓冲流的特殊功能
 BuffereWriter
   void newLine（）：写一行换一行；这个由系统决定
 BuereReader
   String   readLine（）：读取一行但是不读取换行符
 */
public class BuffereStreamTuShu {
    public static void main(String[] args) throws IOException {
        Scanner zh = new Scanner(System.in);
        System.out.println("请输入账号:");
        String z = zh.nextLine();
        Scanner mima=new Scanner(System.in);
        System.out.println("请输入密码:");
        String ma=mima.nextLine();
        BufferedWriter bw=new BufferedWriter(new FileWriter("d:\\JAVA学习\\账号.txt",true));
        BufferedWriter bw2=new BufferedWriter(new FileWriter("d:\\JAVA学习\\密码.txt",true));
        bw.write(z);
        bw.newLine();
        bw2.write(ma);
        bw2.newLine();
        Scanner zh2 = new Scanner(System.in);
        System.out.println("请输入账号:");
        String z2 = zh.nextLine();
        Scanner mima2=new Scanner(System.in);
        System.out.println("请输入密码:");
        String ma2=mima.nextLine();
        BufferedReader br=new BufferedReader(new FileReader("d:\\JAVA学习\\账号.txt"));
        BufferedReader br2=new BufferedReader(new FileReader("d:\\JAVA学习\\密码.txt"));
        int h=0;
        int a=0;
        String str;
        while ((str=br.readLine())!=null) {
            if (str.equals(z2)) {
                h++;
            }
        }
            String str2;
            while ((str2=br2.readLine())!=null){
                if (str2.equals(ma2)){
                    a++;
                }
        }
            if (h!=0&&a!=0){
                System.out.println("登录成功");
            }
            br.close();
            br2.close();
            bw.close();
            bw2.close();
    }
}
