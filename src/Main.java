public class Main {
    private static Employees[] employee;

    public static void main(String[] args) {
        employee = new Employees[8];
        employee[0] = new Employees("Иван Александрович Хлестаков", 54687, 3);
        employee[1] = new Employees("Иван Кузьмич Шпекин", 76357, 1);
        employee[2] = new Employees("Степан Ильич Уховертов", 61879, 2);
        employee[3] = new Employees("Артемий Филиппович Земляника", 84687, 4);
        employee[4] = new Employees("Лука Лукич Хлопов", 67294, 5);
        printEmployees();
        System.out.println("Сумма зарплат по всем отделам составляет " + totalSalaryEmployees());
        System.out.println("Минимальная зарплата: " + showMinSalaryEmployee());
        System.out.println("Максимальная зарплата: " + showMaxSalaryEmployee());
        System.out.println("Средняя зарплата сотрудников составляет " + averageSalary() + " рублей");
        System.out.println("В нашей компании работают следующие сотрудники: ");
        printFullEmployees();
    }


    public static void printEmployees() {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i].toString());
            }
        }
    }

    public static double totalSalaryEmployees() {
        double total = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                total += employee[i].getSalary();
            }
        }
        return total;

    }

    public static Employees showMinSalaryEmployee() {
        Employees showSalary = employee[0];
        double min = Double.MAX_VALUE;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() < min) {
                min = employee[i].getSalary();
                showSalary = employee[i];

            }

        }
        return showSalary;
    }

    public static Employees showMaxSalaryEmployee() {
        Employees showSalary = employee[0];
        double max = Double.MIN_VALUE;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() > max) {
                max = employee[i].getSalary();
                showSalary = employee[i];

            }
        }
        return showSalary;
    }

    public static double averageSalary() {
        int totalNotNullEmployees = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                totalNotNullEmployees++;
            }
        }
        return totalSalaryEmployees() / totalNotNullEmployees;
    }

    public static void printFullEmployees() {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i].getFullNameEmployees());
            }
        }
    }
}
