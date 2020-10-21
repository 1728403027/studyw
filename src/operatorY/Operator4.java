package operatorY;
/*
++、--:自增 子减 ，用于对变量加1或减1

++、--既可以用在变量的后面，也可以用在变量的前面

单独使用的时候，++或者--放在变量的前面或者后面，结果一样
 参与其他操作的时候：
    ++在后面，先拿变量做操作，然后变量在++
    ++在前面，先变量++，然后在拿变量做操作
 */
public class Operator4 {
    public static void main(String[] args) {
        //定义变量
        int a=10;
        System.out.println("a的值"+a);

        //++的演示
        ++a;
        System.out.println("a1的值"+a);
        a++;
        System.out.println("a2的值"+a);

        //其他操作
        //++在后面，先拿变量做操作，然后变量在++  这是先把a的值赋给了c然后a在自加的
        int c=a++;
        System.out.println("c的值"+c);

        //++在前面，先变量++，然后在拿变量做操作  这是先把a的值自加然后在赋值给b的
        int b=++a;

        System.out.println("b的值"+b);

    }
}
