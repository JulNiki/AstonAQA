package Task_1;

public class Cat extends Animal{
    private static int totalCats;
    private boolean isFed = false;
    private static int foodAmountInBowl;

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
    public void run(int distance) {
        if (distance <= 0) {
            System.out.printf("%s - ошибка. Введена некорректная дистанция.\n", name);
        } else if (distance <= 200) {
            System.out.printf("Кот %s пробежал %d м.\n", name, distance);
        } else {
            System.out.printf("Кот %s не может бежать больше 200 м.\n", name);
        }

    }

    @Override
    public void swim(int distance) {
        System.out.printf("Кот %s не умеет плавать.\n", name);
    }

    public void eat(int portion) {
        if (foodAmountInBowl >= portion) {
            foodAmountInBowl -= portion;
            isFed = true;
            System.out.printf("Кот %s покушал и сейчас сытый.\n", name);
        } else {
            System.out.printf("В миске недостаточно в еды, кот %s не смог покушать - он голоден.\n", name);
        }
    }

    public static void setFoodAmountInBowl(int foodAmountInBowl) {
        Cat.foodAmountInBowl = foodAmountInBowl;
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
