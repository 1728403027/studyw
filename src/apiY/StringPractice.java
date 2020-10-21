package apiY;

import java.util.Scanner;

/*
模拟登录，给三次机会，并提示还有几次
 */
public class StringPractice {
    private String zhanghu = "123456";
    private String mima = "qaz123";
    int ci = 3;

    public void StringPractice(int s) {
        char[] c = new char[zhanghu.length()];
        char[] aa = new char[mima.length()];
        if (s == 1) {
            ci--;
            Scanner zhang = new Scanner(System.in);
            System.out.println("请输入你的账户");
            String hu = zhang.nextLine();
            Scanner mi = new Scanner(System.in);
            System.out.println("请输入你的密码");
            String ma = mi.nextLine();

            if (hu.equals(zhanghu) && ma.equals(mima)) {
                System.out.println("登入成功");
            } else {

                if (ci > 0) {
                    System.out.println("你输入的账户或密码有误请从新输入");
                    System.out.println("你还有" + ci + "次机会输入");
                    this.StringPractice(s);

                } else {
                    System.out.println("你已经输入3次账户和密码错误，请24小时后在登入");

                }
            }
        } else if (s == 2) {

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的手机号码");
            String sj = sc.nextLine();
            if (zhanghu.equals(sj)) {
                System.out.println("你的手机号码已被注册");
            } else if (sj.startsWith("1")) {
                c[0] = sj.charAt(0);
                Scanner mia = new Scanner(System.in);
                System.out.println("请输入密码");
                String mm = mia.nextLine();

                if (mm.equals("")) {
                    Scanner mia2 = new Scanner(System.in);
                    String mm2 = mia2.nextLine();
                    for (int j = 0; j < aa.length; j++) {
                        //string类型存入char类型的数组中
                        aa[j] = mm2.charAt(j);
                    }
                    System.out.println("注册成功");
                } else {

                        aa[0] = mm.charAt(0);

                    System.out.println("注册成功");
                }
            } else {
                System.out.println("你输入的手机号有误");
            }

        } else if (s == 3) {
            Scanner zhao = new Scanner(System.in);
            System.out.println("请输入你要找回密码的账号");
            int hui = zhao.nextInt();
            int mma = 0;
            for (int j = 0; j < c.length; j++) {
                if (hui == c[j]) {
                    mma = aa[j];
                    System.out.println("你要找回账号的密码为：" + mma);
                } else {
                    System.out.println("账号不存在");
                }
            }

        }

    }


    public void setZhanghu(String zhanghu) {
        this.zhanghu = zhanghu;
    }

    public void setMima(String mima) {
        this.mima = mima;
    }

    public String getZhanghu() {
        return zhanghu;
    }

    public String getMima() {
        return mima;
    }

}
