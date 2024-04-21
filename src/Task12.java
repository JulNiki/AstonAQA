/*12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2; */
public class Task12 {
    public static void main(String[] args) {
        int[] myArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] < 6) {
                myArr[i] = myArr[i] * 2;
            }
        }
        for (int j : myArr) System.out.print(j + " ");
    }

}