package task_4.zad2;

public class Main {
    public static void main(String[] args) {
        // Создание объектов комплексных чисел
        ComplexNumber num1 = new ComplexNumber(2.0, 3.0);
        ComplexNumber num2 = new ComplexNumber(2.0, 3.0);
        ComplexNumber num3 = new ComplexNumber(4.0, 5.0);

        // Вывод чисел
        System.out.println("Число 1: " + num1);
        System.out.println("Число 2: " + num2);
        System.out.println("Число 3: " + num3);

        // Сравнение чисел
        System.out.println("num1 равно num2? " + num1.equals(num2)); // true
        System.out.println("num1 равно num3? " + num1.equals(num3)); // false
    }
}