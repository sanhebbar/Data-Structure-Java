package com.company;

import java.sql.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//@FunctionalInterface
//interface IFunction{
//    void cal();
//}
public class hello {
    public static void main(String[] args){
//        System.out.printf("hello java");
//        Consumer<String> s = str -> System.out.println(str.toUpperCase());
//        s.accept("hello");
//    IFunction fun = ()->{
//        System.out.println("hello");
//        fun.cal();
//    }


//        Map<Integer,String> emp = new HashMap<Integer, String>();
//        List<Employee> list = new ArrayList<Employee>();
//        Scanner scanner = new Scanner(System.in);
//        for( int i : 5){
//            int id = scanner.nextInt();
//            String name= scanner.next();
//            int sal = scanner.nextInt();
//            String dept = scanner.next();
//            list.add(new Employee(id,name, sal,dept));
//        }
//        list.add(new Employee(1,"abc",12000, "sales"));
//        list.add(new Employee(2,"def",10000, "dept"));
//        list.add(new Employee(3,"xyz",13000, "mark"));
//        list.add(new Employee(4,"abc",14600, "tech"));
//        list.add(new Employee(5,"pqr",12700, "org"));
//        list.add(new Employee(6,"san",18900, "org"));
//        list.add(new Employee(7,"ath",11200, "nofun"));
//        list.add(new Employee(8,"pqer",11200, "nonfun"));
//        list.add(new Employee(9,"non",13450, "fun"));
//        list.add(new Employee(10,"mnop",12200, "dept"));
//        list.add(new Employee(11,"uvw",20040, "tech"));

//        for (Employee e : list){
//            System.out.println(e.getId() + e.getName() + e.getSalary() + e.getDept());
//        }
//        System.out.println("-----------------");
//        int n = 64;
//        while(n%4==0){
//            n/=4;
//        }
//        System.out.println(n);

List<List<String>> map = Arrays.asList(Arrays.asList("a","b"),Arrays.asList("c","d"), Arrays.asList("e","f"));

    List<String> list = map.stream().flatMap(List::stream).collect(Collectors.toList());

        System.out.println(list);



    }
}
