package Polymorphism;

class Employee {
    private int id;
    private String name;
    private String address;
    private String degree;
    private int marks;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    Employee(int id,String name, String address) {
        this(id, name);
        this.address = address;
    }

    public Employee(int id, String name, String address, String degree, int marks) {
        this(id, name,address);
        this.degree = degree;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", degree='" + degree + '\'' +
                ", marks=" + marks +
                '}';
    }
}
public class ConstructorChaining {
    public static void main(String[] args) {
        Employee e1=new Employee(101, "john", "Newyork");
        System.out.println(e1);
        Employee e2=new Employee(102, "Steve", "UK","BCA",67);
        System.out.println(e2);
    }
}
