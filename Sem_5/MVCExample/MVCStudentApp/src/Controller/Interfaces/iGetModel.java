package Controller.Interfaces;

import java.util.HashMap;
import java.util.List;

import Model.Core.Student;

public interface iGetModel {
    public List<Student> getStudents();
    public void deleteStudent(int id);
    public  HashMap<Integer, Student> getStudentsHash();
    
}
