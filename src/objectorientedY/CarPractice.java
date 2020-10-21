package objectorientedY;
/*
汽车类练习
  要求：
   1、成员变量
   2、构造方法
     1.无参构造
     2.带参构造
    3、成员方法
      1.getXxx（）
      2.setXxx（）
    4、给成员变量赋值的方式
      1.无参构造方法+setXxx()
      2.带参构造方法
 */
public class CarPractice {
    private String brand;
    private  String color;
    private  int  money;
    //无参构造方法
    public CarPractice(){}
    //带参构造方法
    public CarPractice(String brand,String color,int money){
         this.brand=brand;
         this.color=color;
        if (money>0){
            this.money = money;
        }else {
            System.out.println("你输入的汽车价格有误请重新检查一下");
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getMoney() {
        return money;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMoney(int money) {
        if (money>0){
            this.money = money;
        }else {
            System.out.println("你输入的汽车价格有误请重新检查一下");
        }
    }

    public void show(){
        System.out.println("品牌"+brand);
        System.out.println("颜色："+color);
        System.out.println("价格："+money);
    }
}
