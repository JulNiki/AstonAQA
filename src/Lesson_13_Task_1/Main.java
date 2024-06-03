//1. Создать массив с набором слов. Вывести список уникальных слов, из которых состоит массив. Посчитать, сколько раз встречается каждое слово.
package Lesson_13_Task_1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList(
                "вода", "земля", "меркурий", "венера",
                "марс", "нептун", "марс", "сатурн",
                "марс", "земля","нептун", "солнце",
                "марс", "земля", "солнце", "юпитер",
                "сатурн", "марс", "земля", "нептун"));

        printListOfUnique(words);
        printCountWordInList(words);

    }
// метод, для печати уникальных слов
public static void printListOfUnique(List<String> words){
        Set <String> uniqueWords = new LinkedHashSet<>(words);
        System.out.println("Cписок уникальных слов: " + uniqueWords);
    }


// метод, для печати количества каждого слова в списке
public static void printCountWordInList(List<String> words){
        Map<String, Integer> wordsCount = new LinkedHashMap<>();
        words.forEach((word) -> {wordsCount.compute(word, (key, count) -> count == null ? 1 : count + 1);});
        System.out.println("Cколько раз в списке встречается слово: " + wordsCount);
    }
}

