package Task_1;

public class Cat extends Animal{
    private static int totalCats; //количество котов
    private boolean isFed = false; //поле сытость
    private static int foodAmountInBowl; //еда в миске

    public Cat(String name) {
        super(name);
        totalCats++;
    }

    public Cat(String name, boolean isFed) {
        super(name);
        this.isFed = isFed;
        totalCats++;
    }

    @Override
    public void run(int distance) { //бег, передаем длинну дистанции
        if (distance <= 0) {
            System.out.printf("%s - ошибка. Введена некорректная дистанция.\n", name);
        } else if (distance <= 200) {
            System.out.printf("Кот %s пробежал %d м.\n", name, distance);
        } else {
            System.out.printf("Кот %s не может бежать больше 200 м.\n", name);
        }

    }

    @Override
    public void swim(int distance) { // плаванье, передаем длинну дистанции
        System.out.printf("Кот %s не умеет плавать.\n", name);
    }

    public void eat(int portion) { //метод для кормления
        if (foodAmountInBowl >= portion) {
            foodAmountInBowl -= portion;
            isFed = true;
            System.out.printf("Кот %s покушал и сейчас сытый.\n", name);
        } else {
            System.out.printf("В миске недостаточно в еды, кот %s не смог покушать - он голоден.\n", name);
        }
    }
    // метод, с помощью которого можно изменить количество еды в миске
    public static void setFoodAmountInBowl(int foodAmountInBowl) {
        Cat.foodAmountInBowl = foodAmountInBowl >= 0? foodAmountInBowl:Cat.foodAmountInBowl;
    }
// метод, с помощью которого можно добавить еду в миску
    public static void addFoodInBowl (int addFoodAmount) {
        Cat.foodAmountInBowl += addFoodAmount;
    }

    public static int getTotalCats() {
        return totalCats;
    }

    public boolean isFed() {
        return isFed;
    }

    public static int getFoodAmountInBowl() {
        return foodAmountInBowl;
    }

    @Override
    public String toString() {
         return String.format("Кот: %s, сытость: %b.", name, isFed);
    }
}
