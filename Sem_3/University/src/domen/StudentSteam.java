package domen;

import java.util.List;

public class StudentSteam {
    private int numberFaculty;
    List<GroupeStudents> faculties;

    
    public StudentSteam(int numberFaculty, List<GroupeStudents> faculties) {
        this.numberFaculty = numberFaculty;
        this.faculties = faculties;
    }


    public int getNumberFaculty() {
        return numberFaculty;
    }


    public void setNumberFaculty(int numberFaculty) {
        this.numberFaculty = numberFaculty;
    }


    public List<GroupeStudents> getFaculties() {
        return faculties;
    }


    public void setFaculties(List<GroupeStudents> faculties) {
        this.faculties = faculties;
    }

    @Override
    public String toString() {
        
        return String.format("ID потока - %d", getNumberFaculty());
    }
    
}
