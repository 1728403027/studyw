package apiY;
/*
stringbuilder的添加和反转功能
   添加功能
      public Stringbuilder append（任意类型）:添加数据并返回值给自己的对象
   反转功能
     public stringbuilder reverse（）
 */
public class StringBuilderTianJiaAndFanZhuan {
    public StringBuilderTianJiaAndFanZhuan(){
        StringBuilder sb=new StringBuilder();
        //添加功能
        StringBuilder sb2=sb.append("hello");

        System.out.println("sb:"+sb);
        System.out.println("sb2:"+sb2);
        System.out.println(sb==sb2);

        //链式编程
        sb.append("heloo").append("你好").append(100);
        System.out.println(sb);

        //反转功能
        sb.reverse();
        System.out.println(sb);
    }
}
