package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Parent on 26.11.2016.
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary){
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    public void addSubEmployee(Employee em){
        subordinates.add(em);
    }

    public void removeSubEmployee(Employee em){
        subordinates.remove(em);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return String.format("Name: %s; dept: %s; salary: %d", name, dept, salary);
    }
}
