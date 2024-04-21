/* 7. Напишите метод, которому в качестве параметра передается целое число.
Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.*/

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(numNegative(a));

    }
    static boolean numNegative (int a) {
        boolean result;
        result = (a < 0);
        return result;
        }

}
