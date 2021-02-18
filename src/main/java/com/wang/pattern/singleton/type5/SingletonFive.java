package com.wang.pattern.singleton.type5;

public class SingletonFive {
    public static void main(String[] args)  {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1==instance);//拿到同一个实例true
        System.out.println(instance1.hashCode());//453211571
        System.out.println(instance.hashCode());//453211571
    }
}

class Singleton {
    //volatile 保证了不同线程对这个变量进行操作时的可见性，即一个线程修改了某个变量的值，这新值对其他线程来说是立即可见的。
    private static volatile Singleton instance;

    private Singleton() {

    }

    //提供一个静态公有方法,当使用到该方法时,才去创建instacn
    //即懒汉模式
    //双重检查,解决线程安全问题,同时解决懒加载
    public static synchronized Singleton getInstance()  {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}