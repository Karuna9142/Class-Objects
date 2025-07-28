package Polymorphism;

class Animal {

    public  void makeSound()
    {
        System.out.println("The animal makes a sound");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("The Dog Barks");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The Cat barks");
    }
}
public class MethodOverridingEx {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();
    }
}
