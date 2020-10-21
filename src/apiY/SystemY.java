package apiY;



/*
system:包含一些有用的类字段和方法，它不能被实例化
 static void arraycopy（Object src,int srcPos,Object dest,int destPos,int length）:复制数组
 参数一：源数组
 参数二：源数组的起始索引位置
 参数三：目标数组
 参数四：目标数组的起始索引位置
 参数五：指定接受元素个数
 static long currentTimeMillis()：以毫秒值返回系统当前时间
 static void exit(int status)：终止虚拟机
 static void gc()：垃圾回收器
 */
public class SystemY {

    public static void main(String[] args) {
        method();
        method02();
        method03();
        method04();

    }

    //垃圾回收器
    public static void method04() {
        new Gc();
        System.gc();
    }

    //终止虚拟机
    public static void method03() {
        for (int i = 0; i < 200000; i++) {
            if (i == 100) {
                System.exit(0);
            }
            System.out.println(i);
        }
    }

    //以毫秒值返回系统当前时间
    public static void method02() {
        long lo = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - lo);
    }

    //复制数组
    public static void method() {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = new int[6];
        System.arraycopy(a, 0, b, 0, 6);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}

class Gc {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("我被回收了");
    }
}
