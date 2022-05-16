package ru.skypro;

public class Main {
    public static void countMinSalary(Employee[] employees) {
        int minSalary = employees[0].getSalaryStaff();
        String staffMan = "";
        for (Employee employee : employees) {
            if (minSalary > employee.getSalaryStaff()){
                minSalary = employee.getSalaryStaff();
                staffMan = employee.getStaff();
            }
        }
        System.out.println("Сотрудник с min зарплатой: " + minSalary + staffMan );
    }

    public static void countMaxSalary(Employee[] employees) {
        int maxSalary = employees[0].getSalaryStaff();
        String staffMan = "";
        for (Employee employee : employees) {
            if (maxSalary < employee.getSalaryStaff()) {
                maxSalary = employee.getSalaryStaff();
                staffMan = employee.getStaff();
            }
        }
        System.out.println("Сотрудник с max з/п: " + staffMan + maxSalary);
    }

    public static void typeAllStaff(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void countStaffSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalaryStaff();
        }
        System.out.println("Затраты на выплату з/п в месяц " + sum);
    }

    public static void averageSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalaryStaff();
        }
        int average = sum / employees.length;
        System.out.println("Средняя з/п: " + average);
    }

    public static void countAllStaff(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println("Сотрудники: " + employee.getStaff());
        }
    }


    public static void main(String[] args) {
        Employee [] employee = new Employee[10];
        employee[0] = new Employee( "Черных Артем Викторович ", 50000, 1);
        employee[1] = new Employee("Иванов Иван Иванович ", 55000, 2);
        employee[2] = new Employee("Пертов Петр Петрович ", 60000, 3);
        employee[3] = new Employee("Сидоров Сидр Сидорович ", 65000, 4);
        employee[4] = new Employee("Орлова Мария Александровна ", 70000, 5);
        employee[5] = new Employee("Агапова Анна Николаевна ", 75000, 1);
        employee[6] = new Employee("Тарасова Мария Олеговна ", 80000, 2);
        employee[7] = new Employee("Чеснокова Елена Сергеевна ", 85000, 3);
        employee[8] = new Employee("Спицына Анастасия Александровна ", 90000, 4);
        employee[9] = new Employee("Волгина Ольга Сергеевна ", 95000, 5);
        typeAllStaff(employee);
        countMinSalary(employee);
        countMaxSalary(employee);
        countStaffSalary(employee);
        averageSalary(employee);
        countAllStaff(employee);

    }
}
