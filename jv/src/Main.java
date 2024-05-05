import company.models.Manager;
import company.models.Worker;

import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", 5000, 2, "2024-01-15", "Junior Analytic");
        Worker worker2 = new Worker("Ian", 6000, 2, "2023-01-10", "Junior Python Developer");
        Worker worker3 = new Worker("Adam", 8000, 3, "2021-01-05", "Junior Analytic");
        Worker worker4 = new Worker("Marek", 8000, 4, "2021-02-05", "Analytic");
        Manager manager = new Manager("Ewka", 19000, 5, "2020-01-01", "Team Leadar");
        Manager manager2 = new Manager("Franek", 15000, 2, "2019-10-01", "Project Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(manager);
        employees.add(worker4);
        employees.add(manager2);

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;


        
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


        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
            if (employee instanceof Manager) {
                totalManagerSalary += employee.getSalary();
            } else if (employee instanceof Worker) {
                totalWorkerSalary += employee.getSalary();
            }
        }

        System.out.println("\nTotal salary of all employees: " + totalSalary);
        System.out.println("Total salary of all Managers: " + totalManagerSalary);
        System.out.println("Total salary of all Workers: " + totalWorkerSalary);

        Set<Integer> seenIds = new HashSet<>();
        Set<Integer> duplicateIds = new HashSet<>();

        for (Employee employee : employees) {
            int id = employee.getId();
            if (!seenIds.add(id)) {
                duplicateIds.add(id); 

        
            }
        }

        System.out.println("\nEmployees with duplicate IDs:");
        for (int duplicateId : duplicateIds) {
            for (Employee employee : employees) {
                if (employee.getId() == duplicateId) {
                    System.out.println(employee.getName() + " (ID: " + employee.getId() + ")");
                }
            }
        }
    }
}




