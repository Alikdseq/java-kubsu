package task_1.homework;

import java.util.Scanner;

public class LoginCheck {

    private static final String CORRECT_USERNAME = "Alikhan";
    private static final String CORRECT_PASSWORD = "1234";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите имя пользователя: ");
        String username = scanner.nextLine();

        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
            System.out.println("Вас узнали. Добро пожаловать");
        } else {
            System.out.println("Логин и пароль не распознаны. Доступ запрещен");
        }

        scanner.close();
    }
}