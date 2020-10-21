package arrayY;
/*
数组练习
 */
public class ArrayPractice2 {
    public static void main(String[] args) {
        //数组遍历
        int [] s={1,5,6,9,5,4};
        for (int a=0;a<s.length;a++){
            System.out.println(s[a]);
        }
        //数组获取最值

        int [] z={1,5,8,6};
        //最大值
        int v=z[0];
        for (int x=1;x<z.length;x++){
            if (v<z[x]){
                v=z[x];
            }
        }
        //最小值
        int b=z[0];
        for (int c=1;c<z.length;c++){
            if (b>z[c]){
                b=z[c];
            }
        }
        System.out.println("数组中最小值是："+b);
        System.out.println("数组中最大值是："+v);
    }
}

