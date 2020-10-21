package functionAndMethodY;

import java.util.Scanner;

/*
方法
  其实就是完成特定功能的代码块

 定义格式
   修饰符 返回值类型 方法名（参数类型 参数名1 ,参数类型 参数2...）{
       方法体；
       return 返回值；
   }
 格式解释：
    修饰符  目前记住public static
    返回值类型  用于限定返回值的数据类型
    方法名    为了方便我们调用方法的名字
    参数类型   用于限定调用方法时传入的数据类型
    参数名     用于接收调用方法时传入的数据的变量
    方法体      完成功能的代码
    return      结束方法，并且把返回值带给调用者

写一个方法有两个明确
  返回值类型    明确功能结果的数据类型
  参数列表      目前有几个参数，以及参数的数据类型

方法的调用：（有明确返回值的方法调用）
   单独调用，没有意义
   输出调用有意义，但是不好因为我可能还需要那结果进行进一步操作
   赋值调用（推荐使用）
 */
public class MethodsY {
    //写一个方法用于求和
     public  static int sum(int a, int b){

         int s=a+b;
         return s;
     }

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        Scanner z=new Scanner(System.in);
        System.out.println("请输入你要求和的两个数：");
        int g=x.nextInt();
        int k=z.nextInt();
        //赋值调用
        int c=sum(g,k);

        System.out.println("和是："+c);

    }
}
