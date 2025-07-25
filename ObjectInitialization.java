package com;

class Students {
    int id;
    String name;
}
public class ObjectInitialization {
    public static void main(String[] args) {
        //creating instance of Student Class
        Students s1 = new Students();

        //Assigning varible through reference variable
        s1.id = 101;
        s1.name = "Priya";
        //printing value
        System.out.println(s1.id+ " "+s1.name);
    }
}
