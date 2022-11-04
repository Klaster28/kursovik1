public class Main {
    private static Employee[] employees;
    public static void main(String[] args) {
        employees = new Employee[10];
        employees[2] = new Employee("Иванов Иван Иванович",10000, 1);
        employees[3] = new Employee("Петров Петр Петрович", 20000, 2);
        employees[6] = new Employee("Сидоров Сидор Сидорович", 30000, 3);
        employees[8] = new Employee("Миронов Мирон Миронович", 40000, 4);
        employees[9] = new Employee("Артемов Артем Артемович", 50000, 5);
        printArray();
        System.out.println("Общая сумма зарплат работников равна - " + sumSalary () );
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
            if (employees [i] != null) {
                rezult += employees[i].getSalary();
                    }
            }
        return rezult;
        }
    }
