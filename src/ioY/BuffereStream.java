package ioY;

import java.io.*;

/*
bufferewriter:将文本写入字符输出流。缓冲个够字符，从而提供单个字符，数组和字符放入高效写入
bufferereader:从字符输入缓冲中读取文本，缓冲个够字符，从而实现字符，数组和高效读取
 */
public class BuffereStream {
    public static void main(String[] args) throws IOException {
        //bufferewriter:将文本写入字符输出流。缓冲个够字符，从而提供单个字符，数组和字符放入高效写入
//        BufferedWriter bw=new BufferedWriter(new FileWriter("d:\\JAVA学习\\BuffereWriter.txt"));
//        bw.write("bufferewriter");

        //bufferereader:从字符输入缓冲中读取文本，缓冲个够字符，从而实现字符，数组和高效读取
        BufferedReader br=new BufferedReader(new FileReader("d:\\JAVA学习\\BuffereWriter.txt")) ;
//        //一个字节一个字节读
//        int le;
//        while ((le=br.read())!=-1){
//            System.out.print((char) le);
//        }

        //一次读取一个数组字符的数据
        char[] cha=new char[1024];
        int le;
        while ((le=br.read(cha))!=-1){
            System.out.println(new String(cha,0,le));
        }

       // bw.close();
        br.close();
    }
}
