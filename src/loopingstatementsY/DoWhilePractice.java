package loopingstatementsY;
/*
do....while循环语句
  基本格式
   do{
    循环体语句；
   }while{
   判断条件语句
   }
  扩展格式
    初始化语句；
     do{
     循环体语句；
     控制条件语句；
     }while(
     判断条件语句；
     )
   执行流程：
    1、执行初始化语句
    2、执行循环体语句
    3、执行控制条件语句
    4、执行判断条件语句，看是true还是false
        如果是false就结束循环
        如果是true，就回到2继续执行
 */
public class DoWhilePractice {
    public static void main(String[] args) {
     /*   //基本格式
        int a=1;
        do{
            System.out.println("运行了第"+a+"次");
        }while(a==1);*/

        //扩展格式
        //共有多少水仙花数
        int s=0;
        int x=100;
        do {
            int v=x/100; //百
            int c=x/10%10; //十
            int n=x%100%10; //个
            if (Math.pow(v,3)+Math.pow(c,3)+Math.pow(n,3)==x){
                s++;
            }
            x++;
        }while (x<=999);
        System.out.println("水仙花数共有"+s);
    }
}
