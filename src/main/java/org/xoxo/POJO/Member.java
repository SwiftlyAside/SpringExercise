package org.xoxo.POJO;

import java.util.List;

public class Member {
    private String name;
    private int age;
    private double height;
    private List<String> hobbies;

    public Member() {
    }

    public Member(String name, int age, double height, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.hobbies = hobbies;
    }

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("키: " + height);

        for (String hobby : hobbies)
            System.out.println("  - " + hobby);
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
}
