package ioY;

import java.io.FileWriter;
import java.io.IOException;

/*
filewriter方法的使用
   void write(string str):写一个字符串数据
   void write（string str，int index，int len）：写一个字符串中的一部分数据
   void write（int ch）：写一个字符串数据，这里写int类型的好处是既可以写char类型的数据也可以写心态类型的数据，也就是说可以写'a'也可以写97
   void write（char[] cha）:写一个字符数组数据
   void write（cahr[] cha，int index，int len）：写一个字符数组的一部分数据

   如何实现数据换行？
     \n可以实现换行，但是windows系统自带的记事本识别的是\r\n
     常见操作系统换行识别
     windows ：\r\n
     linux:\n
     mac:\r

     如何实现数据的追加写入
     FileWrier （string str，boolean append）：append判断是否每运行一次程序写的字符都在后面添加，而不是覆盖，true：是要，false：是不想要，默认是false,可以用在写程序日志中
 */
public class FileWriterY2 {
    public static void main(String[] args) throws IOException {
        //创建输出流对象
        FileWriter file=new FileWriter("D://JAVA学习//FileWriter方法使用.txt",true);
        //写一个字符串
        file.write("写一个字符串");
        file.write("\r\n");

        //写一个字符串中的一部分
        file.write("写一个字符串的一部分",2,8);
        file.write("\r\n");

        //写一个字符数据
        file.write('哈');
        file.write("\r\n");
        file.write(97);
        file.write("\r\n");


        //写一个字符数组数据
        char[] s={'字','符','数','组'};
        file.write(s);
        file.write("\r\n");

        //写一个字符数组的一部分数据
        file.write(s,2,2);
        file.write("\r\n");

        //释放
        file.close();
    }
}
