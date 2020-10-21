package loopingstatementsY;
/*
三种循环的区别：
  do..whhile循环至少执行一次循环体
  for和while循环必须判断条件成立才可以执行

for循环和while循环有没有区别呢？
   for循环结束后，初始化的变量就不能被使用了，而while循环结束后，初始化的变量还可以使用
推荐使用顺序
  for。。。do....while。。。while
    */
public class CyclicDifference {
    public static void main(String[] args) {
        //while循环
        int a=3;
        while(a<3){
            System.out.println("执行"+a+"次数");
            a++;
        }
        //do....whilexh
        int z=3;
        do {
            System.out.println("执行"+z+"次数");
            z++;
        }while (z<3);
        //for循环
        for (int s=3;s<3;s++){
            System.out.println("执行"+s+"次数");
        }
    }
}
