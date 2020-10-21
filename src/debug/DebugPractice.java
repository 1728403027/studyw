package debug;

import java.util.Scanner;

/*
断点调试的练习
1、看循环的执行流程（1~5求和的案例）
2、看方法的调用（1、求和方法的调用 2、带录入数据的如何看执行流程）
3、看方法参数传递案例执行流程
 */
public class DebugPractice {
    //求和
    public  static void sum(int a,int b){
        int sun=a+b;
        System.out.println(sun);
    }

    public static void main(String[] args) {
        //1~5求和
        int y=0;
        for(int i=1;i<=5;i++){
            y+=i;
        }
        //键盘录入两个数
        Scanner s=new Scanner(System.in);
        Scanner c=new Scanner(System.in);
        System.out.println("请输入你要求和的两个数");
        int d=s.nextInt();
        int v=c.nextInt();
        sum(d,v);

        System.out.println("1~5的和是："+y);
    }

}
