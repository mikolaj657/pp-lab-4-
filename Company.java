import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

       // Dodawanie pracowników
        employees[0] = new Manager("Mikołaj Kubicki", 50000, 0);
        employees[1] = new Worker("Kacper Gabrysiak", 60000, "Deweloper");
        employees[2] = new Employee("Wiktoria Pospolita", 55000);
        employees[3] = new Worker("Anna Kadaj", 65000, "Księgowa");
        employees[4] = new Worker("Piotr Nowak", 70000, "Menedżer marketingu")
        employees[5] = new Manager("Daniel Syk", 60000, 0);
        employees[6] = new Worker("Piotr Maj", 55000, "Specjalista HR");

        // Aktualizacja wartości salary
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() + 500);
            if (employee instanceof Manager) {
                ((Manager) employee).setNumberOfSubordinates(2); // Ustawienie liczby podwładnych
                employee.setSalary(75000); // Ustawienie nowej pensji dla managerów
            }
        }

        // Wyświetlanie zaktualizowanych danych o pracownikach
        System.out.println("Zaktualizowane dane pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
