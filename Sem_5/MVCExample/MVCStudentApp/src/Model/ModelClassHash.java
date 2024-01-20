package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Core.Student;

public class ModelClassHash implements iGetModel{
    private HashMap<Integer, Student> students; // коллекция студентов

    /**
     * Конструктор класса
     * @param students список студентов
     */
    public ModelClassHash(HashMap<Integer, Student> students){
        this.students = students;
    }

    // Переопределяем метод из интерфейа iGetModel
    @Override
    public List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();
        for(Student student : students.values()){
            studentList.add(student);
        }
        return studentList;
    }
    // Переопределяем метод удаления из интерфейа iGetModel
    @Override
    public void deleteStudent(int id) {
        students.remove(id);
    }

    public HashMap<Integer, Student> getStudentsHash() {
        return students;
    }

   

}
