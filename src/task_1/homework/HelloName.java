package task_1.homework;

public class HelloName {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("Hello world");
        }
    }
}
