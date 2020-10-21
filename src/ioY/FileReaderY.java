package ioY;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
fileReader 输入流 读取数据
 需求：从文件中读取数据并输入到控制台
    读数据--输入流--filereader

FileReader:
   FileReader(string fileName):传递文件名

输入流文件的步骤
  1、创建输入流
  2、调用输入流对象的读数据方法
  3、释放资源

 */
public class FileReaderY {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("D:\\JAVA学习\\FileWriter方法使用.txt");
        //一个一个字节读文本里的内容的方法  int read（）
        int c;
//        while ((c=fr.read())!=-1){
//            System.out.print((char)c);
//        }

        //一次读取一个数组字符的数据  int read（char[] cha）
        //这里数组的长度一般数为1024的倍数
        char[] cha=new char[1024];
        int ch;
        /*
        1、fr.read（cha）：是在文本里面读取cha数组长度的内容存入数组
        2、ch=fr.read（cha）：实际读取的长度
        3、(ch=fr.read(cha))!=-1：判断文本的内容是否读完
         */
        while((ch=fr.read(cha))!=-1){
            System.out.print(new String(cha,0,ch));
        }
        fr.close();
    }
}
