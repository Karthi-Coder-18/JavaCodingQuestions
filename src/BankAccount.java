public class BankAccount {

    private int accountNumber;
    private int balance;
    private String ownerName;


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void deposit(int amount) {
        balance = amount + getBalance();
        System.out.println("Account number" + getAccountNumber() + " with owner name " + getOwnerName() + " has the balance of " + getBalance());
    }

    public void withDraw(int amount) {
        if (amount > getBalance()) {
            System.out.println("In sufficient funds available");
        } else {
            balance = getBalance() - amount;
            System.out.println(amount);
        }
    }

    public void checkBalance() {
        int balance = getBalance();
        System.out.println(balance);
    }
}
