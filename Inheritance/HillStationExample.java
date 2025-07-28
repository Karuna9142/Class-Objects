package Inheritance;

interface Vehicles {

    //abstract methods
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
class Bicycle implements Vehicles {

    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear  = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }
     //To decrease speed
    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }
    public void  printStates() {
        System.out.println("Speed:- "+speed+ "Gear:- "+gear);
    }
}
class Bike implements Vehicles {
    int speed;
    int gear;

    //to change gear
    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }
    //to increase speed
    @Override
    public void speedUp(int increment) {
     speed = speed + increment;
    }
    //to decrease speed
    @Override
    public void applyBrakes(int decrement) {
      speed = speed - decrement;
    }
    public void  printStates() {
        System.out.println("Speed:- "+speed+ " Gear:- "+gear);
    }
}
class InterfaceDemo {
    public static void main(String[] args) {
     Bicycle b1 = new Bicycle();
     b1.changeGear(2);
     b1.speedUp(2);
     b1.applyBrakes(1);

        System.out.println("Bicycle Present State:- ");
        b1.printStates();

     //creating instance of the bike
     Bike b2 = new Bike();
     b2.changeGear(3);
     b2.speedUp(3);
     b2.applyBrakes(2);
        System.out.println("Bike Present State:- ");
        b2.printStates();
    }
}
