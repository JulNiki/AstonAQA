/*1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.*/
package Task;
public class Employee {
    String fullName;
    String position;
    String email;
    String phoneNumber;
    float salary;
    int age;

    public Employee(String fullName, String position, String email, String phoneNumber, float salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.printf("ФИО: %s;\nдолжность: %s;\nemail: %s;\nтелефон: %s;\nзарплата: %.2f;\nвозраст: %d%n\n", fullName, position, email, phoneNumber, salary, age);
    }

}
