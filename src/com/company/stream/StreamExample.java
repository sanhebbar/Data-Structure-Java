package com.company.stream;

import com.company.stream.data.Student;
import com.company.stream.data.StudentDataBase;

import java.awt.image.RasterOp;
import java.lang.reflect.Array;
import java.sql.Struct;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        //sum of number in a range
//        int sum = IntStream.rangeClosed(0,100).sum();
//        System.out.println(sum);

//        remove duplicate from the list
//        List<Integer> list = Arrays.asList(1,1,3,4,5,3,4,6,7,8,9,9);
//        List<Integer> ans = list.stream().distinct().collect(Collectors.toList());
//        System.out.println(ans);
//        Map<String, List<String>> map = StudentDataBase.getAllStudents().stream()
//                .filter(student -> student.getGradeLevel()>=3)
//                .collect(Collectors.toMap(Student::getName, Student::getActivities));
//        System.out.println(map);

        //getname from the student using map

//        List<String> list = StudentDataBase.getAllStudents().stream()
//                .map(Student::getName)
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//        list.forEach(i ->System.out.println(i));

//        flatmap example
//        List<String> flatmaval = StudentDataBase.getAllStudents().stream()
//                .map(Student::getActivities)
//                .flatMap(List::stream)
//                .collect(Collectors.toList());
//        System.out.println(flatmaval);

//
//        count, distince, sortmethod in stream
//        List<String> flatmaval = StudentDataBase.getAllStudents().stream()
//                .map(Student::getActivities)
//                .flatMap(List::stream).distinct()
//                .sorted()
//                .collect(Collectors.toList());
//        System.out.println(flatmaval);

        //custom sorting using comparator

//        List<Student> compareSort = StudentDataBase.getAllStudents()
//                .stream().sorted(Comparator.comparing(Student::getName).reversed())
//                .collect(Collectors.toList());
//      compareSort.forEach(System.out::println);

        //filter example

//        List<Student> filterStudent = StudentDataBase.getAllStudents()
//                .stream().filter(student -> student.getGender() == "male")
//                .sorted(Comparator.comparing(Student::getName))
//                .collect(Collectors.toList());
//        filterStudent.forEach(System.out::println);


//        reduce method
//        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        int ans = list.stream().reduce(1,(a,b)->a*b);
//        System.out.println(ans);

//        reduce method 2

//        Optional<Student> stList = StudentDataBase.getAllStudents()
//                .stream().reduce((s,s1)->{
//                    if (s.getGpa() > s1.getGpa()){
//                        return s;
//                    }else {
//                        return s1;
//                    }
//                });
//        System.out.println(stList.isPresent());
//        System.out.println(stList.get());


        //filter+ map+reduce

//        int result = StudentDataBase.getAllStudents().stream()
//                .filter((student -> student.getGradeLevel() >=3))
//                .filter(student -> student.getGender().equals("male"))
//                .map(Student::getNoteBooks)
//                .reduce(0,(a,b)->a+b);
//        System.out.println(result);

        //min and max example

//        List<Integer> list = Arrays.asList(2,4,6,7,9,4,3);
//
//        int max = list.stream().mapToInt(Integer::intValue).max().getAsInt();
//        System.out.println(max);
//        int min = list.stream().mapToInt(Integer::intValue).min().getAsInt();
//        System.out.println(min);
//        int sum = list.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(sum);


        //limit and skip in stream

  //    List<Integer> list = Arrays.asList(2,4,5,6,7,12,3,56,89,76);
//
//        List<Integer> limits = list.stream().limit(4).toList();
//        limits.forEach(s-> System.out.println(s));
 //       List<Integer> limits = list.stream().distinct().collect(Collectors.toList());
//
//        List<Integer> skips = list.stream().skip(4).toList();
//        skips.forEach(s-> System.out.println(s));


        // findand and findfirst

//
//        Optional<Student> findfirst = StudentDataBase.getAllStudents().stream()
//                .filter(student1 -> student1.getGpa() > 3.5).findFirst();
//
//        System.out.println(findfirst);
//        Optional<Student> findany = StudentDataBase.getAllStudents().stream()
//                .filter(student1 -> student1.getGpa() > 3.5).findAny();
//
//        System.out.println(findany);

//second largest

        //List<Integer> list = Arrays.asList(2,4,5,6,7,10,98,76,5,4);

//        Optional<Integer> second = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
//           // second.ifPresent(s-> System.out.println(s));
//        System.out.println(second);
//        second.ifPresent(s->System.out.println(s));

        //List<List<Integer>> list = new ArrayList<>();
//
//              list.add(Arrays.asList(2,4,5,6));
//              list.add(Arrays.asList(3,4,5,7));
//
//              List<Integer> result = list.stream()
//                      .flatMap(l ->l.stream()).collect(Collectors.toList());
//
//        System.out.println(result);

//        Stream.concat(list1.stream(), list.stream()).collect(Collectors.toList());



        List<Student> list = StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(s->s.getName()))
                .collect(Collectors.toList());




    }
}


