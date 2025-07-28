package Polymorphism;

class Bird{
    public void sound() {
        System.out.println("birds sound");
    }
}
class Pigeon extends Bird{
    @Override
    public void sound() {
        System.out.println("Birds are flying");
    }
}
class Sparrow extends Bird {
    @Override
    public void sound() {
        System.out.println("Birds are Cooing");
    }
}
public class Test {
    public static void main(String[] args) {

        Sparrow sparrow = new Sparrow();
        sparrow.sound();
    }
}
