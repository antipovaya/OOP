package service;

import java.util.ArrayList;
import java.util.List;

import domen.GroupeStudents;
import domen.PersonComparator;
import domen.Teacher;

public class TeacherService implements iPersonService<Teacher>{
    private int countTeacher;
    private List<Teacher> teachersList;

    public TeacherService(){
        teachersList = new ArrayList<>();
    }

     @Override
    public List<Teacher> getAll() {
        
            return teachersList; 
       
       
    }

    @Override
    public void create(String name, int age) {
        Teacher teacher = new Teacher(name, age, "Доцент");
        teachersList.add(teacher);
        countTeacher++;
        
    }

    public void sortByFamily(){
        PersonComparator<Teacher> personComparator = new PersonComparator<Teacher>();
        teachersList.sort(personComparator);
    }

  
}

