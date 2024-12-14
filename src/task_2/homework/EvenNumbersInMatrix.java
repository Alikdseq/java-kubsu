package task_2.homework;

import java.util.Random;

public class EvenNumbersInMatrix {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;

        // Создание и заполнение матрицы случайными значениями
        int[][] matrix = new int[rows][cols];
        Random random = new Random();

        System.out.println("Исходная матрица:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(100);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Подсчёт чётных чисел в каждой строке
        for (int i = 0; i < rows; i++) {
            int evenCount = 0;
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] % 2 == 0) {
                    evenCount++;
                }
            }
            System.out.println("Количество чётных чисел в строке " + (i + 1) + ": " + evenCount);
        }
    }
}