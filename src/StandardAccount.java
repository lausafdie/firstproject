/**
 * In standard account we can deposit and withdraw money up to our credit limit,
 * we should not allow withdrawals that exceeds the credit limit and if we try
 * to withdraw more we should only provide the amount allowed.
 * For example if the credit limit is -100, our balance is +100, and we try to
 * withdraw 500 - we will only get 200.
 */
public class StandardAccount implements IAccount {
    /**
     * This constructor gets as an argument the account number represented as
     * an integer and the account credit limit as a double.
     * Note: the credit limit must be negative and represents the overdraft
     * that is allowed in this account, if a positive credit limit is sent
     * it will be treated as zero.
     * @param accountNumber the account number
     * @param creditLimit the non-positive credit limit
     */
    public StandardAccount(int accountNumber, double creditLimit) {
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
