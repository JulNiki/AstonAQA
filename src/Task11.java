/*11. Задать пустой целочисленный массив длиной 100.
С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100; */
public class Task11 {
    public static void main(String[] args) {
        int[] myArr = new int[100];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = i + 1;
        }

        for (int j : myArr) System.out.print(j + " ");
    }

}