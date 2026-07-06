package com.divisoftech.controller;

import com.divisoftech.model.Teacher;

public class TeacherController {

    private Teacher teacher;

    public void createTeacher(Teacher teacher) {
        this.teacher = teacher;
        System.out.println("Teacher created successfully.");
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void updateTeacher(String name, int age, String subject, int experience) {
        if (teacher != null) {
            teacher.setName(name);
            teacher.setAge(age);
            teacher.setSubject(subject);
            teacher.setExperience(experience);

            System.out.println("Teacher updated successfully.");
        }
    }

    public void deleteTeacher() {
        teacher = null;
        System.out.println("Teacher deleted successfully.");
    }
}