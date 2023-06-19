package com.example.student.management.portal;

public class Student {


    private int admNO;
    private String name;
    private  int age;
    private  String course;

    public Student() {
    }

    public Student(int admNO, String name, int age, String course) {
        this.admNO = admNO;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getAdmNO() {
        return admNO;
    }

    public void setAdmNO(int admNO) {
        this.admNO = admNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "admNO=" + admNO +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }
}
