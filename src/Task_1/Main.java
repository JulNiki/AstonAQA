//Создать массив котов и миску с едой, попросить всех котов покушать из этой миски и потом вывести информацию о сытости котов в консоль.

package Task_1;

public class Main {
    public static void main(String[] args) {

        Dog[] dogs = { new Dog("Стрелка"), new Dog("Белка"), new Dog("Мухтар"), new Dog("Фрося") };
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
        System.out.println("Количество собак: " + Dog.getTotalDogs());

        dogs[0].swim(5);
        dogs[1].swim(20);
        dogs[2].run(10);
        dogs[3].run(501);

        System.out.println("Количество животных :" + Animal.getTotalAnimals());




    }
}
