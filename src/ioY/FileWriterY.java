package ioY;

import java.io.FileWriter;
import java.io.IOException;

/*
filewriyer  输出出  写入数据
  要求：往文件中写数据
    写数据--输出流--filewriter

 filewrier
   fiewrier(string filename):传递一个文件名称

   输出流写数据的步骤
     1、创建输出流
     2、调用输出刘对象的写数据的方法
     3、释放资源

  相对路径：相对当前项目而言的，在项目的根目录夏
  绝对路径：以盘符开始的路径（d：\\a.txt）

  close()和flush()方法的区别：
     flush（）：刷新缓冲区，流对象还可以在使用了
     colse（）：先刷新缓冲区，然后通知系统释放资源，流对象不可以在使用了
 */
public class FileWriterY {
    public static void main(String[] args) throws IOException {
        //创建输出对象
        FileWriter fw=new FileWriter("d:\\JAVa学习\\FileWriter.txt");
        //如果你写io输出流的时候没有写文件的盘符的话文件就会保存在项目的相对路径中
        FileWriter fw2=new FileWriter("FileWriter.txt");
          /*
          创建输出流对象做了那些事情
             1、调用系统资源创建一个文件
             2、创建输出流对象
             3、把输出流对象指向文件
           */
          //调用输出流对象的写法数据方法
         //写一个字符串数据
        fw.write("io流你好");
        //数据没有直接写到文件，其实是写到内存缓冲区所有要刷新
        fw.flush();
        //释放资源
        //通知心态释放和该文件相关的资源
        fw.close();
    }
}
