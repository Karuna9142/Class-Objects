package abstraction;

abstract class Vaccine {
    int age;
    String nationality;

    Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }
    public void firstDose(){
        if(nationality=="Indian" && age==18) {
            System.out.println("You are eligible for the first dose.");
            System.out.println("You need to pay 250rs");
        }
        else
        {
            System.out.println("Not eligible for first dose");
        }
    }
    public void secondDose(boolean firstDoseCompleted){

        if (firstDoseCompleted) {
            System.out.println("You are eligible for the second dose");
        }
        else {
            System.out.println("Not eligible for firstDose");
        }
    }
    public abstract void boosterDose();
}
class VaccinationSuccessful extends Vaccine {

    VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    @Override
    public void boosterDose() {
        System.out.println("You have successfully received the booster dose");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
     Vaccine v1 = new VaccinationSuccessful(18, "Indian");
     v1.firstDose();

     boolean firstDoseCompleted = true;
     v1.secondDose(firstDoseCompleted);
     v1.boosterDose();
    }
}
