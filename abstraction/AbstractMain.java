package abstraction;
//abstract class
abstract class Bike {
    //abstract method
    abstract void run();
}
//concreate subclass to instantiate the abstract class
class Honda extends Bike{

    @Override
    void run() {
        System.out.println("Bike is running safely");
    }
}
public class AbstractMain {
    public static void main(String[] args) {
        Bike b1 = new Honda();
        b1.run();
    }
}
