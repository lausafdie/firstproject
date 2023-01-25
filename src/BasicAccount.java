/**
 * Basic accounts cannot have a credit limit and it is always set to zero.
 * Basic accounts also have a single withdrawal limit so we should not
 * provide withdrawals more than that amount.
 * For example if the withdrawal limit is 100 and we try to withdraw 500, we will
 * get only 100. The credit limit rules also applies to this account.
 */
public class BasicAccount implements IAccount {
    /**
     * This constructor gets as an argument the account number represented
     * as an integer and the withdrawal limit as a positive double.
     * @param accountNumber the account number
     * @param withdrawalLimit the withdrawal limit
     */
    public BasicAccount(int accountNumber, double withdrawalLimit) {
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
