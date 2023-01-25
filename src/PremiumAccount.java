/**
 * Premium accounts are similar to standard accounts with the one difference
 * that they do not have credit limit - we can withdraw as much as we want.
 */
public class PremiumAccount implements IAccount {
    int accountNumber;
    double accountBalance;

    /**
     * This constructor gets as an argument the account number
     * represented as an integer.
     * @param accountNumber the account number
     */
    public PremiumAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        accountBalance = 0;
    }

    public void Deposit(double amount) {
        accountBalance += amount;
    }

    public double Withdraw(double amount) {
        accountBalance -= amount;
        return amount;
    }

    public double GetCurrentBalance() {
        return accountBalance;
    }

    public int GetAccountNumber() {
        return accountNumber;
    }
}
