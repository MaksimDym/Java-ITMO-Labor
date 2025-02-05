package L6;

import java.util.Scanner;

public class UserInput extends BaseUserInfo {
    private Scanner scanner;

    public UserInput(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getUserName() {
        System.out.print("Введите ваше имя: ");
        return scanner.nextLine();
    }
}
