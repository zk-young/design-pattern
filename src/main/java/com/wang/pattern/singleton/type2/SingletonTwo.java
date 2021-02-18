package com.wang.pattern.singleton.type2;


public class SingletonTwo {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1==instance);//true
    }
}
class Singleton{
    private static Singleton instance;
    private Singleton(){}

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }
}