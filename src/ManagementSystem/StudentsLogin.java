package ManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

/*
学生管理系统
  学生类
 */
public class StudentsLogin {
    //学生登录后可以做的操作
    int m = 0;

    public  int StudentsLogin() {
        return m;
    }

    public void StudentsLogins(ArrayList Szhlist, ArrayList Smimalist) {
        Information info=new Information();
        Scanner zt = new Scanner(System.in);
        Scanner mt = new Scanner(System.in);
        System.out.println("请输入账号:");
        String zhanghaos = zt.nextLine();
        int zh = 0;
        int mi = 0;
        for (int x = 0; x < Szhlist.size(); x++) {
            if (Szhlist.get(x).equals(zhanghaos)) {
                zh++;
            }
        }
        if (zh != 0) {
            System.out.println("请输入密码：");
            String mimas = mt.nextLine();
            for (int y = 0; y < Smimalist.size(); y++) {
                if (Smimalist.get(y).equals(mimas)) {
                    mi++;
                }

            }
        }
        if (mi != 0) {
            System.out.println("请问你要做什么以下什么操作");
            Scanner sc = new Scanner(System.in);
            System.out.println("1、查看个人信息 2、查询成绩 3、修改密码");
            String str = sc.nextLine();
            char[] cha = str.toCharArray();
            for (int i = 0; i < cha.length; i++) {
                if (cha[i] >= '1' || cha[i] <= '3') {
                    if (cha[i] == '1') {
                        int p = info.judge();
                        if (p == 2) {
                            Scanner scc = new Scanner(System.in);
                            System.out.println("请输入你要查询学生的名字：");
                            String name = scc.nextLine();
                            ArrayList inna = info.Information();
                            info.with();
                            for (int s = 0; s < inna.size() - 1; s++) {
                                if (inna.get(s).equals(name)) {
                                    System.out.println("姓名"+info.getName());
                                    System.out.println("年龄"+info.getAge());
                                    System.out.println("民族"+info.getGender());
                                    System.out.println("籍贯"+info.getNational());
                                    m++;
                                }
                            }
                            if (m == 0) {
                                System.out.println("你要查找的学生不存在");
                            }
                        } else if (p == 1) {
                            Scanner scc = new Scanner(System.in);
                            System.out.println("请输入你要修改的名字：");
                            String name = scc.nextLine();
                            ArrayList inna = info.Information();
                            int m = 0;
                            for (int s = 0; s < inna.size() - 1; s++) {
                                if (inna.get(s).equals(name)) {
                                    Scanner sca = new Scanner(System.in);
                                    System.out.println("请输入年龄：");
                                    String age = sca.nextLine();
                                    Scanner sg = new Scanner(System.in);
                                    System.out.println("请输入性别：");
                                    String gender = sg.nextLine();
                                    Scanner sn = new Scanner(System.in);
                                    System.out.println("请输入籍贯：");
                                    String national = sn.nextLine();
                                    info.setName(name);
                                    info.setAge(age);
                                    info.setGender(gender);
                                    info.setNational(national);
                                    m++;
                                    System.out.println("修改成功");
                                    System.out.println("姓名"+info.getName());
                                    System.out.println("年龄"+info.getAge());
                                    System.out.println("民族"+info.getGender());
                                    System.out.println("籍贯"+info.getNational());
                                }
                            }
                            if (m == 0) {
                                System.out.println("你要修改的学生不存在");
                            }
                        } else if (p == 0) {
                            System.out.println("你的操作指令有误");
                        }
                    } else if (cha[i] == '2') {
                        Results results = new Results();
                        results.chaxun();
                    } else if (cha[i] == '3') {
                        Registered registered = new Registered();
                        registered.Modify();
                    }
                } else {
                    System.out.println("你输入的指令有误");
                }
            }
        } else {
            System.out.println("你输入的账号和密码有误请检查");
        }

    }
}

