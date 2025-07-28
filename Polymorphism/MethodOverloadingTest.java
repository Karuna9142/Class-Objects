package Polymorphism;
class Shapes{
    public void area() {
        System.out.println("Find area");
    }
    public void area(int r) {
        System.out.println("Area of Circle is:- "+3.14*r*r);
    }
    public void area(double b, double h) {
        System.out.println("Area of Triangle:- "+0.5*b*h);
    }
    public void area(int length, int breadth) {
        System.out.println("Area of Rectangle is:- "+length*breadth);
    }
}
public class MethodOverloadingTest {
    public static void main(String[] args) {

        Shapes s1 = new Shapes();
        s1.area();
        s1.area(5);
        s1.area(2.0,5.0);
        s1.area(8,6);
    }
}
