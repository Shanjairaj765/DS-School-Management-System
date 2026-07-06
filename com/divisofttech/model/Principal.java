package com.divisofttech.model;

public class Principal {

    private int id;
    private String name;
    private int age;
    private String qualification;
    private int experience;

    public Principal(int id, String name, int age, String qualification, int experience) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.qualification = qualification;
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

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}