package com.mom.basicOOP;

public class Animal {
    String Name;
    public String Action(){
        return "Animal is crying";
    };

    @Override
    public String toString() {
        return "Animal{" +
                "Name='" + Name + '\'' +
                '}';
    }
}
