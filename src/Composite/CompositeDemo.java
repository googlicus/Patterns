package Composite;

/**
 * Created by Parent on 26.11.2016.
 */
public class CompositeDemo {
    public static void main(String[] args){
        Employee CEO = new Employee("John","CEO", 30000);

        Employee headSales = new Employee("Robert","Head Sales", 20000);

        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        CEO.addSubEmployee(headSales);
        CEO.addSubEmployee(headMarketing);

        headSales.addSubEmployee(salesExecutive1);
        headSales.addSubEmployee(salesExecutive2);

        headMarketing.addSubEmployee(clerk1);
        headMarketing.addSubEmployee(clerk2);

        System.out.println(CEO);

        for (Employee employee : CEO.getSubordinates()) {
            System.out.println(employee);

            for (Employee employee1 : employee.getSubordinates()){
                System.out.println(employee1);
            }
        }
    }
}
