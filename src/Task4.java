/* 4. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями,
которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”*/
public class Task4 {

    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        compareNumbers (a, b);

    }
    static void compareNumbers (int a, int b) {
       if (a >= b) {
           System.out.println("a >= b");
       } else  {
           System.out.println("a < b");
       }

    }
}
