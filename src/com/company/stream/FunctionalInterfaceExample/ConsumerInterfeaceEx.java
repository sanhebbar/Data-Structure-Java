package com.company.stream.FunctionalInterfaceExample;

import com.company.stream.data.Student;
import com.company.stream.data.StudentDataBase;

import java.sql.Struct;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerInterfeaceEx {
    static void printName(){
        Consumer<Student> c2 = (s) -> System.out.println(s);
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(c2);
        BiConsumer<Integer, Integer> consumer = (a,b)->{
            System.out.println(a + b);
        };
        consumer.accept(2,3);
    }
    static void getNameAndActivities(){
        Consumer<Student> name = (student -> System.out.println(student.getName()));
        Consumer<Student> activities = (student -> System.out.println(student.getActivities()));

        List<Student> students = StudentDataBase.getAllStudents();
   students.forEach(name.andThen(activities));

    }

    public static void nameAndActivities(){
        BiConsumer<String, List<String>> list = (name, act)->{
            System.out.println(name +":" + act);
        };
        List<Student> student = StudentDataBase.getAllStudents();
        student.forEach((student1 -> list.accept(student1.getName(), student1.getActivities())));

    }
    public static void main(String[] args) {
//        Consumer<String> consumer = (s)-> System.out.println(s.toUpperCase());
//        consumer.accept("sanath");
//        printName();
//        getNameAndActivities();
        nameAndActivities();
    }

}
