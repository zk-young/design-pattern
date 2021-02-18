package com.wang.pattern.singleton.type4;

public class SingletonFour {
    public static void main(String[] args)  {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1==instance);//拿到同一个实例true
        System.out.println(instance1.hashCode());//453211571
        System.out.println(instance.hashCode());//453211571
    }
}

class Singleton {
    private static  Singleton instance;

    private Singleton() {

    }

    //提供一个静态公有方法,当使用到该方法时,才去创建instacn
    //即懒汉模式
    //添加线程同步关键字,不会造成线程安全问题
    public static synchronized Singleton getInstance()  {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}