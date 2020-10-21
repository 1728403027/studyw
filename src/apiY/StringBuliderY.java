package apiY;
/*
string和stringbuilder的区别
    string的内容是固定的
    stringbuilder的内容是口可变的

构造方法
  StringBuilder（）

成员方法
   public int capacity（）：返回当前容量
   public int length（）:返回长度（字符数）

    容量：理论值
    长度：实际值
 */
public class StringBuliderY {
    public StringBuliderY(){
        //创建stringbuilder对象
        StringBuilder buil=new StringBuilder();
        System.out.println(buil);
        System.out.println("buil.capacity()："+buil.capacity());
        System.out.println("buil.length()："+buil.length());
    }
}
