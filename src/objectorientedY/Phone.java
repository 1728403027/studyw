package objectorientedY;
/*
类的练习
  定义手机类：
    成员变量：品牌、颜色、价格、内存
    成员方法：打电话、发短信、玩游戏、刷视频
 */
public class Phone {
    //定义成员变量
    //品牌
    String brand;
    //颜色
    String color;
    //价格
    double price;
    //内存
    String memory;
    //定义成员方法
    public void call(String name ,String name2){
        System.out.println(name+"用它给"+name2+"打电话");
    }
    public  void sms(String name ,String name2){
        System.out.println(name+"用它给"+name2+"发短信");
    }
    public  void game(String name ,String name2){
        System.out.println(name+"用它和"+name2+"在玩王者荣耀");
    }
    public void video(String name ,String name2){
        System.out.println(name+"用它在抖音里面刷到了"+name2+"玩王者荣耀的视频");
    }
}
