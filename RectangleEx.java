package com;

class Rectangle{
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width= width;
    }

    void displayRecords() {
        System.out.println("Area of Rectangle is:- "+length*width);
        System.out.println("Perimeter of Rectangleis:- "+2*(length+width));
    }
}
public class RectangleEx {
    public static void main(String[] args) {

        // creating instance of rectangle
        Rectangle rectangle = new Rectangle(20, 5);

        //printing results
        rectangle.displayRecords();
    }
}
