package task_4.zad1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Whiskers", 2);
        Bird bird = new Bird("Tweety", 1);

        Zoo zoo = new Zoo(5);

        zoo.addAnimal(dog);
        zoo.addAnimal(cat);
        zoo.addAnimal(bird);

        System.out.println("Звуки животных в зоопарке:");
        zoo.makeAllSounds();
    }
}
