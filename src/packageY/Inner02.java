package packageY;
/*
局部内部类
  在方法内，出了方法之后就无法使用了
 */
public class Inner02 {
    public static void main(String[] args) {
        Outer02 ou=new Outer02();
        ou.method();

    }
}

class Outer02{
    public void method(){
        int a=10;
        class Ineer02{
            public void fuction(){
                System.out.println("局部内部类");
            }
        }
        Ineer02 in=new Ineer02();
        in.fuction();
    }
}