package ManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

/*
学生的个人信息
 */
public class Information {
    private String name;
    private String age;
    private String gender;
    private String national;
    private ArrayList<String> name2 = new ArrayList<String>();
    private ArrayList<String> age2 = new ArrayList<String>();
    private ArrayList<String> gender2 = new ArrayList<String>();
    private ArrayList<String> national2 = new ArrayList<String>();

    public void setName(String name) {
        int nam = 0;
        char[] na = name.toCharArray();
        for (int i = 0; i < na.length; i++) {
            if (na[i] >= '0' && na[i] <= '9') {
                nam++;
                System.out.println("你输入的名字有误请检查");
            }
        }
        if (nam == 0) {
            this.name = name;
        }
        this.Information();
    }

    public void setAge(String age) {
        char[] ag = age.toCharArray();
        int ages = 0;
        for (int i = 0; i < ag.length; i++) {
            if (ag[i] >= 'a' && ag[i] <= 'z' && ag[i] >= 'A' && ag[i] <= 'Z' && ag[i] <= ('2' + '0') && ag[i] > '0') {
                ages++;
                System.out.println("你输入的年龄有误请检查");
            }
        }
        if (ages == 0) {
            this.age = age;
        }
        this.Information();
    }

    public void setGender(String gender) {
        char[] ge = age.toCharArray();
        int gen = 0;
        for (int i = 0; i < ge.length; i++) {
            if (ge[i] >= 'a' && ge[i] <= 'z' && ge[i] >= 'A' && ge[i] <= 'Z' && ge[i] <= '9' && ge[i] >= '0') {
                gen++;
                System.out.println("你输入的性别有误请检查");
            }
        }
        if (gen == 0) {
            this.gender = gender;
        }
        this.Information();
    }

    public void setNational(String national) {
        char[] nat = age.toCharArray();
        int nati = 0;
        for (int i = 0; i < nat.length; i++) {
            if (nat[i] >= 'a' && nat[i] <= 'z' && nat[i] >= 'A' && nat[i] <= 'Z' && nat[i] <= '9' && nat[i] >= '0') {
                nati++;
                System.out.println("你输入的籍贯有误请检查");
            }
        }
        if (nati == 0) {
            this.national = national;
        }
        this.Information();
    }



    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getNational() {
        return national;
    }

    //把个人信息存入集合
    public ArrayList Information() {
        name2.add("hha");
        age2.add("20");
        gender2.add("汉");
        national2.add("北京");
        name2.add(this.name);
        age2.add(this.age);
        gender2.add(this.gender);
        national2.add(this.national);
        return name2;
    }

    //判断是否要修改信息
    public int judge() {
        System.out.println("请问你要进行什么操作");
        Scanner sc = new Scanner(System.in);
        System.out.println("1、修改个人信息 2、查看个人信息");
        int s = sc.nextInt();
        if (s == 1) {
            return 1;
        } else if (s == 2) {
            return 2;
        } else {
            return 0;
        }
    }

    //注册添加个人信息
    public void regin() {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = s.nextLine();
        Scanner s2 = new Scanner(System.in);
        System.out.println("请输入年龄：");
        String age = s2.nextLine();
        Scanner s3 = new Scanner(System.in);
        System.out.println("请输入性别：");
        String gender = s3.nextLine();
        Scanner s4 = new Scanner(System.in);
        System.out.println("请输入籍贯：");
        String natioal = s4.nextLine();
        Information info = new Information();
        info.setName(name);
        info.setAge(age);
        info.setGender(gender);
        info.setNational(natioal);
        name2.add(name);
        age2.add(age);
        gender2.add(gender);
        national2.add(natioal);
    }

    //删除学生
    public void delete() {
        this.Information();
        Scanner s = new Scanner(System.in);
        System.out.println("请输入你要删除学生的姓名：");
        String name = s.nextLine();
        int m = 0;
        for (int i = 0; i < name2.size() - 1; i++) {
            if (name2.get(i).equals(name)) {
                name2.remove(i);
                age2.remove(i);
                gender2.remove(i);
                national2.remove(i);
                System.out.println("学生删成功");
                m++;
            }
        }
        if (m == 0) {
            System.out.println("你要删除学生不存在请检查");
        }
    }

    //把个人信息从集合拿出来
    public void with() {
        Registered re = new Registered();
        StudentsLogin su = new StudentsLogin();
        int s = su.StudentsLogin();
        name = name2.get(s);
        age = age2.get(s);
        gender = gender2.get(s);
        national = national2.get(s);
    }
}
