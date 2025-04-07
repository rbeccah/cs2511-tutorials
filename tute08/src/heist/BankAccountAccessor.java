package heist;

/**
 * A single access to a bank account.
 * 
 * @author Nick Patrikeos + @your name
 */
public class BankAccountAccessor {
    
    private BankAccount account;

    private static BankAccountAccessor instance;

    // Constructor is private to prevent other classes from using the new operator and creating instances whenever they want
    private BankAccountAccessor(BankAccount account) {
        this.account = account;
    }

    // Creation method
    // * synchronized: only one thread can access this piece of code at any one time
    // similar to locks
    // ? Why might synchronized be bad? 
    // Lost the benefit of having multiple threads at one time, it can slow down your program
    // We only use synchronized when we need to
    public synchronized static BankAccountAccessor getInstance(BankAccount account) {
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