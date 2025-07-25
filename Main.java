package com;
class Dog {
    String name;
    void bark() {
        System.out.println(name+ " Woof!..");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Rocky";

        dog.bark();

    }
}
