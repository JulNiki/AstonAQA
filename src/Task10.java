/*10. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
С помощью цикла и условия заменить 0 на 1, 1 на 0; */
public class Task10 {
    public static void main(String[] args) {
        int[] myArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] == 0) {
                myArr[i] = 1;
            } else if (myArr[i] == 1) {
                myArr[i] = 0;
            }
        }
        for (int j : myArr) System.out.print(j + " ");
    }

}