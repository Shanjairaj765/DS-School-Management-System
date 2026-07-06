package com.divisofttech;

import java.util.Scanner;

public class Main {

    static boolean running = true;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        Principal principal = new Principal(101,"Ramesh Kumar",52,"M.Ed",25);

        
        Teacher[] teachers = createTeachers();

        
        Classroom[] classrooms = createClassrooms(teachers);

        System.out.println("====================================");
        System.out.println("       WELCOME TO DS SCHOOL");
        System.out.println("====================================");

      
        while (running) {

            System.out.println("\n========== MAIN MENU ==========");
            System.out.println("1. Principal");
            System.out.println("2. Teachers");
            System.out.println("3. Classrooms");
            System.out.println("4. Students");
            System.out.println("5. Exit");

            System.out.print("\nEnter your choice : ");

            int choice =
                    Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    principalMenu(sc, principal);
                    break;

                case 2:
                    teacherMenu(sc, teachers);
                    break;

                case 3:
                    classroomMenu(sc, classrooms);
                    break;

                case 4:
                    studentMenu(sc, classrooms);
                    break;

                case 5:
                    running = false;
                    break;

                default:
                    System.out.println("\nInvalid Choice. Please try again.");
            }
        }

        System.out.println("\n====================================");
        System.out.println(" Thank you for using DS School System");
        System.out.println("====================================");

        sc.close();
    }


    
    public static Teacher[] createTeachers() {

        Teacher[] teachers = new Teacher[10];

        teachers[0] = new Teacher(
                201, "Priya", 35,
                "Mathematics", 10, "Classroom 1");

        teachers[1] = new Teacher(
                202, "Arun", 38,
                "Physics", 12, "Classroom 2");

        teachers[2] = new Teacher(
                203, "Meena", 34,
                "Chemistry", 8, "Classroom 3");

        teachers[3] = new Teacher(
                204, "Kumar", 40,
                "English", 15, "Classroom 4");

        teachers[4] = new Teacher(
                205, "Divya", 32,
                "Computer Science", 7, "Classroom 5");

        teachers[5] = new Teacher(
                206, "Suresh", 42,
                "Biology", 16, "Classroom 6");

        teachers[6] = new Teacher(
                207, "Lakshmi", 36,
                "Tamil", 11, "Classroom 7");

        teachers[7] = new Teacher(
                208, "Raj", 39,
                "History", 13, "Classroom 8");

        teachers[8] = new Teacher(
                209, "Anitha", 33,
                "Geography", 8, "Classroom 9");

        teachers[9] = new Teacher(
                210, "Vijay", 37,
                "Economics", 10, "Classroom 10");

        return teachers;
    }


   

    public static Classroom[] createClassrooms(Teacher[] teachers) {

        Classroom[] classrooms =new Classroom[10];

        for (int i = 0; i < 10; i++) {

            Student[] students =new Student[35];

            for (int j = 0; j < 35; j++) {

                int rollNo =((i + 1) * 100) + (j + 1);

                String name ="Student " + rollNo;

                double marks =30 + ((i * 7 + j * 3) % 71);

                students[j] =new Student(rollNo,name,marks );
            }

            classrooms[i] = new Classroom( i + 1, "Section " + (char) ('A' + i),teachers[i], students );
        }

        return classrooms;
    }



    public static void principalMenu(Scanner sc, Principal principal) {

        while (running) {

            principal.report();

            System.out.println("\n1. Back to Main Menu");
            System.out.println("2. Exit");

            System.out.print("\nEnter your choice : ");

            int choice =Integer.parseInt(sc.nextLine());

            if (choice == 1) {

                return;

            } else if (choice == 2) {

                running = false;
                return;

            } else {

                System.out.println("Invalid Choice.");
            }
        }
    }




    public static void teacherMenu(Scanner sc, Teacher[] teachers) {

        while (running) {

            System.out.println("\n========== TEACHERS ==========");

            for (int i = 0; i < teachers.length; i++) {

                System.out.println((i + 1) + ". " + teachers[i].name);
            }

            System.out.println("11. Back to Main Menu");
            System.out.println("12. Exit");

            System.out.print("\nSelect Teacher : ");

            int choice =Integer.parseInt(sc.nextLine());

            if (choice >= 1 && choice <= 10) {

                teachers[choice - 1].report();

                System.out.println("\n1. View Another Teacher");

                System.out.println("2. Back to Main Menu");

                System.out.println("3. Exit");

                System.out.print("\nEnter your choice : ");

                int nextChoice =Integer.parseInt(sc.nextLine());

                if (nextChoice == 2) {

                    return;

                } else if (nextChoice == 3) {

                    running = false;
                    return;
                }

            } else if (choice == 11) {

                return;

            } else if (choice == 12) {

                running = false;
                return;

            } else {

                System.out.println("Invalid Choice.");
            }
        }
    }




    public static void classroomMenu(Scanner sc, Classroom[] classrooms) {

        while (running) {

            System.out.println("\n========== CLASSROOMS ==========");

            for (int i = 0; i < classrooms.length; i++) {

                System.out.println( (i + 1) + ". Classroom "+ (i + 1));
            }

            System.out.println("11. Back to Main Menu");
            System.out.println("12. Exit");

            System.out.print("\nSelect Classroom : ");

            int choice =Integer.parseInt(sc.nextLine());

            if (choice >= 1 && choice <= 10) {

                Classroom selectedClassroom =classrooms[choice - 1];

                selectedClassroom.report();

                classroomStudentMenu(sc, selectedClassroom);

            } else if (choice == 11) {

                return;

            } else if (choice == 12) {

                running = false;
                return;

            } else {

                System.out.println("Invalid Choice.");
            }
        }
    }



    public static void classroomStudentMenu(Scanner sc,Classroom selectedClassroom) {

        while (running) {

            System.out.println( "\n1. Search Student");

            System.out.println("2. Back to Classroom List");

            System.out.println("3. Back to Main Menu");

            System.out.println("4. Exit");

            System.out.print("\nEnter your choice : ");

            int choice =Integer.parseInt(sc.nextLine());

            if (choice == 1) {

                System.out.print("Enter Student Roll Number : ");

                int rollNo =Integer.parseInt(sc.nextLine());

                selectedClassroom.searchStudent(rollNo);

            } else if (choice == 2) {

                return;

            } else if (choice == 3) {

                return;

            } else if (choice == 4) {

                running = false;
                return;

            } else {

                System.out.println("Invalid Choice.");
            }
        }
    }


    

    public static void studentMenu(Scanner sc, Classroom[] classrooms) {

        while (running) {

            System.out.println("\n========== STUDENTS ==========");

            System.out.println("1. Search Student");
            System.out.println("2. Back to Main Menu");
            System.out.println("3. Exit");

            System.out.print("\nEnter your choice : ");

            int choice =Integer.parseInt(sc.nextLine());

            if (choice == 1) {

                System.out.print( "Enter Student Roll Number : ");

                int rollNo = Integer.parseInt(sc.nextLine());

                searchAllStudents(rollNo, classrooms);

            } else if (choice == 2) {

                return;

            } else if (choice == 3) {

                running = false;
                return;

            } else {

                System.out.println("Invalid Choice.");
            }
        }
    }


    

    public static void searchAllStudents(int searchRollNo, Classroom[] classrooms) {

        boolean found = false;

        for (int i = 0;i < classrooms.length;i++) {

            for (int j = 0;j < classrooms[i].students.length;j++) {

                if (classrooms[i].students[j].rollNo == searchRollNo) {

                    classrooms[i].students[j].report();

                    System.out.println("Classroom   : Classroom "+ classrooms[i].classNo);

                    System.out.println("Teacher     : " + classrooms[i].teacher.name);

                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {

            System.out.println(
                    "\nNo Student Found.");
        }
    }
}