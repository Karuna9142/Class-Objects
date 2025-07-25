package com;

public class Employee {

    //instance variable or data members or field
    int id;
    String name;

    //declaring method
    void insertRecord(int i,String n) {
        id = i;
        name = n;
    }
    void displayRecords()
    {
        System.out.println("Employee id :- "+id+ " Employee name :- "+name);
    }

    public static void main(String[] args) {

        //creating instance of Employee
        Employee e1 = new Employee();

        //calling the insertrecord method
        e1.insertRecord(1,"Karuna");
        //calling the displaydetails method
        e1.displayRecords();

        System.out.println("Direct Access - Id: "+e1.id);
        System.out.println("Direct Access - Name: "+e1.name);

    }
}
