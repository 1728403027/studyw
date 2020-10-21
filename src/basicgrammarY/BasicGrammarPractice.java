package basicgrammarY;

import java.util.Scanner;

/*
基础语法练习
 */
public class BasicGrammarPractice {
    //在键盘录入一个月份，输出该月份对应的季节
    public static void season() {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入现在的月份");
        int c = s.nextInt();
        if (c < 5 && c > 3) {
            System.out.println("现在为春季");
        } else if (c < 8 && c > 6) {
            System.out.println("现在为夏季");
        } else if (c < 11 && c > 9) {
            System.out.println("现在为秋季");
        } else if (c == 12 || c == 1 || c == 2) {
            System.out.println("现在为冬季");
        } else {
            System.out.println("你输入的月份有误");
        }
    }

    //打印五位数的回文数（个位与万位相同，十位与千位相同）
    public static void palindrome() {
        int r = 0;
        for (int i = 10000; i <= 99999; i++) {
            int a = i / 10000;  //万位
            int s = i % 10000 / 1000;  //千位
            int d = i % 10000 % 1000 % 100 / 10;  //十位
            int g = i % 10000 % 1000 % 100 % 10; //个位
            if (a == g && s == d) {
                r++;
                System.out.println(i);
            }
        }
        System.out.println("回文数共有" + r);
    }

    //不死神兔（有一对兔子，从出生第三个月开始每个月都生出一对兔子，小兔子长到第三个月后有生出一对兔子，假如兔子不死十二个月后有多少对兔子）
    public static void rabbit() {
        int i = 0;
        int[] c = new int[12];
        c[0] = 1;
        c[1] = 1;
        for (int s = 2; s < c.length; s++) {
            c[s] = c[s - 2] + c[s - 1];
            i = c[s];
        }
        System.out.println(i);
    }

    //求和
    //定义一个心态类型的数组内容为{171,72,19,16,118,51,210,7,18}
    //要求：求和的元素的个位和十位不能包含7，并且只能为偶数
    public static void sum() {
        int sum = 0;
        int[] arr = {171, 72, 19, 16, 118, 51, 210, 7, 18};
        for (int s = 0; s < arr.length; s++) {
            if ((arr[s] > 10) && (arr[s] % 2 == 0) && (arr[s] % 10 != 7) && (arr[s] / 10 != 7)) {
                sum += arr[s];
            }
        }
        System.out.println(sum);
    }

    //评委打分
    //在编程竞赛中，有6个评委为参赛的选手打分，分数为0~100的整数分；
    //选手的最后得分：去掉一个最高分和一个最低分后的4个评委的平均值（不考虑小数部分）
    public static void score() {
        Scanner s = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
//        Scanner a=new Scanner(System.in);
//        Scanner n=new Scanner(System.in);
//        Scanner e=new Scanner(System.in);
        System.out.println("请输入有几个评委打分");
        int z = c.nextInt();
//        int x=c.nextInt();
//        int v=a.nextInt();
//        int b=n.nextInt();
//        int m=e.nextInt();
        System.out.println("请输入" + z + "位评委打的分数");

        float[] f = new float[z];
        if (z <= f.length) {
            for (int q = 0; q < f.length; q++) {
//            f[q]=z;
                f[q] = s.nextFloat();
            }
        }
        //最小值 排序
        for (int j = 0; j < f.length; j++) {
            for (int i = j; i < f.length; i++) {
                if (f[j] > f[i]) {
                    float h = f[j];
                    f[j] = f[i];
                    f[i] = h;

                }
            }
        }

        //秋4个评委的平均数
        int k = 0;
        for (int j = 1; j < f.length - 1; j++) {
            k += f[j];
        }
        int average = k / (f.length - 2);
        double avg = k % (f.length - 2) * 10 / (f.length - 2) * 0.1;
        double avge = average + avg;
        System.out.println("你的最终得分是" + avge);
    }

    //数组反转
    //键盘录入数据，存入数组中然后把数组中的内容进行反转遍历出来
    public static void reverse() {
        Scanner s = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        System.out.println("请输入几个值要反转");
        int i = s.nextInt();
        System.out.println("请输入" + i + "个要反转的值");
        int[] p = new int[i];
        if (i <= p.length) {
            for (int y = 0; y < p.length; y++) {
                p[y] = c.nextInt();
            }

        }
        for (int d = 0; d < p.length - 1; d++) {
            int u = p[p.length - (1 + d)];
            p[p.length - (1 + d)] = p[d];
            p[d] = u;
        }

        for (int j = 0; j < p.length; j++) {
            System.out.println(p[j]);
        }
        System.out.println(p.length);
    }

