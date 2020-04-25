package com.example.rpp;

public class ThreadHandler {
    private static ThreadHandler instance;
    public ThreadHandler(Thread thread) {
        thread.start();
    }
    public static ThreadHandler createInstance(Thread thread) {
        if(instance == null) {
            instance = new ThreadHandler(thread);
            return instance;
        } else {
            return instance;
        }
    }
}
