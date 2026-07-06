package com.divisoftech.model;

public class Teacher {

    private int id;
    private String name;
    private int age;
    private String subject;
    private int experience;

    public Teacher(int id, String name, int age, String subject, int experience) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}