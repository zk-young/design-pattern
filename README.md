# design-pattern
#设计模式
#####设计模式的目的:
        1)代码的重用性(即相同功能的代码不用多次编写)
        2)可读性(编程规范性)
        3)可扩展性(即:当需要增加新功能时非常的方便,可维护性)
        4)可靠性(当新增加功能时,对原来的功能没有影响)
        5)时程序呈现高内聚,低耦合的特性 
设计模式包含了面向对象的精髓(继承,封装,多态)
####设计模式常用的七大原则有:
        1.单一接口原则
                一个类应该只负责一项职责(比如dao应该只负责查询一张表)
                 注意事项:
                    降低类的复杂度,一个类只负责一项职责
                    提高可读性,可维护性
                    降低变更引起的风险
                    通常情况下,应当遵守单一职责原则
        2.接口隔离原则
                客户端不应该依赖他不需要的接口,即一个类对另一个类的依赖应该建立在最小的接口上
                对大接口实行拆分.
        3.依赖倒转(倒置)原则
                1)高层模块不应该依赖低层模块,二者都应该依赖其抽象
                2)抽象不应该依赖细节
                3)依赖倒转的思想是面向接口编程
                4)依赖倒转原则是基于这样的设计理念,相对于细节的多变性,抽象
                    的东西稳定的多,以抽象为基础搭建的架构比以细节为架构搭建的架构稳定的多
                    在java中 指的是接口或者抽象类,细节就是具体的实现类
                5)使用接口或者抽象类的目的是制定好规范,而不涉及任何具体的操作,扩展细节的任务交给实现类完成

                三种方式:接口,构造器,set注入
        4.里氏替换原则
                在使用继承时子类中尽量不要重写父类的方法
                继承同一基础类,减少重写(大规模重写父类的时候,应抽取base类同时继承)
        5.开闭原则(ocp)
                是最重要的设计原则 如一个实体类 模块和函数应该对扩展开发,对修改关闭
                当软件需要变化时,尽量通过扩展软件实体的行为来实现变化,而不是修改已经有的代码来实现变化
        6.迪米特法则
                一个对象应该对其他对象保持最少的了解
                类与类关系越密切,耦合度越大
                迪米特法则又叫最少知道原则,即一个类对自己依赖的类知道的越少越好,也就是说对于被依赖的类不管多么复杂,都尽量将
                逻辑封装在类的内部,对外提供public方法 不对外提供任何信息
                只与直接的朋友通信
        7.合成复用原则