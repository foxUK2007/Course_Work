public class Employees {
    private String fullNameEmployees;
    private int id;
    private double salary;
    private int department;

    private static int index = 0;

    public Employees(String fullNameEmployees, double salary, int department) {
        this.fullNameEmployees = fullNameEmployees;
        this.salary = salary;
        this.department = department;
        index++;
        id = index;

    }

    public String getFullNameEmployees() {
        return fullNameEmployees;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return id + ". " + "Сотрудник: " + fullNameEmployees + ", Отдел номер " + department + ", Зароботная плата - " + salary + " рублей";
    }


}
