public class Main {
    private static EmployeesService employeeService;

    public static void main(String[] args) {

        Employees p1Employee = new Employees("Иван Александрович Хлестаков", 54687, 3);
        Employees p2Employee = new Employees("Иван Кузьмич Шпекин", 76357, 1);
        Employees p3Employee = new Employees("Степан Ильич Уховертов", 61879, 2);
        Employees p4Employee = new Employees("Артемий Филиппович Земляника", 84687, 4);
        Employees p5Employee = new Employees("Лука Лукич Хлопов", 67294, 5);

        EmployeesService listAllEmployee = new EmployeesService(new Employees[8]);
        listAllEmployee.writeInNullIndex(p1Employee);
        listAllEmployee.writeInNullIndex(p2Employee);
        listAllEmployee.writeInNullIndex(p3Employee);
        listAllEmployee.writeInNullIndex(p4Employee);
        listAllEmployee.writeInNullIndex(p5Employee);
        listAllEmployee.printAllEmployee();
        System.out.println("Сумма зарплат по всем отделам составляет " + listAllEmployee.totalSalaryEmployees() + "рублей");
        System.out.println("Минимальная зарплата: " + listAllEmployee.showMinSalaryEmployee());
        System.out.println("Максимальная зарплата: " + listAllEmployee.showMaxSalaryEmployee());
        System.out.println("Средняя зарплата сотрудников составляет " + listAllEmployee.averageSalary() + " рублей");
        System.out.println("В нашей компании работают следующие сотрудники: ");
        listAllEmployee.printFullEmployees();








    }


}
