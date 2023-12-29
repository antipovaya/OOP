package domen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<GroupeStudents>{
    private int numberFaculty;
    List<GroupeStudents> faculties;

    private static int streamId;

    static{
        streamId = 0;
    }

    /**
     * 
     * @param numberFaculty - номер потока
     * @param faculties - список потоков с группами студентов
     */

    /**
     * Конструктор класса StudentStream
     */
    public StudentStream() {
        faculties = new ArrayList<GroupeStudents>();
        streamId++;
        numberFaculty = streamId;
    }

    public void add(GroupeStudents groupeStudents){
        faculties.add(groupeStudents);
    }
    /** Метод, возвращающий номер факультета */
    public int getNumberFaculty() {
        return numberFaculty;
    }

    /** Метод, возвращающий список групп факультета */
    public List<GroupeStudents> getFaculties() {
        return faculties;
    }


    @Override
    public String toString() {
        
        return String.format("ID потока - %d", getNumberFaculty());
    }
    
    @Override
    public Iterator<GroupeStudents> iterator() {
       
        return new StudentStreamIterator(faculties);
    }
}
