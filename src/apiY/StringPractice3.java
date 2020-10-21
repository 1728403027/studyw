package apiY;

import java.util.Scanner;

/*
String类练习
  1、把数组的数据按照指定格式拼接成一个字符串
     举例：int[] arr={1,2,3}; 输出结果：[1,2,3]
  2、字符串反转
    举例：键盘录入“abc”  输出结果：“cba”
   */
public class StringPractice3 {
    public StringPractice3() {
        //把数组的数据按指定格式拼成一个字符串
        Scanner s=new Scanner(System.in);
        System.out.println("请输入字符串");
        String st=s.nextLine();
        char [] str=st.toCharArray();
        String d="";
        d+="[";
        for (int i=0;i<str.length;i++){
            if(i==str.length-1){
                d+=str[i];
            }else {
                d+=str[i];
                d+=",";
            }
        }
        d+="]";
        System.out.println(d);

    }
    //字符反转
    public  static void fanzhuan(){
        Scanner s=new Scanner(System.in);
        System.out.println("请输入字符串");
        String st=s.nextLine();
        char[] string=st.toCharArray();
        String d="";
        for(int i=0;i<string.length-i;i++){
            char c=string[i];
            string[i]=string[string.length-(i+1)];
            string[string.length-(i+1)]=c;
        }
        for(int i=0;i<string.length;i++){
            d+=string[i];
        }
        System.out.println("转换后为："+d);
    }
}
