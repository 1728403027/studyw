package ioY;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
复制文本文件
   要求：
   1、一次读写一个字符
   2、一次读写一个字符数组
 */
public class FilePractice {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("D:\\JAVA学习\\FileWriter方法使用.txt");
        FileWriter fw=new FileWriter("D:\\JAVA学习\\复制文本文件练习.txt");
//        //一次读写一个字符
//        int ch;
//        while ((ch=fr.read())!=-1){
//            fw.write(ch);
//        }

        //一次读写一个字符数组
        char [] chars=new char[1024];
        int ch;
        while((ch=fr.read(chars))!=-1){
            fw.write(chars,0,ch);
        }
        System.out.println("复制成功");
        fr.close();
        fw.close();
    }
}
