package com.example;

public class SingletonSyncLockFreeExample {

    private static final SingletonSyncLockFreeExample instance = new SingletonSyncLockFreeExample();

    private SingletonSyncLockFreeExample() {
        System.out.println ("The SingletonSyncLockFreeExample is being initialised");
    } 


    public static synchronized SingletonSyncLockFreeExample getInstance () {
        return instance;
    }
    
}