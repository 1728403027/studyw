package ManagementSystem;


import java.util.ArrayList;
import java.util.Scanner;

/*
学生成绩
 */
public class Results {
    private String Chinese;
    private String mathematics;
    private String English;
    private String physical;
    private ArrayList ch = new ArrayList();
    private ArrayList ma = new ArrayList();
    private ArrayList el = new ArrayList();
    private ArrayList ph = new ArrayList();
    private ArrayList subjects = new ArrayList();

    /*
把成绩存入集合
     */
    public Results() {
        ch.add("20");
        ma.add("20");
        el.add("20");
        ph.add("20");
        ch.add(Chinese);
        ma.add(mathematics);
        el.add(English);
        ph.add(physical);
        subjects.add("语文");
        subjects.add("数学");
        subjects.add("英语");
        subjects.add("物理");

    }

    public Results(String chinese, String mathematics, String english, String physical) {
        Chinese = chinese;
        this.mathematics = mathematics;
        English = english;
        this.physical = physical;
    }

    public String getChinese() {
        return Chinese;
    }

    public String getMathematics() {
        return mathematics;
    }

    public String getEnglish() {
        return English;
    }

    public String getPhysical() {
        return physical;
    }

    //判断老师是修改还是添加或者是删除学生成绩
    public void teach() {
        Information nam = new Information();
        Scanner sc = new Scanner(System.in);
        int m = 0;
        System.out.println("请问你要做什么操作：1、修改成绩 2、添加成绩 3、删除成绩 4、查看成绩");
        String s = sc.nextLine();
        char[] cha = s.toCharArray();
        for (int j = 0; j < cha.length; j++) {
            if (cha[j] >= '1' && cha[j] <= '4') {
                if (cha[j] == '1') {
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("请输入修改成绩学生的姓名");
                    String x = sc2.nextLine();
                    ArrayList name = nam.Information();
                    for (int i = 0; i < name.size(); i++) {
                        if (x.equals(name.get(i))) {
                            Scanner cj = new Scanner(System.in);
                            System.out.println("请输入要修改的科目");
                            String km = cj.nextLine();
                            int o = 0;
                            for (int op = 0; op < subjects.size(); op++) {
                                if (km.equals(subjects.get(op))) {
                                    Scanner scanner = new Scanner(System.in);
                                    System.out.println("请输入你要修改的成绩");
                                    String xj = scanner.nextLine();
                                    char[] chara = xj.toCharArray();
                                    int aa = 0;
                                    for (int chas = 0; chas < chara.length; chas++) {
                                        if (chara[chas] >= '0' && chara[chas] <= '9') {
                                            aa++;
                                        }
                                    }
                                    if (aa == chara.length) {
                                        if (subjects.get(op).equals("语文")) {
                                            ch.set(i, xj);
                                        } else if (subjects.get(op).equals("数学")) {
                                            ma.set(i, xj);
                                        } else if (subjects.get(op).equals("英语")) {
                                            el.set(i, xj);
                                        } else if (subjects.get(op).equals("物理")) {
                                            ph.set(i, xj);
                                        }
                                        Results results = new Results();
                                        System.out.println("成绩修改成功");
                                        System.out.println("语文:" + ch.get(i));
                                        System.out.println("数学:" + ma.get(i));
                                        System.out.println("英语:" + el.get(i));
                                        System.out.println("物理:" + ph.get(i));
                                    } else {
                                        System.out.println("你输入的成绩有误");
                                    }
                                    o++;
                                }
                            }
                            if (o == 0) {

                                System.out.println("你要修改的科目有误请检查");

                            }
                        }
                        m++;
                    }
                    if (m == 0) {
                        System.out.println("查询不到此学生请检查该学生姓名");
                    }
                } else if (cha[j] == '2') {
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("请输入添加成绩学生的姓名:");
                    String x = sc2.nextLine();
                    ArrayList name = nam.Information();
                    for (int i = 0; i < name.size(); i++) {
                        if (x.equals(name.get(i))) {
                            Scanner anner = new Scanner(System.in);
                            System.out.println("请输入你要修改的成绩");
                            String xj = anner.nextLine();
                            char[] chara = xj.toCharArray();
                            int aa = 0;
                            for (int chas = 0; chas < chara.length; chas++) {
                                if (chara[chas] >= '0' && chara[chas] <= '9') {
                                    aa++;
                                }
                            }
                            if (aa == chara.length) {
                                ch.add(i, xj);
                                ma.add(i, xj);
                                el.add(i, xj);
                                ph.add(i, xj);
                                Results results = new Results();
                            }

                        } else {
                            Scanner anners = new Scanner(System.in);
                            System.out.println("查询不到此学生请检查该学生姓名");
                            System.out.println("是否添加此学生");
                            String shi = anners.nextLine();
                            if (shi.equals("是")) {
                                Information info = new Information();
                                info.regin();
                            } else if (shi.equals("否")) {
                                System.out.println("请检查学生姓名");
                            } else {
                                System.out.println("你输入的指令有误");
                            }
                        }
                    }

                } else if (cha[j] == '3') {
                    int u = 0;
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("请输入删除成绩学生的姓名:");
                    String x = sc2.nextLine();
                    ArrayList name = nam.Information();
                    for (int i = 0; i < name.size(); i++) {
                        if (x.equals(name.get(i))) {
                            Scanner cj = new Scanner(System.in);
                            System.out.println("请输入要删除成绩的科目");
                            String km = cj.nextLine();
                            for (int op = 0; op < subjects.size(); op++) {
                                if (km.equals(subjects.get(op))) {
                                    if (subjects.get(op).equals("语文")) {
                                        ch.remove(i);
                                    } else if (subjects.get(op).equals("数学")) {
                                        ma.remove(i);
                                    } else if (subjects.get(op).equals("英语")) {
                                        el.remove(i);
                                    } else if (subjects.get(op).equals("物理")) {
                                        ph.remove(i);
                                    }
                                    System.out.println("成绩删除成功");
                                    System.out.println("语文:" + ch.get(i));
                                    System.out.println("数学:" + ma.get(i));
                                    System.out.println("英语:" + el.get(i));
                                    System.out.println("物理:" + ph.get(i));
                                }
                            }
                        }
                        u++;
                    }
                    if (u == 0) {

                        System.out.println("查询不到此学生请检查该学生姓名");

                    }
                } else if (cha[j] == '4') {
                    this.chaxun();
                }
            } else {
                System.out.println("你的操作指令有误");
            }
        }
    }

