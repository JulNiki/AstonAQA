/*9. Напишите метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/

import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(isLeapYear(year));
    }

    static boolean isLeapYear(int year) {
        boolean result;
        result = ((year % 4 == 0) && (year % 100 != 0) || (year % 100 == 0 && year % 400 == 0));
        return result;
    }
}