package com.javarush.task.task14.task1421;

class Singleton {
    private static Singleton instance = new Singleton();
//    private Singleton(){
//
//    }
    private Singleton(){
        /*instance = this;*/
    }

    public static Singleton getInstance(){
        return instance;
    }
}
