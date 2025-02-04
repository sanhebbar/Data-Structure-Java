package com.company.stream.FunctionalInterfaceExample;

import com.company.stream.data.Student;
import com.company.stream.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    // it won't take any input but return output
    public static void main(String[] args) {

         Supplier<Student> supplier = () ->{
            return new Student("Adam",2,3.6, "male",10, Arrays.asList("swimming", "basketball","volleyball"));
        };

         Supplier<List<Student>> slist = ()-> StudentDataBase.getAllStudents();

        System.out.println(supplier.get());
        System.out.println(slist.get());

    }
}
