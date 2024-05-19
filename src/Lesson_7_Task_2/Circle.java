package Lesson_7_Task_2;

public class Circle implements Figures{
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }


    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return Figures.super.calculatePerimeter(radius);
    }


    @Override
    public String toString() {
        return String.format("Круг, периметр: %.2f; площадь: %.2f; цвет фона: %s; цвет границ: %s.", calculatePerimeter(), calculateArea(), fillColor, borderColor);
    }


}
