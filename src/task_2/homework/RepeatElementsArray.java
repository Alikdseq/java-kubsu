package task_2.homework;

import java.util.ArrayList;
import java.util.HashSet;

public class RepeatElementsArray {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 3, 5, 9, 1, 5};

        HashSet<Integer> allElements = new HashSet<>();   // Все элементы
        HashSet<Integer> repeatedElements = new HashSet<>(); // Повторяющиеся элементы

        for (int num : array) {
            if (!allElements.add(num)) {
                repeatedElements.add(num);
            }
        }

        ArrayList<Integer> resultList = new ArrayList<>(repeatedElements);

        System.out.println("Повторяющиеся элементы исходного массива: " + resultList);
    }
}