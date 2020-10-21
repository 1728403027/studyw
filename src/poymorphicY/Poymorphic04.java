package poymorphicY;
/*
多态的优缺点：
  优点：可以提高可维护性（多态的前提所保证的），提高代码的扩展性
  缺点：无法直接访问子类持有的成员
 */
public class Poymorphic04 {
    public static void main(String[] args) {
        MiFactory mi=new MiFactory();
        mi.createPhone(new MiNote());//
        mi.createPhone(new Red());

    }
}
//多态代码的扩展性
interface  Phon{
    abstract public void call();
}

//小米
class MiNote implements Phon{
 public void call(){
     System.out.println("小米打电话");
 }
}
//红米
class Red implements Phon{
    public void call(){
        System.out.println("红米打电话");
    }
}

class MiFactory{
    public void createPhone(Phon ph){
        ph.call();
    }
}