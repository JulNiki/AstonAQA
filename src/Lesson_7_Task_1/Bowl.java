package Lesson_7_Task_1;

public class Bowl {
    private static int foodAmountInBowl; // еда в миске

    public Bowl() {
    }

    public boolean eatFromBowl(int portion) { // метод для кормления
        if (foodAmountInBowl >= portion) {
            foodAmountInBowl -= portion;
            return true;
        } else {
            return false;
        }
    }

    // метод, с помощью которого можно изменить количество еды в миске
    public static void setFoodAmountInBowl(int foodAmountInBowl) {
        Bowl.foodAmountInBowl = Math.max(foodAmountInBowl, 0);
    }

    // метод, с помощью которого можно добавить еду в миску
    public static void addFoodInBowl(int addFoodAmount) {
        if (addFoodAmount > 0) {
            Bowl.foodAmountInBowl += addFoodAmount;
        }
    }

    public static int getFoodAmountInBowl() {
        return foodAmountInBowl;
    }
}