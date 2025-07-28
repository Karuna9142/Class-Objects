package abstraction;

abstract class Shape{
    String color;

    //abstract method
    abstract double area();

    public abstract String toString();

    //Parameterized constructor
    public Shape(String color){
        System.out.println("This is a constructor");
        this.color = color;
    }
    public String getColor(){
        return color;
    }
}
class Circle extends Shape{
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
        System.out.println("Circle constructor is called");
    }

    @Override
    double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle color is:- "+getColor()+ " And Area of Circle is:- "+area();
    }
}
class Rectangle extends Shape{

    int length;
    int width;

    public Rectangle(String color, int length ,int width) {
        super(color);
        System.out.println("Rectangle Constructor is Called");
        this.length = length;
        this.width = width;
    }
    @Override
    double area() {
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle color is " +super.getColor()+ " and area is:- "+area();
    }
}
public class Test {
    public static void main(String[] args) {
    Shape s1 = new Circle("Blue", 12);
    Shape s2 = new Rectangle("Purple", 8,7);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
