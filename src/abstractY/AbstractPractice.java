package abstractY;

/*
抽象练习；
   雇员（Employee）示例：
    公司中
     程序员（programmer）有名字（name）工号（id），薪水（pay），工作内容（work）
     项目经理（manager）有名字（name），工号（id）薪水（pay）奖金（bonus），工作内容（work）
 */
public class AbstractPractice {
    public static void main(String[] args) {
        Programmer pr = new Programmer(1, "王光勇", 5000);
        pr.work();
        pr.wage();
        Manager ma=new Manager(1,"刘春艳",6000);
        ma.work();
        ma.wage();
    }

}

abstract class Employee {
    int id;
    String name;
    float pay;

    public abstract void work();

    public abstract void wage();

    public Employee(int id, String name, float pay) {
        this.id = id;
        this.name = name;
        this.pay = pay;
    }
}

class Programmer extends Employee {

    @Override
    public void work() {
        System.out.println(name + "在敲代码");
    }

    @Override
    public void wage() {
        System.out.println("姓名：" + name + "，" + "工资：" + pay);

    }

    public Programmer(int id, String name, float pay) {
        super(id, name, pay);
    }
}

class Manager extends Employee {
    float bonus = 10000;

    public Manager(int id, String name, float pay) {
        super(id, name, pay);
    }

    @Override
    public void work() {
        System.out.println(name + "在谈项目");
    }

    @Override
    public void wage() {
        float pay = bonus + super.pay;
        System.out.println("姓名：" + name + "，" + "工资：" + pay);
    }
}