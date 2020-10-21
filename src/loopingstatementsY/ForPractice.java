package loopingstatementsY;
/*
for循环语句的练习
 */
public class ForPractice {
    public static void main(String[] args) {
        //获取数据一到五
        int c=0;
        for (int i=1;i<=5;i++){
            c+=i;
            System.out.println(i);
        }
        System.out.println(c);
        //获取数据五到一
        for (int a=5;a<=5&&a>0;a--){
            System.out.println(a);
        }

        //求出1~100之间的奇数和
        int v=0;
        for (int s=1;s<=100;s+=2){
            v+=s;
        }
        System.out.println(v);


        //在控制台输出所有水仙花数
        for (int e=100;e<=999;e++){
            int f=e%10;  //个
            int d=e/10%10;  //十
            int n=e/100;
            if (Math.pow(f,3)+Math.pow(d,3)+Math.pow(n,3)==e){
                System.out.println(e);
            }
        }


        //统计水仙花数共有多少个
        int o=0;
        for (int k=100;k<=999;k++){
            int f=k%10;  //个
            int d=k/10%10;  //十
            int n=k/100;
            if (Math.pow(f,3)+Math.pow(d,3)+Math.pow(n,3)==k){
                  o++;
            }
        }
        System.out.println("水仙花数有："+o);
    }
}
