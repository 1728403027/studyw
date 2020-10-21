package loopingstatementsY;
/*
continue练习
 */
public class ContinuePractice {
    public static void main(String[] args) {
        for (int x=1;x<=10;x++){
            if (x%3==0){
                continue;
                //break;
            }
            System.out.println("执行了"+x);
        }
    }
}
