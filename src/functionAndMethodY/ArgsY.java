package functionAndMethodY;
/*
方法的参数如果是基本数据类型：形式参数的改变不影响实际参数

形式参数：用于接收实际参数的变量，（一般的形式参数是在方法的声明上）
实际参数：实际参与运算的变量

如果参数是引用数据类型：
   形式参数的改不直接影响实际参数


 */
public class ArgsY {
    //参数是基本数据类型
    //这a，b是形参
    public static void change(int a,int b){
        System.out.println("a:"+a+"b:"+b);
        a=b;
        b=a+b;
        System.out.println("a:"+a+"b:"+b);
    }


    //参数是引用数据类型
    public  static  void change(int[] arr){
        for (int x=0;x<arr.length;x++){
            if (arr[x]%2==0){
                arr[x]*=2;
            }
        }
    }

    public static void main(String[] args) {
        //参数是基本数据类型
        //这a，b是实参
        int a=10;
        int b=20;
        System.out.println("a:"+a+"b:"+b);
        change(a,b);
        System.out.println("a:"+a+"b:"+b);

        //参数是引用数据类型
        int[] arr={1,2,3,4};
        for (int x=0;x<arr.length;x++){
            System.out.println(arr[x]);
        }
        change(arr);
        for (int x=0;x<arr.length;x++){
            System.out.println(arr[x]);
        }

    }
}
