package example;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void fun(String s){
        Set<String > set = new HashSet<>();

        for (int i =0;i< s.length();i++){
            for (int j =i;j< s.length();j++){
                String str = s.substring(i,j);
                if (!set.contains(str)){
                    set.add(str);
                }
            }
        }
        System.out.println(set);
    }
    public static void main(String[] args) {

        String s  = "abc";

        //[abc, bac, bca, cba, cab, acb]

        //fun(s);

        String str = "banana";
        Map<Character, Long> map = str.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()));
        System.out.println(map);

   }
}

