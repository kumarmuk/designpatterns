package com.example;

public class SingletonExample {

    private static SingletonExample instance;

    private SingletonExample () {
        System.out.println ("Singleton constructor initiated");
    };

    public static SingletonExample getInstance () {
        if (instance != null) {
            instance = new SingletonExample();
        }
        return instance;
    } 
}