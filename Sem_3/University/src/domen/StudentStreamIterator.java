package domen;

import java.util.Iterator;
import java.util.List;

/** Класс для итерации экземпляров класса GroupeStudents */
public class StudentStreamIterator implements Iterator<GroupeStudents> {
    private int countGroup;
    private List<GroupeStudents> groupe;


    /** Конструктор класса
    
     */
    public StudentStreamIterator(List<GroupeStudents> groupe) {
       
        this.groupe = groupe;
        countGroup = 0;
    }


    @Override
    public boolean hasNext() {
        
        return countGroup < groupe.size();
    }


    @Override
    public GroupeStudents next() {
       
        return groupe.get(countGroup);
    }

}
