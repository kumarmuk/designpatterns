package com.example;

public class SingletonSyncExample {

    private static SingletonSyncExample instance;

    private SingletonSyncExample() {
        System.out.println("Singleton sync constructor initiated");
    };

    public static SingletonSyncExample getInstance() {
        synchronized (SingletonSyncExample.class) {
            if (instance != null) {
                instance = new SingletonSyncExample();
            }
            return instance;
        }
    }
}
