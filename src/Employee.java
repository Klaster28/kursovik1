public class Employee {
    private String fullName;
    private double salary;
    private int department;
    private int id;

    private static int counter = 0;

    public Employee (String fullName, double salary, int department) {
        this.department = department;
        this.salary = salary;
        this.fullName = fullName;
        counter++;
        id = counter;

    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%d. %s; Номер отдела - %d; Зарплата - %.2f", id, fullName, department, salary);
    }
}
