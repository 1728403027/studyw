package ManagementSystem;

/*
老师类
 */

import java.util.ArrayList;
import java.util.Scanner;

public class TeacherLogin {


    //老师登录后可以做的操作
    public  void TeacherLogin() {
    Initialize ini=new Initialize();
    Information info=new Information();
        Scanner zt = new Scanner(System.in);
        Scanner mt = new Scanner(System.in);
        System.out.println("请输入账号:");
        String zhanghaot = zt.nextLine();
        int zh = 0;
        int mi = 0;
        for (int x = 0; x < ini.getTzhlist().size(); x++) {
            if (ini.getTzhlist().get(x).equals(zhanghaot)) {
                zh++;
            }
        }
        if (zh != 0) {
            System.out.println("请输入密码：");
            String mimat = mt.nextLine();
            for (int y = 0; y < ini.getTmimalist().size(); y++) {
                if (mimat.equals(ini.getTmimalist().get(y))){
                    mi++;
                }

            }
        }
        if (mi != 0) {
            System.out.println("请问你要做什么以下什么操作");
            Scanner sc = new Scanner(System.in);
            System.out.println("1、查看学生个人信息 2、查看学生成绩   3、修改密码 4、删除学生");
            String str = sc.nextLine();
            char[] cha = str.toCharArray();
            for (int i = 0; i < cha.length; i++) {
                if (cha[i] >= '1' || cha[i] <= '3') {
                    if (cha[i] == '1') {
                        ArrayList inna = info.Information();
                        int p = info.judge();
                        if (p == 2) {
                            Scanner scc = new Scanner(System.in);
                            System.out.println("请输入你要查询学生的名字：");
                            String name = scc.nextLine();
                            info.with();
                            int m = 0;
                            for (int s = 0; s < inna.size()-1; s++) {
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
                            System.out.println("请输入你要修改学生的名字：");
                            String name = scc.nextLine();
                            int m = 0;
                            for (int s = 0; s <inna.size()-1; s++) {
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
                        results.teach();
                    } else if (cha[i] == '3') {
                        Registered re = new Registered();
                        re.Modify();
                    } else if (cha[i] == '4') {
                        info.delete();
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