    //数组元素查找
    /*
    查找元素第一次在数组中出现的索引
      给定数组int[] arr={5,7,3,2,5};
      要查询的元素通过键盘录入的方式确定
      定义一个查找数组元素第一次出现位置的方法（注意：要查找的元素就是键盘录入的数据）
     */
    public static void find() {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入你要查找的值");
        float a = s.nextFloat();
        int e = 0;
        int[] r = {5, 7, 3, 2, 5};
        for (int i = 0; i < r.length; i++) {
            if (a == r[i]) {
                e++;
                if (e == 1) {
                    System.out.println("你输入的值的一次出现在数组中的是" + i);
                }
            }
        }
        if (e == 0) {
            System.out.println("数组中没有你想找的值");
        }

    }

    //数据加密
    /*键盘录入数据，要求是四位数的整数，线需要对数据进行加密，加密规则如下：
      每位数字都加上5，然后除以10的余数代替该数字
      再将第一位和第四位交换，第二位和第三位交换
      请把加密后的数据输出到控制台
     */
    public static void encryption() {
        int d = 0;
        String h = "请重新输入你要加密的数据位数";
        Scanner s = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        int v = s.nextInt();
        int[][] a = new int[100][v];
        if (v > 0) {
            if (d != 0) {
                System.out.println(h);
            }

            System.out.println("请输入你要加密的数据");
            int[] arry = new int[v];
            if (v == arry.length) {
                for (int j = 0; j < arry.length; j++) {
                    arry[j] = c.nextInt();

                }

            }

            for (int i = 0; i < arry.length; i++) {
                int z = (arry[i] + 5) % 10;
                for (int y = i; y < arry.length; y++) {
                    arry[i] = z;

                }
            }
            for (int i = 0; i < arry.length / 2; i++) {
                int u = arry[arry.length - (i + 1)];
                arry[arry.length - (i + 1)] = arry[i];
                arry[i] = u;
            }
            System.out.println("你加密后的数据是：");
            for (int e = 0; e < 1; e++) {
                for (int r = 0; r < arry.length; r++) {
                    a[e][r] = arry[r];
                    System.out.print(a[e][r]);
                }
            }

        } else {
            System.out.println("你输入的加密数据有误请重新输入");
            d++;
            encryption();

        }


    }

    //数据解密
    public static void decryption() {
        Scanner sc = new Scanner(System.in);
        Scanner scc = new Scanner(System.in);
        System.out.println("请输入你要解码的数据的位数");
        int wei = sc.nextInt();
        System.out.println("请输入你要解密的数据");
        int[] shur = new int[wei];
        if (wei == shur.length) {
            for (int j = 0; j < shur.length; j++) {
                shur[j] = scc.nextInt();

            }
        }
        int z = 0;
        for (int i = 0; i < shur.length; i++) {
            if (shur[i] > 5) {
                z = shur[i] - 5;
            } else {
                z = shur[i] + 5;
            }
            for (int y = i; y < shur.length; y++) {
                shur[i] = z;

            }
        }
        for (int i = 0; i < shur.length; i++) {
            int u = shur[shur.length - (i + 1)];
            shur[shur.length - (i + 1)] = shur[i];
            shur[i] = u;
        }
        System.out.println("解密后的数据是");
        for (int j = 0; j < shur.length; j++) {
            System.out.print(shur[j]);
        }

    }

    //数组排序
    public static void sorting() {
        //数组排序
        int[] i = {2, 5, 1, 8, 6};
        for (int a = 0; a < i.length - 1; a++) {
            for (int b = a; b < i.length - 1; b++) {
                if (i[a] > i[b]) {
                    int v = i[a];
                    i[a] = i[b];
                    i[b] = v;
                }
            }

        }
        for (int s = 0; s < i.length; s++) {
            System.out.println(i[s]);
        }
    }

    public static void main(String[] args) {
        //在键盘录入一个月份，输出该月份对应的季节
        season();
        //打印回文数
        palindrome();
        //不死神兔
        rabbit();
        //求和
        sum();
        //评委打分
        score();
        //数组反转
        reverse();
        //数组元素查找
        find();
        //数据加密
        System.out.println("请输入你要加密的数据位数");
        encryption();
        //数据解密
        decryption();
        //数组排序
        sorting();
    }
}
