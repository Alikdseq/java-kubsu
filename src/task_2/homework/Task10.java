package task_2.homework;

public class Task10 {
    public static void main(String[] args) {
        int[][] A = {
                {5, -3, 2},
                {1, -7, -1},
                {4, 6, -9}
        };

        double product = 1;
        int count = 0;

        // Обходим элементы ниже главной диагонали
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i][j] < 0) {
                    product *= A[i][j];
                    count++;
                }
            }
        }

        // Проверка на наличие отрицательных элементов
        if (count > 0) {
            double geometricMean = Math.pow(product, 1.0 / count);
            System.out.printf("Среднее геометрическое: %.2f\n", geometricMean);
        } else {
            System.out.println("Отрицательных элементов ниже главной диагонали нет.");
        }
    }
}
