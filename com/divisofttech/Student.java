package com.divisofttech;

public class Student {

    int rollNo;
    String name;
    double marks;

    
    public Student(int rollNo, String name, double marks) {

        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

   
    public String getStatus() {

        if (marks >= 40) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }

  
    public void report() {

        System.out.println("\n================================");
        System.out.println("        STUDENT DETAILS");
        System.out.println("================================");

        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Marks       : " + marks);
        System.out.println("Status      : " + getStatus());
    }
}