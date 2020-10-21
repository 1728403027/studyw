package operatorY;
/*
 %:用于获取两个数据相除时候的余数
 /：用于获取两个数据相除时候的商
 */
public class Operator2 {
    public static void main(String[] args) {
        //定义变量
        int a=5;
        int b=20;
        System.out.println(a%b);
        System.out.println(a/b);
        //整数取余或者取商只能得整数，想要得到小数，就必须有浮点数参与运算,所以必须把一个数据类型转换成浮点型的数据类型
        double c=a;
        System.out.println(c%b);
        System.out.println(c/b);
    }
}
