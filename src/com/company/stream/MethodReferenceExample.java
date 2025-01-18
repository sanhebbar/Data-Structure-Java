package com.company.stream;

import java.util.function.Function;

public class MethodReferenceExample {
    //functionalinterface
    static Function<String, String> function = (name) -> name.toLowerCase();
    //methodreference
    static Function<String, String> method = String::toLowerCase;
    public static void main(String[] args) {
        System.out.println(method.apply("JAVA8"));

    }
}
