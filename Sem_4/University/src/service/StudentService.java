package service;

import java.util.ArrayList;
import java.util.List;


import domen.PersonComparator;
import domen.Student;

public class StudentService implements iPersonService<Student>{
    private int countStudents;
    private List<Student> studentsList;

    public StudentService() {
        studentsList = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return studentsList;
    }

    @Override
    public void create(String name, int age) {
        Student student = new Student(name, age);
        studentsList.add(student);
        countStudents++;
    }

     public void sortByFamily(){
        PersonComparator<Student> personComparator = new PersonComparator<Student>();
        studentsList.sort(personComparator);
    }

    
}
