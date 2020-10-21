package exceptionY;
/*
如何处理多个异常：
 可以使用多个try。。。catch语句
 使用一个try和多个catch

多个catch之间的顺序：
  多个catch之间可以有子父类
  平级之间没有顺序关系
  如果有子父类，父类异常必须放在后面
 */
public class ExceptionY02 {
    public static void main(String[] args) {
        method();
        //使用一个try和多个catch
        try {
            String s=null;
            System.out.println(s.length());
            int [] a=new int[2];
            System.out.println(a[10]);
              int c=1/0;
            System.out.println(c);
        }catch (NullPointerException nullex){
            System.out.println("出现了空指针异常");
        }catch (ArrayIndexOutOfBoundsException index){
            System.out.println("出现了数组下标越界");
        }catch (Exception ex){
            System.out.println("出现了异常");
        }

    }

    public static void method() {
        //可以使用多个try。。。catch语句
        try {
            String s=null;
            System.out.println(s.length());
        }catch (NullPointerException nullex){
            System.out.println("出现了空指针异常");
        }
        try {
            int [] a=new int[2];
            System.out.println(a[10]);
        }catch (ArrayIndexOutOfBoundsException index){
            System.out.println("出现了数组下标越界");
        }
    }
}
