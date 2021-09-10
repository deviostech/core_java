package com.davios.oops;

public class Singleton {

    private  Singleton(){}

    private static class Inn{

        private static final Singleton singleton = new Singleton();
    }
    public static  Singleton getInstance(){
        return Inn.singleton;
    }
}
