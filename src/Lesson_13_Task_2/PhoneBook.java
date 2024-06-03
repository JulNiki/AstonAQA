//2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода ииget() искать номер телефона по фамил.
// Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
package Lesson_13_Task_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    // Метод для добавления записей
    public void add(String name, String phone) {
        phoneBook.computeIfAbsent(name, k -> new ArrayList<>()).add(phone);
    }

    // Метод для поиска номеров телефона по фамилии
    public List<String> get(String name) {
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }

    // Метод для печати всего телефонного справочника
    public void printBook() {
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