    //查询成绩
    public void chaxun() {
        Information nam = new Information();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入要查询成绩学生的姓名");
        String x = sc2.nextLine();
        int n = 0;
        ArrayList name = nam.Information();
        for (int i = 0; i < name.size(); i++) {
            if (x.equals(name.get(i))) {
                n++;
                Scanner s2 = new Scanner(System.in);
                System.out.println("请问你要查询该同学的成绩：1、全部成绩 2、单科成绩");
                String string = s2.nextLine();
                char cha2[] = string.toCharArray();
                for (int b = 0; b < cha2.length; b++) {
                    if (cha2[b] == '1') {
                        System.out.println(name.get(i));
                        System.out.println("语文" + ch.get(i));
                        System.out.println("数学" + ma.get(i));
                        System.out.println("英语" + el.get(i));
                        System.out.println("物理" + ph.get(i));
                    } else if (cha2[b] == '2') {
                        Scanner cj = new Scanner(System.in);
                        System.out.println("请输入要查询单科成绩的科目");
                        String km = cj.nextLine();
                        int bt = 0;
                        for (int op = 0; op < subjects.size(); op++) {
                            if (km.equals(subjects.get(op))) {
                                if (subjects.get(op).equals("语文")) {
                                    System.out.println("语文" + ch.get(i));
                                } else if (subjects.get(op).equals("数学")) {
                                    System.out.println("数学" + ma.get(i));
                                } else if (subjects.get(op).equals("英语")) {
                                    System.out.println("英语" + el.get(i));
                                } else if (subjects.get(op).equals("物理")) {
                                    System.out.println("物理" + ph.get(i));
                                }
                            }
                            bt++;
                        }
                        if(bt==0){System.out.println("你要查询成绩的科目有误请检查");}
                    } else {
                        System.out.println("你输入的指令有误");
                    }
                }
            }
        }
        if (n == 0) {

            System.out.println("查询不到此学生请检查该学生姓名");

        }


    }

}
