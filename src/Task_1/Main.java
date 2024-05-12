package Task_1;

public class Main {
    public static void main(String[] args) {
//массив собак
        Dog[] dogs = { new Dog("Стрелка"), new Dog("Белка"), new Dog("Леди"), new Dog("Фрося"), new Dog("Мухтар") };
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
        System.out.println("Количество собак: " + Dog.getTotalDogs());

        dogs[0].swim(5);
        dogs[1].swim(20);
        dogs[2].run(10);
        dogs[3].run(501);
        dogs[4].run(-1);
        System.out.println();
//массив котов
        Cat[] cats = {new Cat("Коржик"), new Cat("Карамелька"), new Cat("Компот"), new Cat("Чарли"), new Cat("Живоглот"), new Cat("Бегемот")};
        for (Cat cat: cats) {
            System.out.println(cat);
        }
        System.out.println("Количество котов: " + Cat.getTotalCats());

        cats[0].swim(1);
        cats[1].run(0);
        cats[2].run(15);
        cats[3].run(200);
        cats[4].run(201);
        cats[5].swim(10);

        System.out.println("\nКоличество еды в миске: " + Cat.getFoodAmountInBowl());
        Cat.addFoodInBowl(110);
        System.out.println("Количество еды в миске после добавления: " + Cat.getFoodAmountInBowl());
        for (Cat cat: cats) {
            cat.eat(20);
        }

        for (Cat cat: cats) {
            System.out.println(cat);
        }

        System.out.println("\nОбщее количество животных :" + Animal.getTotalAnimals());
    }
}
