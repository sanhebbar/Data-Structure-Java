package example;

import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
int arr[] = {2,4,5,6,7,8,9,1};
Set<Integer> s = new HashSet<>();
for (int n : arr){
    s.add(n);
}
for(int i = 1;i<=9;i++){
    if (!s.contains(i)){
        s.add(i);
    }
}
        System.out.println(s);
    }
}
