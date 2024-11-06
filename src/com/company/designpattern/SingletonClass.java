package designPattern;

import com.company.designpattern.Singleton;

public class SingletonClass {


    public static SingletonClass instance;

    private SingletonClass(){
    }
    public static  SingletonClass getInstance(){
        if (instance == null){
            instance =  new SingletonClass();
        }
        return instance;
    }
    public void getMsg(){
        System.out.println("singleton class");
    }
    public static void main(String[] args){
        SingletonClass singletonClass = new SingletonClass();
        singletonClass .getMsg();
    }


}
