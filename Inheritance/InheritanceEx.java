package Inheritance;

class Vehicle {
    void start() {
        System.out.println("Vehicle is Running");
    }
    void stop() {
        System.out.println("Vehicle is Stopping");
    }
}
class Car extends Vehicle{
    void run()
    {
        System.out.println("car is running fast");
    }
}
public class InheritanceEx {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.start();
        c1.stop();
        c1.run();
    }
}
