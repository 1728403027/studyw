package arrayY;
/*
静态初始化
 静态初始化的格式：
    数据类型 [] 数组名=new 数据类型[]{元素1，元素2.....}
  简化格式：
    数据类型 [] 数组名={元素1，元素2.....}
    int [] a={1,2,3}
 */
public class ArrayStatic {
    public static void main(String[] args) {
        //简化格式
        int [] s={1,2,3,};
        System.out.println(s[0]);
        System.out.println(s[2]);
        System.out.println(s[1]);

        //一般格式
        int[] c=new int[]{3,4,8,6};
        System.out.println(c[0]);
        System.out.println(c[2]);
        System.out.println(c[1]);


    }
}
