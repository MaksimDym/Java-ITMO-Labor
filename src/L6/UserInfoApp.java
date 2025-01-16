package L6;

import java.util.Scanner;

public class UserInfoApp {

    private Scanner scanner;

    public UserInfoApp(Scanner scanner) {
        this.scanner = scanner;
    }


    public int getUserAge() {
        System.out.print("Введите ваш возраст: ");
        return scanner.nextInt();
    }


    public void displayUserInfo(String name, int age) {
        System.out.println("Имя пользователя: " + name);
        System.out.println("Возраст пользователя: " + age);
    }
}
