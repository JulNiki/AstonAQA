package Task_2;

public interface Figures {
    double calculateArea();
    double calculatePerimeter();
    String getFillColor();
    String getBorderColor();


    // Дефолтный метод для расчета периметра прямоугольника
    default double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    // Дефолтный метод для расчета периметра треугольника
    default double calculatePerimeter(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }

    // Дефолтный метод для расчета периметра круга
    default double calculatePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

}
