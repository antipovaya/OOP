package Model;

import java.util.HashMap;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Core.Student;

public class ModelClassList implements iGetModel {

    private List<Student> students;

    public ModelClassList(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents()
    {
        return students;
    }

    @Override
    public void deleteStudent(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteStudent'");
    }

    @Override
    public HashMap<Integer, Student> getStudentsHash() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudentsHash'");
    }

}
