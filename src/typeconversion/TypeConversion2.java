package typeconversion;
/*
强制类型转换
  目标类型  变量名=（目标类型） （被转换的数据）
  建议：数据在做运算的时候是什么数据类型就用说明数据类型不要随便强制转换数据类型不然容易导致数据精准度丢失
 */
public class TypeConversion2 {
    public static void main(String[] args) {
        //定义两个变量
        int a=100;
        byte b=20;
        int c=b+a;
        System.out.println(c);

        //强制转换
        byte d=(byte) (a+b);
        System.out.println(d);
    }
}
