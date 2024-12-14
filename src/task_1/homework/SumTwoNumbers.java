package task_1.homework;

public class SumTwoNumbers {
    public static void main(String[] args) {
        if (args.length == 2) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a + " + " + b + " = " + (a + b));
        } else {
            System.out.println("Неверное количество параметров");
        }
    }
}