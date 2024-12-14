package task_2.homework;

import java.util.Arrays;
import java.util.Random;

public class VectorExample {

    // Метод для заполнения массива случайными значениями
    public static int[] fillRandomIntVector(int size, int minValue, int maxValue) {
        Random random = new Random();
        int[] vector = new int[size];
        for (int i = 0; i < size; i++) {
            vector[i] = random.nextInt(maxValue - minValue + 1) + minValue;
        }

        return vector;
    }

    // Метод для вывода массива на экран с сообщением
    public static void printVector(int[] vector, String message) {
        System.out.println(message);
        for (int value : vector) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int size = 30;
        int minValue = 100;
        int maxValue = 200;

        int[] vector = fillRandomIntVector(size, minValue, maxValue);

        printVector(vector, "Исходный массив:");

        Arrays.sort(vector);

        printVector(vector, "Отсортированный массив:");
    }
}
