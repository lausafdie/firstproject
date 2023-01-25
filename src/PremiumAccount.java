/**
 * Premium accounts are similar to standard accounts with the one difference
 * that they do not have credit limit - we can withdraw as much as we want.
 */
public class PremiumAccount implements IAccount {
    /**
     * This constructor gets as an argument the account number
     * represented as an integer.
     * @param accountNumber the account number
     */
    public PremiumAccount(int accountNumber) {
    }

    public void Deposit(double amount) {
    }

    public double Withdraw(double amount) {
        return 0;
    }

    public double GetCurrentBalance() {
        return 0;
    }

    public int GetAccountNumber() {
        return 0;
    }
}
