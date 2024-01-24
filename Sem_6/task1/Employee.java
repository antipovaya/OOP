// 1) Переписать код в соответствии с Single Responsibility Principle:
// Подсказка: вынесите метод calculateNetSalary() в отдельный класс

package Sem_6.task1;

import java.util.Date;

public class Employee {
        private String name;
        private Date dob;
        private int baseSalary;

        public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
        }

        public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
        }

        public String getName() {
                return name;
        }

        public Date getDob() {
                return dob;
        }

        public int getBaseSalary() {
                return baseSalary;
        }
        

        // public int calculateNetSalary() {
        // int tax = (int) (baseSalary * 0.25);//calculate in otherway
        // return baseSalary - tax;
        // }
        
}


