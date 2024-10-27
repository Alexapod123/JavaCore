package dz_3_4;

import java.time.LocalDate;

import static dz_3_4.Employee.birthdayCompare;
import static dz_3_4.Holidays.*;

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


        congratulation(employees, CurrentDate);
    }


    public static void congratulation(Employee[] employees, Holidays date){
        if (date.getDay() == New_Year.getDay() && date.getMonth()==New_Year.getMonth()) {
            for (Employee employee: employees) {
                System.out.println("С Новым годом, " + employee.getName() + "!!!");
            }
        }
        else if (date.getDay() == Defender_of_the_Fatherland_Day.getDay() && date.getMonth()== Defender_of_the_Fatherland_Day.getMonth()){
            for (Employee employee: employees){
                if (employee.getGender() == Gender.Male){
                    System.out.println("С днем защитника Отечества, " + employee.getName() + "!!!");
                }
            }
        }
        else if (date.getDay() == International_Women_Day.getDay() && date.getMonth()== International_Women_Day.getMonth()){
            for (Employee employee: employees){
                if (employee.getGender() == Gender.Female){
                    System.out.println("С Международным женским днем, " + employee.getName() + "!!!");
                }
            }
        } else System.out.println("Сегодня непраздничный день!");


    }
}
