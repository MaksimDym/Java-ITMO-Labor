//Ex1 , Ex2

package L6;

class Client extends Person implements Displayable , BankOperations {
    private String bankName;
    private double balance;


    public Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
        this.balance = 0.0;
    }

    @Override
    public void displayInfo() {
        System.out.println("Клиент: " + getFirstName() + " " + getLastName() + ", Банк: " + bankName);

    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Клиент " + getFirstName() + " " + getLastName() + " внес $" + amount + ". Текущий баланс: $" + balance);
    }
}