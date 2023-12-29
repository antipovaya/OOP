import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import domen.GroupeStudents;
import domen.Student;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Student student1 = new Student("Инга", 22);
        Student student2 = new Student("Виктор", 21);
        Student student3 = new Student("Тимофей", 20);
        Student student4 = new Student("Анатолий", 19);
        Student student5 = new Student("Валерия", 20);
        Student student6 = new Student("Петр", 21);


        List<Student> students = new ArrayList<>();
        students.add(student6);
        students.add(student4);
        students.add(student3);
        students.add(student2);
        students.add(student5);
        students.add(student1);

        GroupeStudents studentsGroupe = new GroupeStudents(5281, students);

        for (Student student : studentsGroupe) {
            System.out.println(student);
            
        }
        Collections.sort(studentsGroupe.getStudents());
        System.out.println();
        for (Student student : studentsGroupe) {
            System.out.println(student);
            
        }
    }

    
}
