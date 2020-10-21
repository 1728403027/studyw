package objectorientedY;
/*
练习时用来测试各种类的实现
 */
public class TestPractice {
    public static void main(String[] args) {
        //private关键字练习
        PrivatePractice pp=new PrivatePractice();
        pp.setName("李虎");
        pp.setAge(30);
        pp.setQiang(20000);
        System.out.println("姓名："+pp.getName());
        System.out.println("年龄："+pp.getAge());
        System.out.println("月收入:"+pp.getQiang());


        //汽车类练习  无参带+setXxx（） 带参数的构造方法
        //无参+setXxx()
        CarPractice ca=new CarPractice();
        ca.setBrand("大众");
        ca.setColor("蓝色");
        ca.setMoney(150000);
        System.out.println("品牌"+ca.getBrand());
        System.out.println("颜色："+ca.getColor());
        System.out.println("价格："+ca.getMoney());

        //带参数的构造方法
        CarPractice ca2=new CarPractice("法拉利","红色",1200000);
       ca2.show();

    }
}
