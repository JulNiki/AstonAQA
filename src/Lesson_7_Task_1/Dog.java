package Lesson_7_Task_1;

public class Dog extends Animal{
    private static int totalDogs;

    public Dog(String name) {
        super(name);
        totalDogs++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 0) {
            System.out.printf("%s - ошибка. Введена некорректная дистанция.\n", name);
        } else if (distance <= 500) {
            System.out.printf("Собака %s пробежала %d м.\n", name, distance);
        } else {
            System.out.printf("Собака %s не может бежать больше 500 м.\n", name);
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 0) {
            System.out.printf("%s - ошибка. Введена некорректная дистанция.\n", name);
        } else if (distance <= 10) {
            System.out.printf("Собака %s проплыла %d м.\n", name, distance);
        } else {
            System.out.printf("Собака %s не может плыть больше 10 м.\n", name);
        }
    }

    @Override
    public String toString() {
        return String.format("Собака: %s;", name);
    }

    public static int getTotalDogs() {
        return totalDogs;
    }


}
