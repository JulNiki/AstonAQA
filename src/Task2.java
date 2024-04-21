/*Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми
значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;*/
public class Task2 {

    public static void main(String[] args) {
        int x = 6;
        int y = -7;
        checkSumSign ( x, y);

    }
    static void checkSumSign (int a, int b) {
       if (a + b >= 0) {
           System.out.println("Сумма положительная");
       } else {
           System.out.println("Сумма отрицательная");
       }

    }
}
