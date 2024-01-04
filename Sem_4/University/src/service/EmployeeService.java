package service;

import java.util.ArrayList;
import java.util.List;

import domen.Employee;
import domen.PersonComparator;
import domen.Student;


public class EmployeeService implements iPersonService<Employee> {
    private int countEmployee;
    private List<Employee> employeeList;

    public EmployeeService() {
        employeeList = new ArrayList<>();
    }

    @Override
    public List<Employee> getAll() {
        return employeeList;
    }

    @Override
    public void create(String name, int age) {
        Employee employee = new Employee(name, age, "Разнорабочий");
        employeeList.add(employee);
        countEmployee++;
        
    }

    public void sortByFamily(){
        PersonComparator<Employee> personComparator = new PersonComparator<Employee>();
        employeeList.sort(personComparator);
    }
}
