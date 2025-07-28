package Interface;

class  HillStations {

    public void  location() {
        System.out.println("Location is");
    }

    public void famousFor(){
        System.out.println("Famous for:- ");
    }
}
class Manali extends HillStations{
    public void  location() {
        super.location();
        super.famousFor();
        System.out.println("Manali is in Himachal Pradesh");
    }

    public void famousFor(){
        System.out.println("It is Famous for Hadimba Temple and adventure sports");
    }
}
class Mussooie extends HillStations{
    public void  location() {
        System.out.println("Mussorie is in Uttarkhand");
    }

    public void famousFor(){
        System.out.println("It is Famous for education institutions ");
    }
}
class Gulmarg extends HillStations {
    public void  location() {
        System.out.println("Gulmarg is in J&K");
    }

    public void famousFor(){
        System.out.println("It is famous for skiing");
    }
}
public class InterfaceMain {
    public static void main(String[] args) {

        Manali manali = new Manali();
        manali.location();
        manali.famousFor();

        Mussooie mussooie = new Mussooie();
        mussooie.location();
        mussooie.famousFor();

        Gulmarg gulmarg = new Gulmarg();
        gulmarg.location();
        gulmarg.famousFor();


    }
}
