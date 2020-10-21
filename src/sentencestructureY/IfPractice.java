package sentencestructureY;
import java.util.Scanner;
/*
if语句练习
 */
public class IfPractice {
    public static void main(String[] args) {
        //键盘输入两个值取最大值
        Scanner s=new Scanner(System.in);
        Scanner n=new Scanner(System.in);
        System.out.println("请输入两个数值");
        float a=s.nextFloat();
        float z=n.nextFloat();
        if (a>z){
            System.out.println("最大值是："+a);
        }else {
            System.out.println("最大值是："+z);
        }

        //输入学生的成绩判断属于那个等级
        Scanner m=new Scanner(System.in);
        System.out.println("请输入学生的成绩");
        int x=m.nextInt();
        if(x>=90&&x<=100){
            System.out.println("该同学的成绩为优秀");
        }else if(x>=80&&x<90){
            System.out.println("该同学的成绩为好");
        }else if (x>=70&&x<80){
            System.out.println("该同学的成绩为良");
        }else if (x>=60&&x<70){
            System.out.println("该同学的成绩为及格");
        }else if (x<60){
            System.out.println("该同学的成绩为不及格");
        }else{
            System.out.println("你输入的成绩有误请查询输入");
        }
    }
}
