package com.divisoftech.view;

import com.divisoftech.model.Teacher;

public class TeacherView {

    public void displayTeacher(Teacher teacher) {

        if (teacher == null) {
            System.out.println("No teacher data available.");
            return;
        }

        System.out.println("\n==============================");
        System.out.println("        TEACHER DETAILS");
        System.out.println("==============================");
        System.out.println("Teacher ID : " + teacher.getId());
        System.out.println("Name       : " + teacher.getName());
        System.out.println("Age        : " + teacher.getAge());
        System.out.println("Subject    : " + teacher.getSubject());
        System.out.println("Experience : " + teacher.getExperience() + " years");
    }
}