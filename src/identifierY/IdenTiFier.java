package identifierY;
/*
标识符：就是用来给包、lei、方法、变量等起名字的符号

组成规则
  Unicode字符
    数字字符、英文大小写字母、汉字（不建议使用汉字）
    下划线：_
    美元符：$
  注意事项
    不能以数字开头
常见命名规则
  基本要求
   见名知意
  常见的命名
   包（其实就是文件夹， 用于对类进行管理）
      全部小写，多级包隔开
      举例：com，com.itheima
    类
      一个单词首字母大写
       举例：Student，Car
      多个单词每个单词的首字母大写
        举例:HelloWorld
      方法和变量
        一个单词首字母小写
         举例：age，show（）
       多个单词组成第二个单词开始每个首字母大写
         举例：maxAge,getAge()

 */
public class IdenTiFier {
    public static void main(String[] args) {
       int a=10;
       int a2=100;
        System.out.println(a);
        System.out.println(a2);
        //错误 不可以数字开头
        /*int 2b=100;
        System.out.println(2b);
        */
        //错误不可以使用Java的关键字
        /*
        int class=100；
         */
    }
}
