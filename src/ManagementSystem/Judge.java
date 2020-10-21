package ManagementSystem;

import java.util.Scanner;
/*
学生管理系统
  判断操作
 */
public class Judge {
   private Initialize re=new Initialize();
    public void Judges() {
        System.out.println("--------------欢迎来到学生管理系统--------------");
        Scanner sc=new Scanner(System.in);
        System.out.println("请问你要做哪些操作：1、登录   2、注册  3、找回密码");
        int s=sc.nextInt();
        if (s==1) {
        Login lo=new  Login(re.getTzhlist(),re.getTmimalist(),re.getSzhlist(),re.getSmimalist());

        } else if (s==2) {
            Registered re=new Registered();
            re.Registered();
        } else if (s==3) {

           re.back();
        } else {
            System.out.println("你操作有误请重新操作");
            Judge judge=new Judge();
            judge.Judges();
        }
    }
}
