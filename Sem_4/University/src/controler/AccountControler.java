package controler;

import domen.Person;
import domen.Teacher;

public class AccountControler {
    public <T extends Teacher> void paySalary(T person, int paySalary){
        System.out.println(String.format("%s выплачено %d рублей", person.getName(), paySalary));
    } 
    
}