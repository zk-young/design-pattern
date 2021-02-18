package com.wang.pattern.singleton.type1;

/**
 * 饿汉式1
 */
public class SingletonOne {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1==instance);//拿到同一个实例true
        System.out.println(instance1.hashCode());//453211571
        System.out.println(instance.hashCode());//453211571
    }
}

class Singleton{
    //1构造器私有化
    private Singleton() {

    }

    //2本类创建对象实例
    private final static Singleton instance = new Singleton();

    //3对外提供共有方法
    public static Singleton getInstance() {
        return instance;
    }
}