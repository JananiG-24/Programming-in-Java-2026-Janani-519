class Employee {
    String name;
    int id;
    double monthlySalary;
    Employee(String name, int id, double monthlySalary) {
        this.name = name;
        this.id = id;
        this.monthlySalary = monthlySalary;
    }
    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Monthly Salary: " + monthlySalary);
    }
    class Salary {
        void calculateAndDisplayAnnualSalary() {
            double annualSalary = monthlySalary * 12;
            System.out.println("Annual Salary: " + annualSalary);
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Rahul", 101, 50000);
        emp.displayEmployeeDetails();
        Employee.Salary salary = emp.new Salary();
        salary.calculateAndDisplayAnnualSalary();
    }
}
