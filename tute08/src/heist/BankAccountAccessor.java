package heist;

/**
 * A single access to a bank account.
 * 
 * @author Nick Patrikeos + @your name
 */
public class BankAccountAccessor {
    
    private BankAccount account;

    private static BankAccountAccessor instance;

    // Constructro is private to prevent other classes from using the new operator and creating an instance
    private BankAccountAccessor(BankAccount account) {
        this.account = account;
    }

    // Static creation method that controls access to the singleton instance
    // * synchronized: ensures only one thread can access this piece of code at any one time
    // ? Why might synchronized be bad? 
    // Lost the benefit of using multiple threads at one time which can slow down your program
    // Restrict the scopy of synchronized code blocks as much as possible
    public synchronized static BankAccountAccessor getInstance(BankAccount account) {
        if (instance == null) {
            // There has been no instance created
            instance = new BankAccountAccessor(account);
        }
        return instance;
    }

    public synchronized void withdraw(String user, int numberOfWithdrawals, int amountPerWithdrawal) {
        System.out.println(user + " is accessing the bank.");

        for (int i = 0; i < numberOfWithdrawals; i++) {
            if (account.withdraw(amountPerWithdrawal)) {
                System.out.println(user + " successfully withdrew $" + amountPerWithdrawal);
                System.out.println("------ Balance is now $" + account.getBalance() + "------");
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