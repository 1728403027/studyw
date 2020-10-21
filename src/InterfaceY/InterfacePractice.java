package InterfaceY;

/*
接口练习：
 篮球运动员和教练
 乒乓球运动员和教练
  现在篮球运动员和篮球较量需要出国访问要学习英语
 根据你所学习的知识分析那些是类，哪些是抽象类，哪些是接口
 */
public class InterfacePractice {
    public static void main(String[] args) {
      BasketballA ba=new BasketballA();
      ba.learbEnglish();
      ba.learn();
      ba.eat();
      ba.bed();
      TennisA ta=new TennisA();
      ta.learn();
      ta.bed();
      ta.eat();
      Bcoach bc=new Bcoach();
      bc.learbEnglish();
      bc.teach();
      bc.bed();
      bc.eat();
      Tcoach tc=new Tcoach();
      tc.teach();
      tc.bed();
      tc.eat();
    }
}

/*
人类
 */
class People {
    public void eat() {
        System.out.println("吃饭");
    }

    public void bed() {
        System.out.println("睡觉");
    }
}

abstract class Athletes extends People {
    abstract public void learn();


}

abstract class Coach extends People {
    abstract public void teach();


}
class BasketballA extends  Athletes implements LearnEnglish{


    @Override
    public void learn() {
        System.out.println("打篮球");
    }

    @Override
    public void learbEnglish() {
        System.out.println("学英语");
    }
}
class TennisA extends Athletes{

    @Override
    public void learn() {
        System.out.println("打乒乓球");
    }
}
class Bcoach extends Coach implements LearnEnglish{


    @Override
    public void teach() {
        System.out.println("教打篮球");
    }

    @Override
    public void learbEnglish() {
        System.out.println("学英语");
    }
}
class Tcoach extends  Coach{

    @Override
    public void teach() {
        System.out.println("教打乒乓球");
    }
}
interface  LearnEnglish{
    abstract public void learbEnglish();
}
