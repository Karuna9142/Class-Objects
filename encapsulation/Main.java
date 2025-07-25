package encapsulation;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Radius of the Circle:- " +circle.getRadius());
        circle.setRadius(7.0);
        System.out.println("New radius of the circle:- "+circle.getRadius());
    }
}
