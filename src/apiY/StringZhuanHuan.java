package apiY;
/*
sring类的转换功能
char[] toCharArray():把字符串转换为字符数组
String toLowerCase（）：把字符串转换为小写字符串
string toUpperCase():把字符串转换为大写字符串
 */
public class StringZhuanHuan {
    private String s="SKJdaskll";

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public StringZhuanHuan() {
        //把字符串转换为字符数组
        char[] cha = s.toCharArray();
        for (int i = 0; i < cha.length; i++) {
            System.out.println(cha[i]);
        }
        //把字符串转换成小写
        System.out.println(s.toLowerCase());
        //把字符串转换成大写
        System.out.println(s.toUpperCase());
    }
}

