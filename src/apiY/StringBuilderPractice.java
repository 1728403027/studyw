package apiY;

/*
stringbilder练习
 1、stringbuilder和string的相互转换
 2、把数组拼接成一个字符串
 3、把字符串反转
 4、判断一个字符串是否是对称字符串
    如“abc"不是对称字符串，”aba“，”abba“是对称字符串
 */
public class StringBuilderPractice {
    public StringBuilderPractice() {
        //stringbuilder转换string
        StringBuilder stb = new StringBuilder();
        stb.append("13232").append("asds").append("你好");
        String st = stb.toString();
        //string类转换成stringbuilder类
        StringBuilder stbu = new StringBuilder(st);
        System.out.println(st);

        //把数组拼成一个字符串
        String s = "";
        char[] chars = {'1', 'f', '我'};
        for (int i = 0; i < chars.length; i++) {
            s += chars[i];
        }
        //string类转换成stringbuilder类
        StringBuilder strb = new StringBuilder(s);
        System.out.println(strb);

        //把字符串反转
        StringBuilder strde = strb.reverse();
        System.out.println(strde);

        //判断字符串是否是一个对称字符串
        StringBuilder b = new StringBuilder(s);
        b.reverse();
        String b1 = b.toString();
        System.out.println(b.equals(b1));
    }
}
