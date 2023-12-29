import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import domen.GroupeStudents;
import domen.Student;
import domen.StudentStream;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Student student1 = new Student("Инга", 22); // Создаю студентов, экземпляров класса Student
        Student student2 = new Student("Виктор", 21);
        Student student3 = new Student("Тимофей", 20);
        Student student4 = new Student("Анатолий", 19);
        Student student5 = new Student("Валерия", 20);
        Student student6 = new Student("Петр", 21);
        Student student7 = new Student("Ирина", 20);
        Student student8 = new Student("Василий", 20);
        Student student9 = new Student("Татьяна", 21);
        Student student10 = new Student("Агата", 19);
        Student student11 = new Student("Василиса", 19);
        Student student12 = new Student("Полина", 21);
        Student student13 = new Student("Игнат", 22);
        Student student14 = new Student("Влада", 20);
        Student student15 = new Student("Тина", 20);
        Student student16 = new Student("Андрей", 19);
        Student student17 = new Student("Валентина", 20);
        Student student18 = new Student("Валентин", 21);
        Student student19 = new Student("Констанин", 22);
        Student student20 = new Student("Игорь", 20);
        Student student21 = new Student("Елена", 19);
        Student student22 = new Student("Анна", 19);
        Student student23 = new Student("Ульяна", 20);
        Student student24 = new Student("Екатерина", 21);

        List<Student> students1 = new ArrayList<>(); // создаю списки и добавляю туда студентов
        students1.add(student6);
        students1.add(student4);
        students1.add(student3);
        students1.add(student2);
        students1.add(student5);
        students1.add(student1);

        List<Student> students2 = new ArrayList<>();
        students2.add(student24);
        students2.add(student7);
        students2.add(student8);
        students2.add(student10);
        students2.add(student9);

        List<Student> students3 = new ArrayList<>();
        students3.add(student23);
        students3.add(student11);
        students3.add(student13);
        students3.add(student12);
        students3.add(student14);
        students3.add(student15);
        students3.add(student16);
        students3.add(student18);

        List<Student> students4 = new ArrayList<>();
        students4.add(student22);
        students4.add(student17);
        students4.add(student19);
        students4.add(student20);
        students4.add(student21);
       


        GroupeStudents studentsGroupe1 = new GroupeStudents(5281, students1); // создаю группы, экземпляры класса GroupeStudents
        GroupeStudents studentsGroupe2 = new GroupeStudents(2294, students2);
        GroupeStudents studentsGroupe3 = new GroupeStudents(5287, students3);
        GroupeStudents studentsGroupe4 = new GroupeStudents(2293, students4);

    //     for (Student student : studentsGroupe) {
    //         System.out.println(student);
            
    //     }
    //     Collections.sort(studentsGroupe.getStudents());
    //     System.out.println();
    //     for (Student student : studentsGroupe) {
    //         System.out.println(student);
            
    //     }
    // }
        StudentStream studentStream = new StudentStream(); // добавляю в поток группы
        studentStream.add(studentsGroupe1);
        studentStream.add(studentsGroupe2);
        studentStream.add(studentsGroupe3);
        studentStream.add(studentsGroupe4);
    


        System.out.println(studentStream); // вывод потока без сортировки

        Collections.sort((List<GroupeStudents>) studentStream.getFaculties()); // сортировка потока групп по колличеству
        for(GroupeStudents groupe : studentStream.getFaculties()){
            Collections.sort((List<Student>) groupe.getStudents()); // сортировка студентов в рамках группы по возрасту и id
        }
        System.out.println(studentStream); // вывод потока с сортировкой
    }

    

}   
