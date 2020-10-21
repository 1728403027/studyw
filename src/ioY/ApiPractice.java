package ioY;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
常用api练习
1、键盘录入3个学生学习（学号，姓名，年龄，居住地）
存入集合，然后遍历集合把每一个学生信息存入文本文件（每一个学生信息为一行，自己定义分割标记）
 */
public class ApiPractice {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("d:\\JAVA学习\\学生信息文本.txt",true));
        ArrayList<Students> stud= entry();
        ArrayList<Students> stud2=entry();
        ArrayList<Students> stud3= entry();
        for (int i = 0; i < stud.size(); i++) {
            bw.write(stud.get(i).getId());
            bw.write(stud.get(i).getName());
            bw.write(stud.get(i).getAge());
            bw.write(stud.get(i).getLive());
            bw.newLine();
            System.out.println("学号："+stud.get(i).getId());
            System.out.println("名字："+stud.get(i).getName());
            System.out.println("年龄："+stud.get(i).getAge());
            System.out.println("居住地："+stud.get(i).getLive());
        }
        for (int i = 0; i < stud2.size(); i++) {
            System.out.println("学号："+stud2.get(i).getId());
            System.out.println("名字："+stud2.get(i).getName());
            System.out.println("年龄："+stud2.get(i).getAge());
            System.out.println("居住地："+stud2.get(i).getLive());
            bw.write(stud2.get(i).getId());
            bw.write(stud2.get(i).getName());
            bw.write(stud2.get(i).getAge());
            bw.write(stud2.get(i).getLive());
            bw.newLine();
        }
        for (int i = 0; i < stud3.size(); i++) {
            System.out.println("学号："+stud3.get(i).getId());
            System.out.println("名字："+stud3.get(i).getName());
            System.out.println("年龄："+stud3.get(i).getAge());
            System.out.println("居住地："+stud3.get(i).getLive());
            bw.write(stud3.get(i).getId());
            bw.write(stud3.get(i).getName());
            bw.write(stud3.get(i).getAge());
            bw.write(stud3.get(i).getLive());
            bw.newLine();
        }

      bw.close();


    }

    public static ArrayList<Students> entry() throws IOException{
        BufferedReader br=new BufferedReader(new FileReader("d:\\JAVA学习\\学生信息文本.txt"));

        ArrayList<Students> stud = new ArrayList<Students>();
        Students st = new Students();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号");
        String id = sc.nextLine();
        int d=0;
        char[] cha=id.toCharArray();
        for(int i=0;i<cha.length;i++){
            if(cha[i]>='0'&&cha[i]<='9'){
                d++;
            }
        }
        int s=0;
        if (d==cha.length) {
                String str;
                int id2=Integer.parseInt(id);
                while ((str = br.readLine()) != null) {
                    int a=br.read();
                    a-=49;
                    if(id2==a){
                        s++;
                    }
            }
            if(s==0){
                st.setId(id);
            }else {
                System.out.println("你输入的学号已存在，请重新输入");
                entry();
            }
        }else {
            System.out.println("你输入的学号含有特殊符号，请重新输入");
            entry();
        }

        Scanner na = new Scanner(System.in);
        System.out.println("请输入名字");
        String name = na.nextLine();
        int dn=0;
        char[] chan=name.toCharArray();
        for(int i=0;i<chan.length;i++){
            if(chan[i]>='0'&&chan[i]<='9'){
                dn++;
            }
            if(dn==0){
                st.setName(name);
            }else {
                System.out.println("你输入的名字含有特殊符号请重新输入");
                entry();
            }
        }


        Scanner ag = new Scanner(System.in);
        System.out.println("请输入年龄");
        String age = ag.nextLine();
        int da=0;
        char[] chaa=age.toCharArray();
        for(int i=0;i<chaa.length;i++){
            if(chaa[i]>='0'&&chaa[i]<='9'){
                da++;
            }
        }
        if(da==chaa.length){
            st.setAge(age);
        }else {
            System.out.println("你输入的年龄含有特殊符号请重新输入");
            entry();
        }

        Scanner ve = new Scanner(System.in);
        System.out.println("请输入居住地");
        String live = ve.nextLine();
        int di=0;
        char[] chal=live.toCharArray();
        for(int i=0;i<chal.length;i++){
            if((chal[i]>='0'&&chal[i]<='9')||(chal[i]>='a'&&chal[i]<='z')||(chal[i]>='A'&&chal[i]<='Z')){
                di++;
            }
        }
        if(di==0){
            st.setLive(live);
        }else {
            System.out.println("你输入的居住地含有特殊符号，请重新输入");
            entry();
        }

        stud.add(st);
        br.close();

   return stud;

    }
}

