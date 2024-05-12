package Task_1;

public abstract class Animal {

    private static int totalAnimals;//общее кол-во животных
    protected String name;


    public Animal(String name) {
        this.name = name;
        totalAnimals++;
    }

    public abstract void run(int distance); // абстрактный метод - бег
    public abstract void swim(int distance);// абстрактный метод - плавание

    public static int getTotalAnimals() {
        return totalAnimals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
