package ioY;

import java.util.ArrayList;

/*
学生信息
  学号，姓名，年龄，居住地
 */
public class Students {
    private String id;
    private String name;
    private String age;
    private String live;


    public Students() {

    }

    public Students(String id, String name, String age, String live) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.live = live;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getLive() {
        return live;
    }

    public void setLive(String live) {
        this.live = live;
    }
}