/*13. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицами. */
public class Task13 {
    public static void main(String[] args) {
        int[][] my2dArr = new int[5][5];

        for (int i = 0; i < my2dArr.length; i++) { //my2dArr.length - количество строк
            for (int j = 0; j < my2dArr[i].length; j++) { //my2dArr[i].length - размер i-й строки
                if (i == j) {
                    my2dArr[i][j] = 1;
                }
                if ((i + j) ==  (my2dArr[i].length-1)) {
                    my2dArr[i][j] = 1;
                }

                System.out.print(my2dArr[i][j] + "\t");
            }
            System.out.println();

        }
    }
}