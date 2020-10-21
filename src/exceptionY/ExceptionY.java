package exceptionY;

import java.io.FileWriter;
import java.io.IOException;

/*
我们在写代码的时候，经常出现一些小问题，那么为了方便我们处理这些问题，java为我们提供了异常机制

异常包含了错误的类型，原因以及位置

异常：不正常，我们在代码的时候出现的编译或者在运行时的错误

异常的体系结构：
 throwable（最顶层）
   Error;出现的不能够处理的严重问题，例如：内存不够，内存溢出。。。。
   Excepion：可以处理的问题，例如：语法的错误，代码编译时的逻辑错误。。。。

异常的处理方式：
  1、捕获处理
   使用try。。。catch语句
    try{
    有可能出现问题的代码
    }catch(ArithmeticException ae){
    处理异常；
    }
    try。。。。catch的执行顺序：
      首先执行try语句
        如果发现异常，异常下面的代码不再执行，直接跳入catch语句中，catch语句结束后，整个try。。。catch语句结束
        如果没有发现异常，则在try语句之行结束后，try....catch语句直接结束，不执行catch里面的代码块
    2、抛出异常
      当我们不想处理异常，或者没有能力处理，我们可以抛出异常，谁调用方法异常谁处理异常
        使用关键字throws在方法的声明处抛出异常


jvm的处理异常的方式
  如果出现异常我们没有处理，jvm会帮我们进行处理，他会把异常的类型，原因还有位置显示在命令行
  并且还终止了程序，异常后面的代码将不在执行

 */
public class ExceptionY {
    public static void main(String[] args) throws IOException {
        method();
        System.out.println("哈哈哈");
        method02();
    }

    public static void method02() throws IOException {
        //抛出异常
        FileWriter fw=new FileWriter("d:\\JAVA学习\\异常处理.txt");
    }

    public static void method() {
        //捕获处理
        try{
        }catch (Exception ex){
            int s=1/0;
            System.out.println(s);
            System.out.println("除数不能为0");
        }
    }
}
