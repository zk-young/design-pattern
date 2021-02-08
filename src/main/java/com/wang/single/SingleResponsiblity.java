package com.wang.single;

/**
 * 理解单一职责原则
 * @author wang
 * @date 2021/2/8
 */
public class SingleResponsiblity {
    public static void main(String[] args) {
        Vehice va = new Vehice();
        va.run("飞机");
        va.run("火车");
    }
}

/**
 * 交通工具类
 * 违反了单一职责的原则,出现问题  飞机在公路上跑
 * 解决方案:根据交通工具运行方法的不同 分解成不同的类即可
 */
class Vehice {
    public void run(String vchine) {
        System.out.println(vchine +"在公路上运行");
    }
}