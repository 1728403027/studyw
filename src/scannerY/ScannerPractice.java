package scannerY;
import java.util.Scanner;
public class ScannerPractice {
    public static void main(String[] args) {
      /*  //计算器

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要计算的第一个数");
        float z=sc.nextFloat();

        Scanner w=new Scanner(System.in);
        System.out.println("请输入你要计算方式：");
        String v=w.next();

        if(v.equals("+")||v.equals("*")||v.equals("-")||v.equals("/")||v.equals("%")){
            Scanner s=new Scanner(System.in);
            System.out.println("请输入你要计算的第二个数");
            float a=s.nextFloat();
            if (v.equals("+")){
                System.out.println(z+a);
            }else if (v.equals("*")){
                System.out.println(z*a);
            }else if (v.equals("-")){
                System.out.println(z-a);
            }else if (v.equals("/")){
                System.out.println(z/a);
            }else if (v.equals("%")){
                System.out.println(z%a);
            }

        }else if (v.equals("=")){
            System.out.println(z);
        }

        else {
            System.out.println("功能正在完善中");
        }
*/

  /*  //查询输入的内容是否相等，没有数据库所以只能键盘自己输入
        Scanner s=new Scanner(System.in);
        System.out.println("输入你要查询的内容");
        String c=s.next();
       //数据库内容没有数据库自己键盘输入
        Scanner a=new Scanner(System.in);
        System.out.println("数据库内容");
        String z=a.next();
        System.out.println((s.equals(z))?true:false);
*/

       //录入三个数取数的最大值
        Scanner s=new Scanner(System.in);
        Scanner a=new Scanner(System.in);
        Scanner c=new Scanner(System.in);
        System.out.println("请输入你要比较的三个数");
        float d=s.nextFloat();
        float w=a.nextFloat();
        float f=c.nextFloat();
        float q=(d>w&&d>f)?d:((w>d&&w>f)?w:(f>d&&f>w)?f:d);
        System.out.println("最大值是："+q);
    }
}
