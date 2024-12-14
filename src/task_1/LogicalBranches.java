package task_1;

import java.util.Scanner;

public class LogicalBranches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод значения x
        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        double Y, F;

        // Вычисляем Y
        if (x <= -3) {
            Y = (Math.pow(x, 3) + 1) / (1 + Math.pow(2, x));
        } else if (x > -3 && x <= 0) {
            Y = x;
        } else {
            Y = Math.cos(x) / Math.sin(x);
        }

        // Вычисляем F
        if (x <= -3) {
            F = Math.exp(x + 1);
        } else if (x > -3 && x <= 0) {
            F = Math.pow(x, 4);
        } else {
            F = Math.sqrt(x);
        }

        System.out.println("Значение Y: " + Y);
        System.out.println("Значение F: " + F);
    }
}