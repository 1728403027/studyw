package variable;
/*
定义变量的注意事项
  变量未赋值不能直接使用
  变量只在他所属的范围有效
    变量属于他所在的那对大括号
   一行上可以定义多个变量但是不建议
 */
public class variableY2 {
    public static void main(String[] args) {

        //定义变量
        int a=100;
        System.out.println(a);

        //没有赋值变量
        /*
        int b；
        system.out.println(b);
         */
     /*
      // 变量属于他所在的那对大括号
      {
         int c=10000;
         system.out.println(c);
      }
       system.out.println(c);

      */

       //一行上可以定义多个变量但是不建议
        int cc; int bb;
        cc=1008; bb=555;
        System.out.println(cc);
        System.out.println(bb);

    }
}
