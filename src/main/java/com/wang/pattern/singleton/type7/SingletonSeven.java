package com.wang.pattern.singleton.type7;

/**
 * 枚举实现
 */
public class SingletonSeven {
    public static void main(String[] args)  {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance1==instance);//拿到同一个实例true
        System.out.println(instance1.hashCode());//453211571
        System.out.println(instance.hashCode());//453211571
    }
}

enum Singleton {
    INSTANCE;
    public void method() {
        System.out.println("ok");
    }

}