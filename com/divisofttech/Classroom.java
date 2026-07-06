package com.divisofttech;

public class Classroom {

    int classNo;
    String section;
    Teacher teacher;
    Student[] students;

   
    public Classroom(int classNo, String section,Teacher teacher, Student[] students) {

        this.classNo = classNo;
        this.section = section;
        this.teacher = teacher;
        this.students = students;
    }

  
    public int getPassedStudents() {

        int passCount = 0;

        for (int i = 0; i < students.length; i++) {

            if (students[i].marks >= 40) {
                passCount++;
            }
        }

        return passCount;
    }

    
    public int getFailedStudents() {

        return students.length - getPassedStudents();
    }

    
    public double getClassAverage() {

        double total = 0;

        for (int i = 0; i < students.length; i++) {

            total += students[i].marks;
        }

        return total / students.length;
    }

    
    public void report() {

        System.out.println("\n================================");
        System.out.println("         CLASSROOM " + classNo);
        System.out.println("================================");

        System.out.println("Section          : " + section);
        System.out.println("Class Teacher    : " + teacher.name);
        System.out.println("Subject          : " + teacher.subject);
        System.out.println("Total Students   : " + students.length);
        System.out.println("Passed Students  : " + getPassedStudents());
        System.out.println("Failed Students  : " + getFailedStudents());

        System.out.printf("Class Average    : %.2f%n",getClassAverage());
    }

    
    public void searchStudent(int searchRollNo) {

        boolean found = false;

        for (int i = 0; i < students.length; i++) {

            if (students[i].rollNo == searchRollNo) {

                students[i].report();

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nNo Student Found.");
        }
    }
}