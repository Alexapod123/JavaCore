package dz_3;

import java.time.LocalDate;

public class Lead extends Employee{

    public Lead(String name, String surname, LocalDate birthday, String position, double salary) {
        super(name, surname, birthday, position, salary);
    }

    public static void increaseSalary(Employee[] employees, double percentage) {
        for (Employee employee : employees) {
            if (!(employee instanceof Lead)) {
                double currentSalary = employee.getSalary();
                double newSalary = currentSalary * (1 + percentage / 100);
                employee.setSalary(newSalary);
            }
        }
    }
}
