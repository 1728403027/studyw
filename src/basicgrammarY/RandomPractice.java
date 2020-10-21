package basicgrammarY;
import java.util.Random;
import java.util.Scanner;

/*
Random练习
 */
public class RandomPractice {
    public static void main(String[] args) {
        //中奖游戏
        Random c=new Random();
        int s=c.nextInt(100)+1;
        Scanner a=new Scanner(System.in);
        System.out.println("请输入你的号码：");
        int e=a.nextInt();
        if(s==e){
            System.out.println("恭喜你！你中奖了");
        }else{
            System.out.println("再接再厉!希望下次中奖");
        }

        //猜数字游戏
        Random u=new Random();
        int r=u.nextInt(100)+1;
        Scanner b=new Scanner(System.in);
        System.out.println("请输入你猜的数字：");
        int h=b.nextInt();
        if (r==h){
            System.out.println("恭喜你猜中了");
        }else{
            System.out.println("你猜的数比随机数小"+(r-h));
        }

    }
}
