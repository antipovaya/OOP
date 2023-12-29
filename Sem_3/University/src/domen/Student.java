package domen;

public class Student extends Person implements Comparable<Student>{
    private int id;
    private static int generalId;

    static {
        generalId = 0;

    }

    public Student(String name, int age) {
        super(name, age);
        this.id = generalId;
        generalId++;
    }
    
    public int getId() {
        return id;
    }
    @Override
    public int compareTo(Student o) {
        if (super.getAge() < o.getAge()) return -1;
        else if(super.getAge() > o.getAge()) return 1;
        if(this.getId() < o.getId()) return -1;
        else if(this.getId() > o.getId()) return 1;
        return 0;
        
    }

    @Override
    public String toString() {
        
        return super.toString() + String.format("; id - %d", getId());
    }
}
 