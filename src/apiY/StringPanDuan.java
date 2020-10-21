package apiY;
/*
string类的判断功能
  object：是类层次结构中的根类（也就是父类），所有的类都直接或者间接的继承自该类
  如果一个方法的形式参数是object，那么这里我们就可以传递它的任意的子类对象

  string类的判断功能
  boolean equals（object obj）：比较字符串的内容是否相同
  boolean equaldIgnoreCase(String str)：比较字符串的内容是否相等，忽略大小写
  boolean startsWith（String str）：判断字符串对象是否指定的str开头
  boolean  endWith（string str）：判断字符串对象是否以指定的str结尾
 */
public class StringPanDuan {
    public static void main(String[] args) {
        //创建字符串对象
        String s1="nihao";
        String s2="nihao";
        String s3="Nihao";

        //equals(比较内容是否相等)
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        //equaldIlgnoreCase
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));

        //startaWith
        System.out.println(s1.startsWith("ni"));
        System.out.println(s2.startsWith("Ni"));

        //endsWith
        System.out.println(s1.endsWith("ao"));
        System.out.println(s2.endsWith("o"));
    }
}
