package apiY;

/*
string类获取功能
int length（）：获取字符串的长度，其实也就是字符串个数
char charAt(int index):获取指定索引的字符
int indexOf(String sttr):获取str在字符串对象中第一次出现的索引
String substring(int start):从start开始截取字符串
String substring（int start，int end）：从start开始，end结束截取字符串
 */
public class StringHuoQu {
    private String s = "halouwode";

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public StringHuoQu() {

        //获取字符串长度
        System.out.println(s.length());
        //获取指定索引的字符
        System.out.println(s.charAt(1));
        //获取xx在字符串对象第一次出现的索引
        System.out.println(s.indexOf("o"));
        //从XX开始截取字符串
        System.out.println(s.substring(2));
        //从XX开始到xx结束截取字符串对象
        System.out.println(s.substring(2,5));
    }

}
