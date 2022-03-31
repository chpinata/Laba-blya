package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import static java.lang.System.exit;

public class Main {

    public static void printMenu(String[] options){
        for (String option : options){
            System.out.println(option);
        }
        System.out.print("Выберите опцию : ");
    }

    public static void main(String[] args) {

        String[] options = {"---Меню :",
                "|1 - Зайти за преподавателя ",
                "|2 - Зайти за студента ",
                "|3 - Открыть архив",
                "|4 - Список курсов",
                "|5 - Выйти",
        };

        Scanner scanner = new Scanner(System.in);// класс Scanner для ввода данных из консоли
        int option = 1;

        while (option != 5) {
            printMenu(options);
            try {
                option = scanner.nextInt();
                scanner.nextLine();
                switch (option){
                    /*case 1: beTeacher(scanner); break;
                    case 2: beStudent(); break;
                    case 3: openArchive(scanner); break;
                    case 4: printAllCourses(); break;*/
                    case 5: exit(0);
                }
            }
            catch (Exception ex){
                System.out.println("Пожалуйста, введите число от 1 до " + options.length);
                scanner.nextInt();
            }
        }
        scanner.close();

    }
        /*
            //список курсов
        ArrayList <Course> courses = new ArrayList<>();
        courses.add(new Course("Полиглотизм", new ArrayList<Teacher>()));
        Course course1 = new Course("Полиглотизм", new ArrayList<Teacher>());
        Course course2 = new Course("Пастафарианство", new ArrayList<Teacher>());
        Course course3 = new Course("Подводничество", new ArrayList<Teacher>());

        //список студентов
        //TODO: add course field in student and teacher classes
        Student student1 = new Student("Елизавета", "Натяженко", new HashMap<>());
        student1.courseMarks.put(course1, null);
        student1.courseMarks.put(course2, 3);
        //System.out.println(student1.courseMarks.get(course1));
        Student student2 = new Student("Владислав", "Лобстров", new HashMap<>() );
        Student student3 = new Student("Митрофан", "Зайцев", new HashMap<>());
        Student student4 = new Student("Лидия", "Иерихонова", new HashMap<>());
        Student student5 = new Student("Борис", "Херрингтович", new HashMap<>());
        Student student6 = new Student("Богдан", "Богословский", new HashMap<>());

        //список преподователей
        Teacher teacher1 = new Teacher("Галина", "Жук", course3);
        Teacher teacher2 = new Teacher("Игорь", "Громов", course1);
        Teacher teacher3 = new Teacher("Алёна", "Захарова",course3);
        Teacher teacher4 = new Teacher("Алексей", "Бричиков",course2);
        Teacher teacher5 = new Teacher("Сергей", "Разумовский",course1);


        course1.addTeacher(teacher2);
        course1.addTeacher(teacher5);
        course1.print();

        course2.addTeacher(teacher4);
        course2.print();

        course3.addTeacher(teacher1);
        course3.addTeacher(teacher3);
        course3.print();

    }
        */
}
