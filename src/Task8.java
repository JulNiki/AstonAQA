/* 8. Напишите метод, которому в качестве аргументов передается строка и число,
метод должен отпечатать в консоль указанную строку, указанное количество раз;.*/

public class Task8 {
    public static void main(String[] args) {
        printStringHowManyTimes("ASTON", 4);
    }

    static void printStringHowManyTimes(String str, int times) {
        int x = 0;
        while (x < times) {
            System.out.println(str);
            x++;
        }
    }
}
