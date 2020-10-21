package loopingstatementsY;
/*
while循环语句
  while循环语句格式：
    基本格式
      while（判断语句）{
        循环体语句
      }
    扩展格式
      初始化语句
       while（判断条件语句）{
         循环体语句；
         控制条件语句
       }

 */
public class WhilePractice {
    public static void main(String[] args) {
        //1~5的数据
        int i=0;
        while (i<=5){
           i++;
            System.out.println(i);
        }
        //扩展格式
        //求出1~100之和
        int s=0;
        int a=0;
        while(s<=100){
            a+=s;
            s++;
        }
        System.out.println(a);


        //水仙花的个数
        int w=0;
        int z=100;
        while (z<=999){
            int v=z/100;  //百
            int n=z/10%10; //十
            int c=z%100%10; //个
            if (Math.pow(v,3)+Math.pow(n,3)+Math.pow(c,3)==z){
                w++;
                System.out.println(z);
            }
            z++;
        }
        System.out.println("水仙花数共有："+w);
    }
}
