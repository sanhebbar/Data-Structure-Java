package com.company.designpattern;
class SingletonPattern{
    private static SingletonPattern instance = null;

    private SingletonPattern(){}
    public static SingletonPattern getInstance(){
      if (instance == null){
          synchronized (SingletonPattern.class){
              if (instance == null){
                  instance = new SingletonPattern();
              }
          }
      }
        return instance;
    }
}
public class Singleton {
    public static void main(String[] args) {
        SingletonPattern pattern = SingletonPattern.getInstance();

    }
}
