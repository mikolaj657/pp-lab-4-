import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

       // Dodawanie pracowników
        employees[0] = new Manager("Mikołaj Kubicki", 50000, 0);
        employees[1] = new Worker("Kacper Gabrysiak", 60000, "Deweloper");
        employees[2] = new Employee("Wiktoria Pospolita", 55000);
        employees[3] = new Worker("Anna Kadaj", 65000, "Księgowa");
        employees[4] = new Worker("Piotr Nowak", 70000, "Menedżer marketingu");
        
        // Zmiany zgodnie z wymaganiami zadania
        int nonManagerCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagerCount++;
            }
        }
        ((Manager) employees[0]).setNumberOfSubordinates(nonManagerCount);
        employees[0].setSalary(75000);

        // Wyświetlanie danych dla wszystkich pracowników
        System.out.println("Dane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}       
