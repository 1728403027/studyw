package apiY;

import java.util.Scanner;

/*
测试各种类和各种类里面的方法
 */
public class TestPractice {
    public static void main(String[] args) {
//        //stringlei小测试登入
//        System.out.println("请问你要进行以下哪种操作");
//        System.out.println("1、登录  2、注册  3、找回密码  4、修改账户和密码");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入你要操作的值");
//        int s = sc.nextInt();
//        if (s < 4 && s > 0) {
//            StringPractice sp = new StringPractice();
//            sp.StringPractice(s);
//        } else if (s == 4) {
//            Scanner zh = new Scanner(System.in);
//            System.out.println("请输入你的账号");
//            String hh = zh.nextLine();
//            StringPractice sp = new StringPractice();
//            String zhanghu = sp.getZhanghu();
//            if (zhanghu.equals(hh)) {
//                Scanner mim = new Scanner(System.in);
//                System.out.println("请输入你要修改的密码");
//                String mim2 = mim.nextLine();
//                sp.setMima(mim2);
//                System.out.println("你现在的密码是：" + mim2);
//            } else {
//
//                System.out.println("账号不存在");
//            }
//        } else {
//            System.out.println("你输入的指令有误");
//        }


        //string2类练习
        StringPractice2 stringPractice2 = new StringPractice2();

//        //string3练习
//        StringPractice3 stringPractice3 = new StringPractice3();
//        //第二题
//        stringPractice3.fanzhuan();
//
//
//        //stringbuilder练习
//        StringBuilderPractice strp = new StringBuilderPractice();
    }
}
