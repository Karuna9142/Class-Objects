package abstraction;

abstract class Shapes {

    abstract void area();
}
class Circle1 extends  Shapes{
    double radius;

    Circle1(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println("Area of Circle is:- "+Math.PI*Math.pow(radius,2));
    }
}
class Rectangle1 extends Shapes{
 int length;
 int width;

 Rectangle1(int length, int width) {
     this.length = length;
     this.width = width;
 }
    @Override
    void area() {
        System.out.println("Area of Recatngle is:- "+(length*width));
    }
}
public class ShapeMain {
    public static void main(String[] args) {

        Shapes s1 = new Circle1(5.0);
        Shapes s2 = new Rectangle1(4, 9);

        s1.area();
        s2.area();
    }
}
