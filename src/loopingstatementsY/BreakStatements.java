package loopingstatementsY;
/*
break语句
   break：表示程序中断

使用场景：
 1、switch语句中
 2、循环中

注意：
  离开使用场景是没有意义的

作用：
   用于结束循环
 */
public class BreakStatements {
    public static void main(String[] args) {
        //break使用
        for (int a=0;a<=20;a++){
            if (a==6){
                break;
            }
            System.out.println("执行了"+a);
        }
    }
}
