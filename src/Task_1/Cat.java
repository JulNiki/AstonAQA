//Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль.
// (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//Добавить подсчет созданных котов, собак и животных.
//Расширить задачу, добавив для котов возможность кушать из миски, выполнив следующие пункты:
//Сделать так, чтобы в миске с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
//Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
//Считаем, что если коту мало еды в миске, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
//Создать массив котов и миску с едой, попросить всех котов покушать из этой миски и потом вывести информацию о сытости котов в консоль.
//Добавить метод, с помощью которого можно было бы добавлять еду в миску.

package Task_1;

public class Cat extends Animal{
    private static int totalCats;
    private boolean isFed = false;
    private static int foodAmount;

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
        if (distance <= 200) {
            System.out.printf("Кот %s пробежал %d м.", name, distance);
        } else {
            System.out.printf("Кот %s не может бежать больше 200 м.", name);
        }

    }

    @Override
    public void swim(int distance) {
        System.out.printf("Кот %s не умеет плавать.\n", name);
    }

    public void eat(int portion) {
        if (foodAmount >= portion) {
            foodAmount -= portion;
            isFed = true;
            System.out.printf("Кот %s покушал и сейчас сыт.\n", name);
        } else {
            System.out.printf("%s не смог покушать т.к. недотаточно в еды в миске. Кот голоден.\n", name);
        }
    }

    public static void setFoodAmount(int foodAmount) {
        Cat.foodAmount = foodAmount;
    }

    public static void addFood (int addFoodAmount) {
        Cat.foodAmount += addFoodAmount;
    }

    public static int getTotalCats() {
        return totalCats;
    }

    public boolean isFed() {
        return isFed;
    }

    public static int getFoodAmount() {
        return foodAmount;
    }

    @Override
    public String toString() {
         return String.format("Кот: %s; Сытость: %b.\n", name, isFed);
    }
}
