package overloadingY;
 /*
方法重载
   在同一个类中出现了方法名相同的情况
 方法重载的特点
   方法名相同，参数列表不同，与返回值无关
     参数不同
      参数的个数不同
      参数对应的类型不同

注意
  再调用方法的时候，Java虚拟机会通过参数列表的不同来区分同名的方法
  */
public class OverloadingStatements {

    //普通的方法
     public static  int sum(int a,int b){
         return a+b;
     }
     //重载：方法名相同，参数列表不同的方法
     public  static  int sum(int z,int x,int c){
         return z+x+c;
     }
     //重载：方法名相同，参数列表不一样,和返回值没有关系
     public  static  float sum(float v, float b){
         return v+b;
     }
     //错误写法：不可以同时同名、同参数个数还有参数对应的类型
//     public  static int sum(int c,int d){
//         return c+d;
//     }
     public static void main(String[] args) {
         int a=10;
         int b=10;
         //普通的方法
         int s=sum(a,b);
         System.out.println("a+b的值："+s);
         //重载：方法名相同，参数列表不同的方法
         int d=50;
         int r=sum(a,b,d);
         System.out.println("x+z+c的值："+r);
         //重载：方法名相同，参数列表不一样,和返回值没有关系
         float g=sum(a,b);
         System.out.println("v+b的值："+g);
     }
}
