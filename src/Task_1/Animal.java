package Task_1;

public abstract class Animal {

    private static int totalAnimals;
    protected String name;


    public Animal(String name) {
        this.name = name;
        totalAnimals++;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);

    public static int getTotalAnimals() {
        return totalAnimals;
    }

    public static void setTotalAnimals(int totalAnimals) {
        Animal.totalAnimals = totalAnimals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
