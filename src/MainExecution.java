public class MainExecution {

    public static void main(String[] args) {


        BankAccount bankAccount = new BankAccount();

        bankAccount.setBalance(20000);
        bankAccount.setAccountNumber(101010101);
        bankAccount.setOwnerName("Karthik");

        bankAccount.withDraw(15000);
        bankAccount.deposit(5000);

        System.out.println(bankAccount.getBalance());
        bankAccount.checkBalance();

        Counter counter = new Counter();
        counter.setCount(12);
        counter.decrement();
        counter.increment();
        System.out.println(counter.getCount());
        counter.reset();


    }
}
