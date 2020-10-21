package InterfaceY;

import java.util.Scanner;

/*
接口：
 接口是一个比抽象类还抽象的类，接口里面的所有方法都是抽象方法，接口和累的关系实现关系，实现的关键字：implements
 接口的关键字： interface

 格式：
    interface 接口名{}
 */
public class interfacey {
    public static void main(String[] args) {
        Aog go=new Aog();
        go.god();
    }
}

interface  Animal{
    public abstract void god();
}
class  Aog implements Animal{

    @Override
    public void god() {
        boolean bo=true;
        while (bo) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要购买的狗的品种");
            String pz = sc.nextLine();
            int g = 0;
            char[] cha = pz.toCharArray();
            for (int i = 0; i < cha.length; i++) {
                if ((cha[i] >= '0' && cha[i] <= '9') || (cha[i] >= 'a' && cha[i] <= 'z') || (cha[i] >= 'A' && cha[i] <= 'Z')) {
                    g++;
                }
            }
            if (g == 0) {
                System.out.println(pz);
                bo=false;
            } else {
                System.out.println("你输入的狗的品种有误请重新输入");
            }
        }
    }
}