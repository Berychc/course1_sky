package skypro.course1.coursework;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("David Persov", 2, 1500);
        employees[1] = new Employee("Egor Veselov", 3, 2000);
        employees[2] = new Employee("Mike Vozovskiy", 1, 1800);
        employees[3] = new Employee("Sarah Parker", 2, 1700);
        employees[4] = new Employee("David Miller", 5, 2200);
        employees[5] = new Employee("Coron Ville", 4, 1900);
        employees[6] = new Employee("Michael Jakson", 3, 1600);
        employees[7] = new Employee("Travis Scott", 1, 2100);
        employees[8] = new Employee("Kate Henderson", 4, 2300);
        employees[9] = new Employee("Berychc Velob", 5, 2400);

        System.out.println("Список всех сотрудников:");
        printAllEmployees(employees);

        System.out.println("Минимальная зарплата: " + findMinSalary(employees));
        System.out.println("Максимальная зарплата: " + findMaxSalary(employees));
        System.out.println("Средняя зарплата: " + calculateAverageSalary(employees));

        System.out.println("Список Ф. И. О. всех сотрудников:");
        printEmployeesNames(employees);
    }

    public static void printAllEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public static double calculateMonthlyExpenses(Employee[] employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public static Employee findMinSalary(Employee[] employees) {
        if (employees.length == 0) {
            return null;
        }

        Employee minSalaryEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employees[i];
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findMaxSalary(Employee[] employees) {
        if (employees.length == 0) {
            return null;
        }

        Employee maxSalaryEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employees[i];
            }
        }
        return maxSalaryEmployee;
    }

    public static double calculateAverageSalary(Employee[] employees) {
        if (employees.length == 0) {
            return 0;
        }

        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary / employees.length;
    }

    public static void printEmployeesNames(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}