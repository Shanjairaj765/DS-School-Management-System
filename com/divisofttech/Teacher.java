package com.divisofttech;

public class Teacher {

    int id;
    String name;
    int age;
    String subject;
    int experience;
    String classroom;

    
    public Teacher(int id, String name, int age,String subject, int experience,String classroom) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.experience = experience;
        this.classroom = classroom;
    }

    
    public void report() {

        System.out.println("\n================================");
        System.out.println("        TEACHER DETAILS");
        System.out.println("================================");

        System.out.println("Teacher ID        : " + id);
        System.out.println("Name              : " + name);
        System.out.println("Age               : " + age);
        System.out.println("Subject Handled   : " + subject);
        System.out.println("Experience        : " + experience + " Years");
        System.out.println("Classroom Handled : " + classroom);
    }
}