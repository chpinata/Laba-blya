package com.company;

import java.util.ArrayList;

public class Course {
        String name;
        ArrayList <Teacher> teachersList;

        public Course(String name, ArrayList <Teacher> teachersList) {
            this.name = name;
            this.teachersList = teachersList;
        }

        public void addTeacher(Teacher teacher){
            this.teachersList.add(teacher);
        }

        public ArrayList <Teacher> getTeachersList(){
            return teachersList;
        }

        public void printCourseInfo(){
            System.out.println("Название курса: "+name);
            for(int i = 0; i<teachersList.size();i++){
                System.out.println("Преподаватель #"+(i+1)+": "+teachersList.get(i).name+ ' ' +teachersList.get(i).surname);
            }
        }

}


