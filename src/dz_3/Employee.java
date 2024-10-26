/*
Написать прототип компаратора - метод внутри класса сотрудника,
сравнивающий две даты, представленные в виде трёх чисел гггг-мм-дд, без использования условного оператора.
 */

package dz_3;

import java.time.LocalDate;
import java.util.Comparator;

public class Employee {
    private String name;
    private String surname;
    private LocalDate birthday;
    private String position;
    private double salary;


    public Employee(String name, String surname, LocalDate birthday, String position, double salary) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public static Comparator<Employee> birthdayCompare(){
        return Comparator.comparing(employee -> employee.birthday);
    }
}
