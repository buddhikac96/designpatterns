package com.company;

public class Singleton{

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }

    public void Method(){
        System.out.println("I am singleton instance");
    }
}
