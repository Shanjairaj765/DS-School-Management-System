package com.divisofttech;

public class Principal {

    int id;
    String name;
    int age;
    String qualification;
    int experience;

    
    public Principal(int id, String name, int age,String qualification, int experience) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.qualification = qualification;
        this.experience = experience;
    }

   
    public void report() {

        System.out.println("\n================================");
        System.out.println("       PRINCIPAL DETAILS");
        System.out.println("================================");

        System.out.println("Principal ID  : " + id);
        System.out.println("Name          : " + name);
        System.out.println("Age           : " + age);
        System.out.println("Qualification : " + qualification);
        System.out.println("Experience    : " + experience + " Years");
    }
}