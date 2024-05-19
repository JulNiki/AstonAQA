package Lesson_7_Task_1;

public class Cat extends Animal{
    private static int totalCats; //количество котов
    private boolean isFed = false; //поле сытость
    private static final int MAX_RUN_DISTANCE = 200;
    private static Bowl bowl;

    static {
        bowl = new Bowl();
    }

    public Cat(String name) {
        super(name);
        totalCats++;
    }

    public Cat(String name, boolean isFed) {
        super(name);
        this.isFed = isFed;
        totalCats++;
    }


    public static int getTotalCats() {
        return totalCats;
    }

    public void eat(int portion) { // метод для кормления
        if (bowl.eatFromBowl(portion)) {
            isFed = true;
            System.out.printf("Кот %s покушал и сейчас сытый.\n", name);
        } else {
            System.out.printf("В миске недостаточно в еды, кот %s не смог покушать - он голоден.\n", name);
        }
    }

    @Override
    public void run(int distance) { //бег, передаем длинну дистанции
        if (distance <= 0) {
            System.out.printf("%s - ошибка. Введена некорректная дистанция.\n", name);
        } else if (distance <= MAX_RUN_DISTANCE) {
            System.out.printf("Кот %s пробежал %d м.\n", name, distance);
        } else {
            System.out.printf("Кот %s не может бежать больше 200 м.\n", name);
        }

    }

    @Override
    public void swim(int distance) { // плаванье, передаем длинну дистанции
        System.out.printf("Кот %s не умеет плавать.\n", name);
    }





    @Override
    public String toString() {
         return String.format("Кот: %s, сытость: %b.", name, isFed);
    }


}
