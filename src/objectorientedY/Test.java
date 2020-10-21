package objectorientedY;

/*
学习时用来测试各种类的实现
 */
public class Test {
    public static void main(String[] args) {
        //测试student类
        //创建student对象
        Student s = new Student();
        //调用student类的成员变量并进行赋值
        String name = s.name = "李华";
        String name2 = s.name = "张亮";
        s.age = 23;
        //调用student类的成员方法
        s.eat(name);
        s.study(name);
        System.out.println(name + "的年龄是：" + s.age);

        Phone p = new Phone();
        p.brand = "华为";
        p.color = "星空蓝";
        p.price = 45000;
        p.memory = "12+256G";

        System.out.println(name + "花了" + p.price + "买了" + p.brand + ",颜色为:" + p.color + ",内存为:" + p.memory + "的手机");
        p.call(name, name2);
        p.sms(name, name2);
        p.game(name, name2);
        p.video(name, name2);


        //测试private关键字
        KeywordPrivate k = new KeywordPrivate();
        k.name = "李华";
        k.setAge(20);
        k.show();


        //测试this关键字
        KeywordThis e = new KeywordThis();
        e.setName("张亮");
        e.setAge(20);
        System.out.println("名字：" + e.getName());
        System.out.println("年龄：" + e.getAge());


        //测试调用构造方法
        Constructor co = new Constructor();
        //一个String参数的构造方法
        Constructor co2 = new Constructor("谢雨");
        //一个int参数的构造方法
        Constructor co3 = new Constructor(20);
        //两个参数的构造方法
        Constructor co4 = new Constructor("刘美", 17);
        //带一个参数的构造方法
        System.out.println("名字：" + co2.getName());
        System.out.println("年龄：" + co3.getAge());
        //带两个参数的构造方法
        co4.show();


        //类名作为形式参数传递
        //类名作为形式参数，其实这里需要的是该类的对象
        PrivatePractice pp = new PrivatePractice();
        Student student = new Student();
        pp.canshu(student);

        //类名作为返回值返回
        PrivatePractice pc=new PrivatePractice();
        Student su=pc.fanhui();
        su.study("兆华");
        //简便写法
        pc.fanhui().eat("王朝");

    }
}
