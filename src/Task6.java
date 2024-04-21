/* 6. Напишите метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом. */

import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        positiveOrNegative(a);

    }
    static void positiveOrNegative (int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else  {
            System.out.println("Отрицательное");
        }

    }

}