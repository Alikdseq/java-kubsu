package task_4.zad1;

public class Main {
    public static void main(String[] args) {
        // Создаем животных
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Whiskers", 2);
        Bird bird = new Bird("Tweety", 1);

        // Создаем зоопарк с вместимостью 5 животных
        Zoo zoo = new Zoo(5);

        // Добавляем животных в зоопарк
        zoo.addAnimal(dog);
        zoo.addAnimal(cat);
        zoo.addAnimal(bird);

        // Выводим звуки всех животных в зоопарке
        System.out.println("Звуки животных в зоопарке:");
        zoo.makeAllSounds();
    }
}
