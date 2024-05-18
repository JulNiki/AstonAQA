package Lesson_8;

public class MyArrayDataException extends Exception{
    public MyArrayDataException(int i, int j, String value) {
        super(String.format("Не удалось преобразовать элемент '%s' в ячейке [%d][%d] в число.", value, i, j));
    }
}
