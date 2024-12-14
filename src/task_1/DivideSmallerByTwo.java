package task_1;

public class DivideSmallerByTwo {
    public static void main(String[] args) {
        if (args.length == 2) {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            int smaller = Math.min(x, y);
            double result = smaller / 2.0;
            System.out.println("Результат: " + result);
        } else {
            System.out.println("Неверное количество параметров");
        }
    }
}
