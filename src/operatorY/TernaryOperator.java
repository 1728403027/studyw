package operatorY;
/*
三元运算符
  关系表达式： ?表达式1：表达式2
执行流程：
  计算关系表达式的值，看是true还是false
  如果是true，表达式1就是结果
  如果是false，表达式2就是结果
 */
public class TernaryOperator {
    public static void main(String[] args) {
        //定义变量
        int s=10;
        int c=20;
        int d=(s>c)?s:c;
        System.out.println("d的值："+d);
        //三元运算符作比较
        int a=20;
        int z=30;
        //简单写法
        System.out.println(a==z);
        System.out.println((a==z)?true:false);
        int q=100;
        int f=100;
        int x=100;

       int g=(q>f&&q>x)?q:((f>x&&f>q)?f:((x>f&&x>q)?x:1));
       if (g==1){
           System.out.println("数值相等");
       }else {
           System.out.println("最大值是："+g);
       }

    }
}
