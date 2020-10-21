package apiY;
/*
 string  tostring:返回对象的字符串表示
  this.getClass().getName() + "@" + Integer.toHexString(this.hashCode());
getClass():返回以字节码对象
Integer.toHexString：返回指定参数的十六进制字符串形式
hashCode()：返回该对象的哈希码值（内部地址）
 */
public class ObjectToString {
    public static void main(String[] args) {
       Student st=new Student();
       st.name="李华";
       st.age=20;
        System.out.println(st.toString());
    }
}

class Student{
    String name;
    int age;
    //重写tostring方法
//    public String toString(){
//        return name+"@"+age;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
