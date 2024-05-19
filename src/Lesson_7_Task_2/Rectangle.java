package Lesson_7_Task_2;

public class Rectangle implements Figures {
    private double sideA;
    private double sideB;
    private String fillColor;
    private String borderColor;

    public Rectangle(double sideA, double sideB,  String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return Figures.super.calculatePerimeter(sideA, sideB);
    }


    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return String.format("Прямоугольник, периметр: %.2f; площадь: %.2f; цвет фона: %s; цвет границ: %s.", calculatePerimeter(), calculateArea(), fillColor, borderColor);
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }



}
