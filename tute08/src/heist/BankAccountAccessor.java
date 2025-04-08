package heist;

/**
 * A single access to a bank account.
 * 
 * @author Nick Patrikeos + @your name
 */
public class BankAccountAccessor {
    
    private BankAccount account;

    private static BankAccountAccessor instance;

    private BankAccountAccessor(BankAccount account) {
        this.account = account;
    }

    // Creation method
    // * synchronized: only have one thread access this piece of code (scope) at any one time
    // similar to locks
    // ? Why might synchronized be bad? 
    // Lost of the benefit of multiple threads, it can slow down the program
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