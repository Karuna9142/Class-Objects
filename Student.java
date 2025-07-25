package com;

public class Student {
    //instance variable
    int id;
    String name;

    //creating parameterized constructor
    Student(int i,String n) {
        id = i;
        name = n;
    }

    //method to display
    void displayRecords()
    {
        System.out.println(id+ " "+name);
    }

    public static void main(String[] args) {

        Student s1 = new Student(101, "Ram");
        Student s2 = new Student(102, "Shyam");
        
        s1.displayRecords();
        s2.displayRecords();

    }
}
