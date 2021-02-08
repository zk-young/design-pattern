package com.wang.inversion;

/**
 * 依赖倒置 将接口当做参数,而不是实现类 面向接口编程   不直接依赖类
 * 三种方式:接口,set注入 构造器
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.revciver(new WeChat());
    }
}

interface Message {
    String getInfo();
}
class Email implements Message
{

    @Override
    public String getInfo() {
        return "emali消息";
    }
}

class WeChat implements Message{

    @Override
    public String getInfo() {
        return "微信消息";
    }
}
class Person {
    public void revciver(Message message) {
        System.out.println(message.getInfo());
    }
}