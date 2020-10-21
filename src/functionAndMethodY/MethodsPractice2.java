package functionAndMethodY;

import java.util.Scanner;

/*
没有明确返回值的方法练习

写一个方法，在控制台输出10次helloworld

  两个明确
    返回值类型：void
    参数列表：没有参数

  如果一个方法没有明确的返回值类型，也不能把返回值类型的地方控出来，应该写void表示该方法没有返回值类型
 */
public class MethodsPractice2 {
    //在控制台输出10次helloworld
    public static void output(){
        for (int i=1;i<=10;i++){
            System.out.println("第"+i+"次"+"helloworld");
        }
    }

    //写一个方法传递一个大于一的整数，再给控制台打印1到该数据
    public static void output2(float a){
        for (int i=1;i<=a;i++){
            System.out.println(i);
        }
    }

    //写一个方法把所有水仙花数打印出来
    public static void output3(){
        //把100~999的数拿出来
        int f=0;
        for (int n=100;n<=999;n++){
            int v=n/100;  //百
            int b=n/10%10; //十
            int z=n%10;  //个
            if (Math.pow(v,3)+Math.pow(b,3)+Math.pow(z,3)==n){
                f++;
                System.out.println("水仙花数为："+n);
            }
        }
        System.out.println("水仙花数有共"+f);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个大于一的数");
        float c=s.nextFloat();
        output2(c);
        output();
        output3();
    }
}
