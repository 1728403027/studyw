package loopingstatementsY;
/*
for循环语句
  for循环的格式：
   for（初始化语句；判断条件；控制条件语句）{
       循环语句；
   }
     执行流程：
      1、先执行初始化语句
      2、在执行判断条件语句，看其结果是true还是false
           如果是false就结束循环；
           如果是true就继续执行循环语句，然后执行控制条件语句，最后反过来执行2流程直到判断条件为false则结束循环
 */
public class ForStatements {
    public static void main(String[] args) {
        //在控制台输出10次“Hellworld”
        for (int i=1;i<=10;i++){
            System.out.println("第"+i+"次输出"+"hellworld");
        }
    }
}
