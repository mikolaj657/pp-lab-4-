public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        // Dodawanie pracowników do tablicy
        employees[0] = new Employee("Mikołaj Kubicki", 50000);
        employees[1] = new Employee("Kacper Gabrysiak", 60000);
        employees[2] = new Employee("Wiktoria Pospolita", 55000);
        employees[3] = new Employee("Anna Kadaj", 65000);
        employees[4] = new Employee("Piotr Nowak", 70000);

        // Wyświetlanie danych dla pracownika o indeksie równym 3
        System.out.println("Dane dla pracownika o indeksie 3:");
        System.out.println(employees[3]);

        // Modyfikacja salary dla pracownika o indeksie równym 3
        employees[3].setSalary(70000);

        // Wyświetlanie danych dla wszystkich pracowników
        System.out.println("\nDane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
