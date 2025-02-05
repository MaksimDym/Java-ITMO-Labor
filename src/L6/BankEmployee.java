//Ex1 , Ex2

package L6;

class BankEmployee extends Person implements Displayable , BankOperations {
    private String bankName;



    public BankEmployee(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public void displayInfo() {
        System.out.println("Сотрудник банка: " + getFirstName() + " " + getLastName() + ", Банк: " + bankName);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Сотрудник " + getFirstName() + " " + getLastName() + " обработал депозит на сумму $" + amount);
    }
}
