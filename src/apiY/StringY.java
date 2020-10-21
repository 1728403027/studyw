package apiY;
/*
string ：字符串类型
  有多个字符串组成的一串数据
  字符串其实本质是一个字符串数组

构造方法
   string（string original）：把字符串数据封装成字符串对象
   string（char[] value）:把字符数组的数据封装成字符串对象
   string（char[] value,int index,int count）:把字符数据中的一部分数据封装成字符串对象
 */
public class StringY {
    public static void main(String[] args) {
        //string(string original)
        String s=new String("haha");
        System.out.println(s);

        //string(char value)
        char [] a={'1','2','3'};
        String s2=new String(a);
        System.out.println(s2);

        //string(char [] value,int index,int count)
        //index:表示是从第几个数开始   count：表示到第几个数结束
        char [] g={'6', 'h','a'};
        String s3=new String(g,0,2);
        System.out.println(s3);

        //string简便的写法
        String s4="6 21 45";
        System.out.println(s4);
    }
}
