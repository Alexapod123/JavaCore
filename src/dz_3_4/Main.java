package dz_3_4;

import java.time.LocalDate;

import static dz_3_4.Employee.birthdayCompare;

public class Main {
    public static void main(String[] args) {
        Employee anna = new Employee("Anna", "Berezova", Gender.Female, LocalDate.of(1990,11,12), "accountant", 15000);
        Employee vasya = new Employee("Vasiliy", "Ivanov", Gender.Male, LocalDate.of(1991,12,12), "seller", 20000);
        if (birthdayCompare().compare(anna, vasya) < 0) {
            System.out.println(anna.getName() + " старше, чем " + vasya.getName());
        }
        Lead vanya = new Lead("Ivan", "Petrov", Gender.Male, LocalDate.of(1988,6,7), "lead", 40000);
        Employee[] employees = {anna, vasya, vanya};
        Lead.increaseSalary(employees, 20);
        for (Employee employee: employees){
            System.out.println("Для сотрудника " + employee.getName()+ " " + employee.getPosition() + " зарплата после повышения на 20% составляет " + employee.getSalary());
        }
    }
}
