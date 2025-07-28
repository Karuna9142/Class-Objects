package Polymorphism;

class Human{
    public void eat() {
        System.out.println("Human is eating");
    }
}
class Boy extends Human {
    @Override
    public void eat() {
        super.eat();
        System.out.println("Boy is having pizza");
    }
}
public class MethodOverridingExample {
    public static void main(String[] args) {

        Boy boy = new  Boy();
        boy.eat();
    }
}
