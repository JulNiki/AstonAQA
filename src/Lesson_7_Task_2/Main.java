package Lesson_7_Task_2;

public class Main {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(3, 4, 5, "красный", "черный");
        System.out.println(triangle1);

        Circle circle1 = new Circle(10, "жёлтый", "синий");
        System.out.println(circle1);

        Rectangle rectangle1 = new Rectangle(8, 9, "зелёный", "белый");
        System.out.println(rectangle1);
    }
}
