package com.mom.basicOOP;

/**
 * 封装
 * 利用抽象数据类型将数据和基于数据的操作封装在一起，使其构成一个不可分割的独立实体。数据被保护在抽象数据类型的内部，尽可能地隐藏内部的细节，只保留一些对外的接口使其与外部发生联系。用户无需关心对象内部的细节，但可以通过对象对外提供的接口来访问该对象。
 *
 * 优点：
 *
 * 减少耦合：可以独立地开发、测试、优化、使用、理解和修改
 * 减轻维护的负担：可以更容易被理解，并且在调试的时候可以不影响其他模块
 * 有效地调节性能：可以通过剖析来确定哪些模块影响了系统的性能
 * 提高软件的可重用性
 * 降低了构建大型系统的风险：即使整个系统不可用，但是这些独立的模块却有可能是可用的
 * 以下 Person 类封装 name、gender、age 等属性，外界只能通过 get() 方法获取一个 Person 对象的 name 属性和 gender 属性，而无法获取 age 属性，但是 age 属性可以供 work() 方法使用。
 *
 * 注意到 gender 属性使用 int 数据类型进行存储，封装使得用户注意不到这种实现细节。并且在需要修改 gender 属性使用的数据类型时，也可以在不影响客户端代码的情况下进行。
 */
public class Person {

    private String name;
    private int gender;
    private int age;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender == 0 ? "man" : "woman";
    }

    public void work() {
        if (18 <= age && age <= 50) {
            System.out.println(name + " is working very hard!");
        } else {
            System.out.println(name + " can't work any more!");
        }
    }
}