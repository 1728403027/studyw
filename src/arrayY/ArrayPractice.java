package arrayY;
/*
数组内存练习
 */
public class ArrayPractice {
    public static void main(String[] args) {
        //定义一个数组输出数组名个数组值，然后给数组里面的元素赋值在输出数组名和数组值
        int [] s=new int[3];
        System.out.println(s);
        System.out.println(s[0]);
        System.out.println(s[1]);
        System.out.println(s[2]);
        s[0]=10;
        s[1]=45;
        s[2]=464;
        System.out.println(s);
        System.out.println(s[0]);
        System.out.println(s[1]);
        System.out.println(s[2]);


        //定义两个数组，分别输出数组名及元素，然后分别给数组中的元素赋值，分别再次输出数组名及元素
        int [] a=new int[3];
        float [] x=new float[4];
        System.out.println(a);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

        System.out.println(x);
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);

        a[0]=10;
        a[1]=1460;
        a[2]=652;

        x[0]=10;
        x[1]=1460;
        x[2]=652;
        x[3]=455;

        System.out.println(a);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

        System.out.println(x);
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);

        //先定义一个数组，赋值，输出，然后定义第二个数组把第一个数组的地址赋值给第二个数组然后给第二个数组赋值，在输出两个数组的名及元素
        int [] d=new int[3];
        d[0]=45;
        d[1]=56;
        d[2]=854;
        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println(d[2]);

        int [] v=d;

        v[0]=283;
        v[1]=203;
        v[2]=273;

        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println(d[2]);
        System.out.println(v[0]);
        System.out.println(v[1]);
        System.out.println(v[2]);
    }
}
