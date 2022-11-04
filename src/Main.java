import java.util.Arrays;

public class Main {
    private static Employee[] employees;

    public static void main(String[] args) {
        employees = new Employee[10];
        employees[2] = new Employee("Иванов Иван Иванович", 10000, 1);
        employees[3] = new Employee("Петров Петр Петрович", 20000, 2);
        employees[6] = new Employee("Сидоров Сидор Сидорович", 30000, 3);
        employees[8] = new Employee("Миронов Мирон Миронович", 40000, 4);
        employees[9] = new Employee("Артемов Артем Артемович", 50000, 5);
        printArray();
        System.out.println("Общая сумма зарплат работников равна - " + sumSalary());
        System.out.println("Сотрудник с минимальной зарплатой - " + definitionEmployeeMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой - " + definitionEmployeeMахSalary());
        System.out.println("Среднее значение сумм всех зарплат - " + averageValueSumSalary());


    }

    public static void printArray() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
    }

    public static double sumSalary() {
        double rezult = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                rezult += employees[i].getSalary();
            }
        }
        return rezult;
    }

    public static Employee definitionEmployeeMinSalary() {
        Employee rezult = employees[0];
        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                rezult = employees[i];
            }
        }
        return rezult;
    }

    public static Employee definitionEmployeeMахSalary() {
        Employee rezult = employees[0];
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                rezult = employees[i];
            }
        }
        return rezult;
    }
    public static double averageValueSumSalary() {
        int counterNonZeroElement  = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                counterNonZeroElement++;
            }
        }
        return sumSalary()/counterNonZeroElement;
    }

}
