import company.models.Manager;
import company.models.Worker;




public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", 5000, 1);
        Worker worker2 = new Worker("Ian", 6000, 2);
        Worker worker3 = new Worker("Bob", 7000, 3);
        Worker worker4 = new Worker("Adam", 8000, 4);
        Manager manager = new Manager("Ewka", 19000, 5);

        
        Worker[] workers = {worker1, worker2, worker3, worker4};
        for (Worker worker : workers) {
            System.out.println("Salary of " + worker.getName() + ": " + worker.getSalary());
            worker.work();
        }

        System.out.println("Salary of " + manager.getName() + ": " + manager.getSalary());
        manager.work();
    }
}
