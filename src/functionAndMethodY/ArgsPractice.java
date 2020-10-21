package functionAndMethodY;
/*
引用数据类型的方法练习
  方法的引用数据类型调用注意
    如果你要把你要把最值和求和放在同一个包里面的话要注意大小与和的值可以在方法调用的时候出现偏差（最好在比较数组元素大小时一个义数组的第一个开始一个以数组的最后一个元素开始做基准比较不然容易出现错误）
 */
public class ArgsPractice {
    //定义一个方法遍历数组
    public static void arges(int [] a){
        for (int s=0;s<a.length;s++){
            System.out.println(a[s]);
        }
    }

    //定义一个方法获取数据的最值
    public static void arges2(int [] a){
        //最大值
        for (int x=1;x<a.length;x++){
           if (a[a.length-1]<a[x]){
              a[a.length-1]=a[x];
           }
        }
        System.out.println("数组最大值是："+a[a.length-1]);

        //最小值
        for (int x=0;x<a.length;x++){
            if (a[0]>a[x]){
                a[0]=a[x];
            }

        }
        System.out.println("数组最小值是："+a[0]);
    }


    //写一个方法对数组的元素求和
    public  static void arges3(int [] a){
        int s=0;
        for (int x=0;x<a.length;x++){
            s+=a[x];
        }
        System.out.println("数组元素的和："+s);
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        arges(a);
        arges2(a);
        arges3(a);
    }
}
