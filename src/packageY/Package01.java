package packageY;


import overloadingY.OverloadingPractice;
import java.util.*;

/*
包的特点：
  可以有多层
  不同包下面的文件名可以重复
  包的声明必须在第一行代码

不同包之间的相互访问：
    使用类的全名
    使用关键字import将类导入

注意:*代表的时通配符，代表导入了这个包下面所有的类，并没有导入子包下的类

  类的全名：包名。类名
 */
public class Package01 {
    public static void main(String[] args) {
        //相同包下面的类可以直接访问
        Package01 pa=new Package01();
        //不同包之间的相互访问使用类的全名
        overloadingY.OverloadingPractice op=new overloadingY.OverloadingPractice();
        //不同包之间的相互访问使用关键字import将类导入
        OverloadingPractice ov=new OverloadingPractice();
    }
}
