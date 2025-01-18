package com.company.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterator {
    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('s',1);
        map.put('a',3);
        map.put('e',4);
        map.put('d',2);
        map.put('q',8);

        Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Character, Integer> m = iterator.next();
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}

class Singleton{
    private static volatile Singleton instance;
    private Singleton(){

    }
    private static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
