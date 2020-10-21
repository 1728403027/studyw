package ManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;
/*
学生管理系统
  判断是老师还是学生进行登录
 */

public class Login {
    public  Login(ArrayList tzh, ArrayList tmm, ArrayList Szhlist, ArrayList Smimalist) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的身份：1、老师  2、学生");
        int s = sc.nextInt();
        if (s == 1) {
            TeacherLogin teacher = new TeacherLogin();
            teacher.TeacherLogin();
        } else if (s == 2) {
            StudentsLogin students = new StudentsLogin();
            students.StudentsLogins(Szhlist, Smimalist);
        } else {
            System.out.println("你的操作有误");

        }
    }

}