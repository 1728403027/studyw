package arrayY;

/*
二维数组练习

System.out.println：是输出内容并换行
System.out.print：输出内容不换行
二维数组存入一维数组并且对二维数组里面的一维数组求和
 */
public class TowArrayPractice {
    public static void main(String[] args) {
        // System.out.print("二维数组的元素有：");
        //二维数组遍历
        int x = 0;
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int[] e = {1, 2, 3};
        int[] w = new int[a.length];
        int r = 0;
        int q = 0;
        for (int s = q; s < a.length; s++) {
            q = s;
            r++;
            for (int z = 0; z < a[s].length; z++) {

//               x=a[s][z];
//                System.out.print(x+"");

                if (r == 1) {
                    x = a[s][z] + x;
                    for (int y = q; y < w.length; y++) { //{6,6,6}
                        w[y] = x;
                    }

                } else {
                    x = a[s][z] + x;
                    for (int y = q; y < w.length; y++) { //{21,21,21}
                        w[y] = x;
                    }
                }
                //6/21/45
            }

            // System.out.println(x);
        }


        int b[] = new int[a.length];
        for (int u = 0; u < a.length; u++) {
            if (u > 0) {

                b[u] = w[u] - w[u - 1];

            } else {
                b[u] = w[u];
            }

        }
        for (int i=0;i<w.length;i++){
            System.out.println(b[i]);
        }
        int l=0;int we=0;
        for (int k = 0; k < e.length; k++) {
             l+=e[k];
        }

        for (int i=0;i<a.length;i++){
            if (b[i]==l){
               we++;
            }
        }

//        if (we>0){
//            for (int f=0;f<e.length;f++){
//                System.out.println(e[f]);
//            }
//        }else {
//            System.out.println("你输入的数据不再数组中");
//        }
  }

}

