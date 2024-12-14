package task_2.homework;

import java.util.ArrayList;
import java.util.Collections;

public class SquareNonZeroElements {
    public static void main(String[] args) {
        int[] array = {0, -4, 3, 0, 5, -1, 0, 2};

        ArrayList<Integer> squaredList = new ArrayList<>();

        for (int num : array) {
            if (num != 0) {
                squaredList.add(num * num);
            }
        }

        Collections.sort(squaredList);

        System.out.println("Квадраты ненулевых элементов, отсортированные по возрастанию: " + squaredList);
    }
}