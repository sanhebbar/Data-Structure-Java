package com.company.stream.FunctionalInterfaceExample;

import com.company.stream.data.Student;
import com.company.stream.data.StudentDataBase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;


//interface Say{
//public void  add(int a, int b);
//
//default void  display(){
//    System.out.println("hello");
//}
//
//static void hello(){
//    System.out.println("hi");
//}

public class FunctionExample {

    //bifunction example
    public static void exampleBiFun(){
        Predicate<Student> predicate = (s)->s.getGradeLevel()>3;
        BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> ex = (s, sp)->{
            Map<String, Double> map = new HashMap<>();
            s.forEach((slist)->{
                if (sp.test(slist)){
                    map.put(slist.getName(), slist.getGpa());
                }
            });
            return  map;
        };
        System.out.println(ex.apply(StudentDataBase.getAllStudents(), predicate));
    }

    public static void example1(){
//          List<Student> students = new ArrayList<>();
        Function<List<Student>, Map<String, Double>> studentfun = (s)->{Map<String, Double> map = new HashMap<>();
            s.forEach((student)->{
                if (student.getGradeLevel()> 3){
                    map.put(student.getName(), student.getGpa());
                }
            });
            return map;
        };
        System.out.println(studentfun.apply(StudentDataBase.getAllStudents()));
    }

    public static String example(String str){
         Function<String, String> ex = (s) ->s.toUpperCase().concat("feature");
         return ex.apply(str);
    }
    public static void function(){
        Function<Integer, Integer> func = (a) -> a % 2;
        System.out.println(func.apply(4));
        Function<String, String> func1 = (name)->name.toUpperCase();
        System.out.println(func1.apply("ABCD"));
        Function<String, String> concat = (name)->name.concat("default");
        System.out.println( func1.andThen(concat).apply("JAVA"));
        System.out.println(func1.compose(concat).apply("JAVA"));
    }

    public static void main(String[] args) {
        //function();

//        String result = example("JAVA");
//
//        System.out.println("result:" + result);
//        System.out.println(example("JAVA"));

//        Say say = (a,b)->{
//            System.out.println(a+b);
//        };


//        say.add(2,3);
//        say1.multi(2,7);
////        say.display();
////        say.display();

//        example1();
        exampleBiFun();
    }
}
