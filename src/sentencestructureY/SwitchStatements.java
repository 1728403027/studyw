package sentencestructureY;
import java.util.Scanner;
/*
switch语句
  switch语句格式：
   switch（表达式）{
    case 值1：
       代码块；
       break；
     case 值2：
       代码块；
       break；
     case 值3：
       代码块；
       break；
     case 值4：
       代码块；
       break；
     default：
       代码块；
       break；
   格式解释：
     表达式可以是 byte、short、int、char
        jdk5以后就可以是枚举类
        jdk7以后可以是字符串
       case后面的值：就是用来和表达式的值进行匹配的内容
       break：表示中断的意思
       default：所有的值都不匹配的时候，就执行default
    执行流程：
        首先计算表达式的值
        拿着这个计算出来值，一次和case后面的纸进行比较，一旦有匹配的，就执行对应的代码块，在执行过程中遇见break就中止执行
        如果所有的case都不匹配则执行default后面的代码块遇见break中止执行
   }
 */
public class SwitchStatements {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入数字1~7");
        int c=s.nextInt();
        switch (c){
            case 1:
                System.out.println("今天是星期一");
                break;
            case 2:
                System.out.println("今天是星期二");
                break;
            case 3:
                System.out.println("今天是星期三");
                break;
            case 4:
                System.out.println("今天是星期四");
                break;
            case 5:
                System.out.println("今天是星期五");
                break;
            case 6:
                System.out.println("今天是星期六");
                break;
            case 7:
                System.out.println("今天是星期日");
                break;
            default:
                System.out.println("你输入的值有错");
                break;
        }
    }
}
