package ioY;

import java.io.*;
import java.util.ArrayList;

/*
IO流练习
 1、把arraylist集合中的字符串储存到文本文件
   要求：1、每个字符串元素作为文件的一行数据
  2、从文本文件中读取数据arraylist集合并遍历
    1、每一行数据作为一个字符元素串
 */
public class BuffereStreamTuShuPractice {
    public static void main(String[] args) throws IOException {
        //把arraylist集合中的字符串储存到文本文件
        ArrayList <String> list=new ArrayList<String>();
        list.add("haha");
        list.add("123");
        list.add("死的");
        BufferedWriter bw=new BufferedWriter(new FileWriter("d://JAVA学习//IO练习.txt",true));
        for (int i=0;i<list.size();i++){
            bw.write(list.get(i));
            bw.newLine();
        }

        //从文本文件中读取数据arraylist集合并遍历
        ArrayList <String> list2=new ArrayList<String>();
        BufferedReader br=new BufferedReader(new FileReader("d:\\JAVA学习\\账号.txt"));
        String str;
        while ((str=br.readLine())!=null){
            list2.add(str);
        }
        for(int i=0;i<list2.size();i++){
            System.out.println(list2.get(i));
        }
        bw.close();
        br.close();
    }
}
