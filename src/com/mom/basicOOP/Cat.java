package com.mom.basicOOP;

public class Cat extends Animal {
    String Age;

    public static void main(String[] args) {
        Animal a = new Cat();
        a.Name = "virtual cat";
        System.out.println(a);
    }
}
