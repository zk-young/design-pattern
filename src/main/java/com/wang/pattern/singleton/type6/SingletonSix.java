package com.wang.pattern.singleton.type6;

public class SingletonSix {
    public static void main(String[] args)  {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1==instance);//拿到同一个实例true
        System.out.println(instance1.hashCode());//453211571
        System.out.println(instance.hashCode());//453211571
    }
}

class Singleton {
    /**
     * 静态内部类在类加载的时候不会装载---实现懒加载
     * 静态内部类只给一个线程,线程安全
     */

    private Singleton() { }

    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

}