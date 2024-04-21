/* 5. Напишите метод, принимающий на вход два целых числа и проверяющий,
что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false. */

import java.util.Scanner;
public class Task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sumBtwn10and20 (a, b));

    }
    static boolean sumBtwn10and20 (int a, int b) {
        boolean result;
        result = ((a + b) >= 10) && ((a + b) <= 20);
        return result;

    }

}
