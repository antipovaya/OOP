package domen;

public class Employee extends Person {
    private String specialicaton;

    public Employee(String name, int age, String specialicaton) {
        super(name, age);
        this.specialicaton = specialicaton;
    }
    
    public String getSpecialicaton() {
        return specialicaton;
    }
}
