package apiY;

import java.util.Scanner;

/*
校验qq号码
  要求：1、必须时5-15位
      2、0不能开头
      3、必须都是数字

   正则表达式：有一套规则，可以用于匹配字符串
    构造方法
     boolean matches（string regex）
 */
public class RegexY {
    public static void main(String[] args) {
        System.out.println(putong());
        System.out.println(zhengze());
    }

    public static boolean zhengze() {
        //正则表达式匹配字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的qq号");
        String s = sc.nextLine();
        return s.matches("[1-9][0-9]{4,14}");
    }

    public static boolean putong() {
        //普通写法
        //必须都是数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的qq号");
        String s = sc.nextLine();
        int u = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= '0' && ch[i] <= '9') {
                u++;
            }
        }
        if (u == ch.length && u <= 15 && u >= 5) {
            if (ch[0] != '0') {
                return true;
            }
        }
        return false;


    }
}
