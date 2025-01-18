package com.company.stream;

import javax.xml.namespace.QName;
import java.util.function.*;

public class FunctionalInterface {

    static Function<String, String> function = (name) ->name.toLowerCase();
    static Function<String, String> function1 = (name)->name.toLowerCase().concat("default");

    static UnaryOperator<String> strings = (s)-> s.concat("default");

    public static void main(String[] args) {
        System.out.println(function.apply("JAVA8"));
        System.out.println(function.andThen(function1).apply("JAva8"));
       // System.out.println(function1.apply("JAVa9"));

        System.out.println("unary:" + strings.apply("java"));


        //consumer
//        Consumer<String> s =(s1 -> System.out.println(s1.toUpperCase()));
//        s.accept("java8");
//        Bi consumer function
//        BiConsumer<String, String> biConsumer= (a,b)-> System.out.println(a + b);
//        biConsumer.accept("java7","java8");
//        BiConsumer<Integer, Integer> multiply = (a,b)->{
//            System.out.println(a*b);
//        };
//        BiConsumer<Integer, Integer> divide  = (a,b)->{
//            System.out.println(a/b);
//        };
//        multiply.andThen(divide).accept(17,6);
//
//        Predicate<Integer> predicate = (i)->{return i %2 ==0;};
//        System.out.println(predicate.test(5));
//
//        BiPredicate<Integer, Integer> predicate1 = (n,n1)-> n % 2 == 0 && n1 % 2 == 0;
//
//        System.out.println(predicate1.test(2,7));

    }
}
