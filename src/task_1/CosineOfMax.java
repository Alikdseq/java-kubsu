package task_1;

import java.util.Scanner; // Импортируем класс для ввода данных

public class CosineOfMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод чисел a и b
        System.out.print("Введите число a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите число b: ");
        double b = scanner.nextDouble();

        // Находим наибольшее из двух чисел
        double max = Math.max(a, b);

        // Вычисляем косинус от наибольшего числа
        double d = Math.cos(max);

        // Вывод результата
        System.out.println("Наибольшее число: " + max);
        System.out.println("Значение d = cos(max(a, b)): " + d);
    }
}