package ManagementSystem;
import java.util.ArrayList;
import java.util.Scanner;

/*
学生管理系统
  注册
 */
public class Registered {
   Initialize ini=new Initialize();
    //注册
    public void Registered() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的身份：1、老师  2、学生");
        int s = sc.nextInt();
        if (s == 1) {
            Scanner zt = new Scanner(System.in);
            Scanner mt = new Scanner(System.in);
            System.out.println("请输入手机号:");
            String zhanghaot = zt.nextLine();
            char[] cha = zhanghaot.toCharArray();
            int zh = 0;
            int mi = 0;
            for (int i = 0; i < cha.length; i++) {
                if (cha[i] >= '0' || cha[i] <= '9') {
                    zh++;
                }
            }
            for (int c = 0; c < ini.getTzhlist().size(); c++) {
                if (zhanghaot.equals(ini.getTzhlist())) {
                    zh++;
                }
            }
            if (zh == cha.length) {
                System.out.println("请输入密码：");
                String mimat = mt.nextLine();
                char[] cham = mimat.toCharArray();
                for (int j = 0; j < cham.length; j++) {
                    if (cham[j] >= '0' || cham[j] <= '9' || cham[j] >= 'a' || cham[j] <= 'z' || cham[j] >= 'A' || cham[j] <= 'Z') {
                        mi++;
                    }
                }
                if (mi == cham.length) {
                    ArrayList<String> arr=new ArrayList<String>();
                    arr.add(zhanghaot);
                    ArrayList<String> arrt=new ArrayList<String>();
                    arrt.add(mimat);
                    Initialize init=new Initialize(arr,arrt);
                    System.out.println("注册成功");
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("是否登录：1、是  2、否");
                    String dl = scanner.nextLine();
                    char[] sf = dl.toCharArray();
                    for (int v = 0; v < sf.length; v++) {
                        if (sf[v] == '1' || sf[v] == '2') {
                            if (sf[v] == '1') {
                                ini.getTzhlist().add(mimat);
                                ini.getTmimalist().add(zhanghaot);
                                TeacherLogin te = new TeacherLogin();
                                te.TeacherLogin();
                            } else {
                                Judge ju = new Judge();
                                ju.Judges();
                            }
                        } else {
                            System.out.println("你输入的指令有误");
                        }
                    }

                } else {
                    System.out.println("你输入的密码含有特殊符号请检查");
                }


            } else {
                System.out.println("你输入的账号有误请检查");
            }
        } else if (s == 2) {
            Scanner zt = new Scanner(System.in);
            Scanner mt = new Scanner(System.in);
            System.out.println("请输入手机号:");
            String zhanghaos = zt.nextLine();
            char[] cha = zhanghaos.toCharArray();
            int zh = 0;
            int mi = 0;
            for (int i = 0; i < cha.length; i++) {
                if (cha[i] >= '0' || cha[i] <= '9') {
                    zh++;
                }
            }
            for (int c = 0; c < ini.getSzhlist().size(); c++) {
                if (zhanghaos.equals(ini.getSzhlist())) {
                    zh++;
                }
            }
            if (zh == cha.length) {
                System.out.println("请输入密码：");
                String mimas = mt.nextLine();
                char[] cham = mimas.toCharArray();
                for (int j = 0; j < cham.length; j++) {
                    if (cham[j] >= '0' || cham[j] <= '9' || cham[j] >= 'a' || cham[j] <= 'z' || cham[j] >= 'A' || cham[j] <= 'Z') {
                        mi++;
                    }
                }
                if (mi == cham.length) {
                    ArrayList<String> arrs=new ArrayList<String>();
                    arrs.add(zhanghaos);
                    ArrayList<String> arrt=new ArrayList<String>();
                    arrt.add(mimas);
                    ini.setSzhlist(arrs);
                    ini.setSmimalist(arrt);
                    System.out.println("注册成功");
                    Scanner scanne = new Scanner(System.in);
                    System.out.println("是否添加个人信息：1、是  2、否");
                    String tj = scanne.nextLine();
                    char[] gr = tj.toCharArray();
                    for (int v = 0; v < gr.length; v++) {
                        if (gr[v] == '1' || gr[v] == '2') {
                            if (gr[v] == '1') {
                                Information inf=new Information();
                                inf.regin();
                            } else {
                                Judge ju = new Judge();
                                ju.Judges();
                            }
                        } else {
                            System.out.println("你输入的指令有误");
                        }
                    }

                    Scanner scanner = new Scanner(System.in);
                    System.out.println("是否登录：1、是  2、否");
                    String dl = scanner.nextLine();
                    char[] sf = dl.toCharArray();
                    for (int v = 0; v < sf.length; v++) {
                        if (sf[v] == '1' || sf[v] == '2') {
                            if (sf[v] == '1') {
                                ini.getSzhlist().add(mimas);
                                ini.getSmimalist().add(zhanghaos);
                                StudentsLogin students = new StudentsLogin();
                                students.StudentsLogins(ini.getSzhlist(),ini.getSmimalist());
                                Information info = new Information();
                                info.regin();
                            } else {
                                Judge ju = new Judge();
                                ju.Judges();
                            }
                        } else {
                            System.out.println("你输入的指令有误");
                        }
                    }
                } else {
                    System.out.println("你输入的密码含有特殊符号请检查");
                }


            } else {
                System.out.println("你输入的账号有误请检查");
            }

        } else {
            System.out.println("你的操作有误");

        }

    }
    //修改密码
    public void Modify() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号：");
        String sj = sc.nextLine();
        char[] chars = sj.toCharArray();
        int j = 0;
        int s = 0;
        int y = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                j++;
            }
        }
        if (j == chars.length) {
            for (int i = 0; i < ini.getTzhlist().size(); i++) {
                for (int e = 0; e < ini.getSmimalist().size(); e++) {
                    if (ini.getTzhlist().get(i).equals(sj)) {
                        s = i;
                        y++;
                    } else if (ini.getSmimalist().get(e).equals(sj)) {
                        s = e;
                        y += 2;
                    }
                }
            }
            int mi = 0;
            Scanner sm = new Scanner(System.in);
            System.out.println("请输入你新的密码：");
            String m = sm.nextLine();
            char[] cham = m.toCharArray();
            for (int c = 0; c < cham.length; c++) {
                if (cham[c] >= '0' || cham[c] <= '9' || cham[c] >= 'a' || cham[c] <= 'z' || cham[c] >= 'A' || cham[c] <= 'Z') {
                    mi++;
                }
            }
            if (mi != 0) {
                if (y == 1) {
                    ini.getTmimalist().set(s, m);
                    System.out.println("密码修改成功");
                    System.out.println("新的密码为："+m);
                    Login lo=new Login(ini.getTzhlist(),ini.getTmimalist(),ini.getSzhlist(),ini.getSmimalist());
                } else if (y == 2) {
                   ini.getSmimalist().set(s, m);
                    System.out.println("密码修改成功");
                    System.out.println("新的密码为："+m);
                    Login lo=new Login(ini.getTzhlist(),ini.getTmimalist(),ini.getSzhlist(),ini.getSmimalist());
                } else {
                    System.out.println("你输入的账号不存在");
                    Scanner zc=new Scanner(System.in);
                    System.out.println("是否要注册：1、是 2、否");
                    String ho=zc.nextLine();
                    char[] cha=ho.toCharArray();
                    for(int i=0;i<cha.length;i++){
                        if (cha[i]=='1'){
                            Registered();
                        }else if(cha[i]=='2'){
                            Login lo=new Login(ini.getTzhlist(),ini.getTmimalist(),ini.getSzhlist(),ini.getSmimalist());
                        }else {
                            System.out.println("你输入的指令有误");
                        }
                    }
                }
            }
        } else {
            System.out.println("你输入的手机号有误请检查");
        }
    }
}

