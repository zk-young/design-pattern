package com.wang.single;

/**
 * 理解单一职责原则
 * @author wang
 * @date 2021/2/8
 */
public class SingleResponsiblity2 {
    public static void main(String[] args) {
        Vehice2 va = new Vehice2();
        va.roadrun("火车");
    }
}

/**
 * 在方法级别上遵守单一职责原则
 */
class Vehice2{
    public void roadrun(String vchine) {
        System.out.println(vchine +"在铁轨上运行");
    }
    public void airrun(String vchine) {
        System.out.println(vchine +"在空中运行");
    }
}
