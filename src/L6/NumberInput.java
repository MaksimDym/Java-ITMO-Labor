//Ex4
package L6;
import java.util.Scanner;



public class NumberInput {

    protected int number;

    public void inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        number = scanner.nextInt();
    }
}
