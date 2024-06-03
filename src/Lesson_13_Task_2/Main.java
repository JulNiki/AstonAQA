package Lesson_13_Task_2;


public class Main {
    public static void main(String[] args) {
        PhoneBook newPhoneBook = new PhoneBook();
        newPhoneBook.add("Трофимова", "+79101026673");
        newPhoneBook.add("Тэн", "+79856912159");
        newPhoneBook.add("Генкин", "+79285649515");
        newPhoneBook.add("Мягкова", "+79927208777");
        newPhoneBook.add("Генкин", "+79707334562");
        newPhoneBook.add("Трофимова", "+79141027791");

        newPhoneBook.printBook();

        System.out.println("Поиск по фамилии Трофимова: " + newPhoneBook.get("Трофимова"));

    }
}
