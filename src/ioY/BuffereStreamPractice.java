package ioY;

import java.io.*;

/*
Buffere练习
  用缓冲流复制文件
 */
public class BuffereStreamPractice {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("d:\\JAVA学习\\BuffereWriter.txt")) ;
        BufferedWriter bw=new BufferedWriter(new FileWriter("d:\\JAVA学习\\BuffereWriter练习.txt"));
        char[] cha=new char[1024];
        int le;
        while ((le=br.read(cha))!=-1){
            bw.write(cha);
        }
        System.out.println("复制成功");
        br.close();
        bw.close();
    }
}
