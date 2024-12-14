package task_4.zad1;

class Animal {
    private String name;
    private int age;

    // Конструктор
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттеры и сеттеры для name и age
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Метод makeSound(), который будет переопределен
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    // Метод для вывода информации
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Подкласс Dog
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Гав");
    }
}

// Подкласс Cat
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу");
    }
}

// Подкласс Bird
class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Чик-чирик");
    }
}

// Класс Zoo для хранения массива животных
class Zoo {
    private Animal[] animals;
    private int count; // Счетчик добавленных животных

    // Конструктор Zoo
    public Zoo(int size) {
        animals = new Animal[size];
        count = 0;
    }

    // Метод для добавления животного
    public void addAnimal(Animal animal) {
        if (count < animals.length) {
            animals[count] = animal;
            count++;
        } else {
            System.out.println("Zoo is full!");
        }
    }

    // Метод для вызова makeSound() у всех животных
    public void makeAllSounds() {
        for (int i = 0; i < count; i++) {
            animals[i].makeSound();
        }
    }
}


