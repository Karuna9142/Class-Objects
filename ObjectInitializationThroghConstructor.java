package com;

class Student2{
    int id;
    String name;

    //constructor with parameter
    Student2(int id, String name) {
        this.id = id;
        this.name= name;
    }

    public void displayInfo() {
        System.out.println("Student Id:- "+id);
        System.out.println("Student Name:- "+name);
    }
}
public class ObjectInitializationThroghConstructor {
    public static void main(String[] args) {
        //Creating objects of Student Class with constructor
        Student2 s2= new Student2(101, "Radha");
        //Displaying info
        s2.displayInfo();
    }
}
