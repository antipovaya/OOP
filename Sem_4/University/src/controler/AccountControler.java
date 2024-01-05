package controler;

import java.util.List;

import domen.Person;
import domen.Teacher;

public class AccountControler <T extends Person>{

    private List<T> persons;

    public void AverageAge(List<T> persons) {
    this.persons = persons;
  }

    public <T extends Teacher> void paySalary(T person, int paySalary) {
        System.out.println(String.format("%s выплачено %d рублей", person.getName(), paySalary));
    }

    public double getAverageAge() {
        double sum = 0;
        for (T person : persons) {
          sum += person.getAge();
        }
        return sum / persons.size();
      }
   

}