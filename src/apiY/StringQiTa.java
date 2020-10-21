package apiY;
/*
string类的其他功能
   去除字符串两端空格
      string trim（）
    按指定符号分割字符串
       string[] split(string str)
 */
public class StringQiTa {
    public StringQiTa(){
        //去除两端的空格
        String s="  abc";
        String s2="a  b   c";
        String s3="abc   ";
        System.out.println(s);
        System.out.println(s.trim());
        System.out.println(s2);
        System.out.println(s2.trim());
        System.out.println(s3);
        System.out.println(s3.trim());


        //按指定符号分割
        String c="10,25,84";
       String [] a=c.split(",");
       for (int i=0;i<a.length;i++){
           System.out.println(a[i]);
       }
    }
}
