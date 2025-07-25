package com;

class Student1{

    //instance variable
    int rollno;
    String name;

    //creating method
    void insertRecord(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display records
    void displayRecords(){
        System.out.println("Students Roll no- "+rollno+ " \nStudents name:- "+name);
    }

}
public class ObjectInitializationThroghMethod {
    public static void main(String[] args) {
        //creating instance of Student1
        Student1 students = new Student1();
        students.insertRecord(101, "Priya");
        students.displayRecords();




    }
}
