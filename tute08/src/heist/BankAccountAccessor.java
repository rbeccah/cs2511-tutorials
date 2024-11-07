package heist;

/**
 * A single access to a bank account.
 * 
 * @author Nick Patrikeos + @your name
 */
public class BankAccountAccessor {
    
    private BankAccount account;
    private static BankAccountAccessor instance;

    // Constructor is private to prevent other classes from using the new operator
    private BankAccountAccessor(BankAccount account) {
        this.account = account;
    }

    // * synchronized: only one thread can access this piece of code at any one time
    // ! In some cases, we don't always want to use the synchronized keyword. Why? 
    // Lost the benefit of using multiple threads at one time which can slow down the program
    public synchronized static BankAccountAccessor getInstance(BankAccount account) {
        // Case where we haven't created our single instance
        if (instance == null) {
            instance = new BankAccountAccessor(account);
        }
        return instance;
    }

    public synchronized void withdraw(String user, int numberOfWithdrawals, int amountPerWithdrawal) {
        System.out.println(user + " is accessing the bank.");

        for (int i = 0; i < numberOfWithdrawals; i++) {
            if (account.withdraw(amountPerWithdrawal)) {
                System.out.println(user + " successfully withdrew $" + amountPerWithdrawal);
            } else {
                System.out.println(user + " failed to withdraw $" + amountPerWithdrawal + ".");
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }

        System.out.println(user + " is leaving the bank, the balance is $" + account.getBalance());
    }

}
