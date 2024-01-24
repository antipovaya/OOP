package Sem_6.task1;



import java.util.List;

public class Accounting {
    private List<Employee> employees;

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public int calculateNetSalary(Employee employee) {
        int tax = (int) (employee.getBaseSalary() * 0.25);//calculate in otherway
        return employee.getBaseSalary() - tax;
        }
}
