/*1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета.*/

public class Main {
    public static void main(String[] args) {
        String[][] array = {{"11", "0", "-1", "6"},{"8", "-7", "4", "2"}, {"8", "0", "0", "1"}, {"1", "1", "1", "1"} };
        String[][] errArray1 = {{"öö", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        String[][] errArray2 = {{"1", "2", "7"}, {"5", "8", "6", "2"}, {"3", "7", "8", "88"}};

        try {
            System.out.println("Сумма элементов массива = " + convertArrayElementsToIntAndSummarize(array));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        try {
            System.out.println("Сумма элементов массива = " + convertArrayElementsToIntAndSummarize(errArray1));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        try {
            System.out.println("Сумма элементов массива = " + convertArrayElementsToIntAndSummarize(errArray2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }


    }

    public static int convertArrayElementsToIntAndSummarize(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("Неверный размер. Массив должен быть размером 4x4.");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Неверный размер. Массив должен быть размером 4x4.");
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, array[i][j]);
                }
            }
        }
        return sum;
    }
}




