public class EmployeesService {

        private Employees[] employees;

        private static int index;

        public EmployeesService(Employees[] employee) {
            this.employees = employee;

        }
        public EmployeesService(int index) {
            this.index = index;
        }

        public Employees[] getEmployee() {
            return employees;
        }

        public int getIndex() {
            return index;
        }

        public void writeInNullIndex(Employees employee) {
            for (int i = 0; i < this.employees.length; i++) {
                if (this.employees[i] == null) {
                    employees[i] = employee;
                    return;
                }
            }
        }
        public void printAllEmployee() {
            for (int i = 0; i < this.employees.length; i++) {
                if (this.employees[i] != null) {
                    System.out.println(this.employees[i]);
                }
            }
        }

        public double totalSalaryEmployees() {
            double total = 0;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null) {
                    total += employees[i].getSalary();
                }
            }
            return total;

        }

        public  Employees showMinSalaryEmployee() {
            Employees showSalary = employees[0];
            double min = Double.MAX_VALUE;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null && employees[i].getSalary() < min) {
                    min = employees[i].getSalary();
                    showSalary = employees[i];

                }

            }
            return showSalary;
        }

        public Employees showMaxSalaryEmployee() {
            Employees showSalary = employees[0];
            double max = Double.MIN_VALUE;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null && employees[i].getSalary() > max) {
                    max = employees[i].getSalary();
                    showSalary = employees[i];

                }
            }
            return showSalary;
        }

        public double averageSalary() {
            int totalNotNullEmployees = 0;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null) {
                    totalNotNullEmployees++;
                }
            }
            return totalSalaryEmployees() / totalNotNullEmployees;
        }

        public void printFullEmployees() {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null) {
                    System.out.println(employees[i].getFullNameEmployees());
                }
            }
        }
    }


