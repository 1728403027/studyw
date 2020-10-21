package basicgrammarY;
import  java.util.Random;
/*
随机数 （random）
  用于产生随机数
 使用步骤:
   1、导包
    import java.util.random
   2、创建对象
     random r=new random（）；
   3、获取随机数
     int number=r.nextInt(10);
     获取数据的范围：[0,10）包括0，不包括10
 */
public class RandomY {
    public static void main(String[] args) {
        //创建对象
      Random c=new Random();
      for (int i=0;i<=20;i++){
        int s=c.nextInt(10);
          System.out.println("s的值"+s);
      }

      //获取1~100之间的随机数
         Random n=new Random();
      for(int x=1;x<5;x++){
          int v=n.nextInt(100)+1;
          System.out.println("系统自行选择的数是："+v);
      }
    }
}
