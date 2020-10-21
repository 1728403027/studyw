package apiY;

import java.util.Scanner;

/*
string类练习
  要求：遍历字符串
     统计一个字符串中大写字母和小写字母、数字字符出现的次数
 */
public class StringPractice2 {
    int a = 0;
    int b = 0;
    int c = 0;

    public StringPractice2() {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入密码");
        String st = s.nextLine();
        char[] ca = st.toCharArray();
        //判断是否包含大小写和数字字符
        for (int i = 0; i < ca.length; i++) {
            if (ca[i] >= 'A' && ca[i] <= 'Z') {
                a++;
            } else if (ca[i] >= 'a' && ca[i] <= 'z') {
                b++;
            } else if (ca[i] >= '0' && ca[i] <= '9') {
            }
        }
        if (a>=0||b>=0||c>=0){
            System.out.println("大写字母出现了：" + a+ "次");
            System.out.println("小写字母出现了：" + b+ "次");
            System.out.println("数字出现了：" + c+ "次");
        }else {
            System.out.println("你输入的密码带有特殊字符");
        }
    }

}
