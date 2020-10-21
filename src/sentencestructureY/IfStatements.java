package sentencestructureY;
import  java.util.Scanner;
/*
选择结构
  if语句
   if语句的三种格式
     if语句格式一：
        if（条件）{代码块}
      执行流程：首先判断小括号里面的条件是true还是false，如果是true则执行大括号里面的代码块反则不执行

      if语句格式二：
         if（条件）{代码块}else{代码块}
       执行流程：首先判断小括号里面的条件是true还是false，如果是true则执行大括号里面的代码块反则执行else后面大括号里面的代码块

      if语句格式三：
         if（条件）{代码块}else if（条件）{代码块}else{代码块}
       执行流程：首先判断小括号里面的条件是true还是false，如果是true则执行大括号里面的代码块反则执行else if后面的小括号里面的条件如果成立则执行else if大括号里面的代码块，如果不成立则执行else后面大括号里面的代码块

 */
public class IfStatements {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      Scanner n=new Scanner(System.in);
      System.out.println("请输入两个数值");
      float a=s.nextFloat();
      float b=s.nextFloat();
        //if语句格式一
        if (a>b){
            System.out.println("条件成立执行这个代码块");
        }

        //if语句格式二
        if (a>b){
            System.out.println("条件成立执行这个代码块");
        }else {
            System.out.println("条件不成立执行这个代码块");
        }

        //if语句格式三
        if(a>b){
            System.out.println("if后面小括号条件成立执行这个代码块");
        }else if (a==b){
            System.out.println("else if后面小括号条件成立执行这个代码块");
        }else {
            System.out.println("if后面小括号的条件不成立else if后面小括号条件不成立执行这个代码块");
        }

    }
}
