import company.models.Manager;
import company.models.Worker;

import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", 5000, 2, "2024-01-15", "Junior Analytic");
        Worker worker2 = new Worker("Ian", 6000, 2, "2023-01-10", "Junior Python Developer");
        Worker worker3 = new Worker("Adam", 8000, 4, "2021-01-05", "Junior Analytic");
        Manager manager = new Manager("Ewka", 19000, 5, "2020-01-01", "Team Leadar");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(manager);

        
        for (Employee employee : employees) {
            employee.work();
            System.out.println("- " + employee.getName() + " (ID: " + employee.getId() +
                               ", Position: " + employee.getPosition() +
                               ", Hire date: " + employee.getHireDate() +
                               ", Salary: " + employee.getSalary() + ")");
        }


        //  hash
    System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
    System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
    System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
    System.out.println(manager.getName() + " has code: " + manager.hashCode());
    
        // Porównywanie
        System.out.println(worker1.getName() + " equals " + worker2.getName() + "? " + worker1.equals(worker2)); 
        System.out.println(worker1.getName() + " equals " + worker3.getName() + "? " + worker1.equals(worker3)); 
        System.out.println(worker1.getName() + " equals " + manager.getName() + "? " + worker1.equals(manager));

    }



}


