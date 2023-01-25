/**
 * Basic accounts cannot have a credit limit and it is always set to zero.
 * Basic accounts also have a single withdrawal limit so we should not
 * provide withdrawals more than that amount.
 * For example if the withdrawal limit is 100 and we try to withdraw 500, we will
 * get only 100. The credit limit rules also applies to this account.
 */
public class BasicAccount implements IAccount {
    int accountNumber;
    double accountBalance;
    double withdrawalLimit;

    /**
     * This constructor gets as an argument the account number represented
     * as an integer and the withdrawal limit as a positive double.
     * @param accountNumber the account number
     * @param withdrawalLimit the withdrawal limit
     */
    public BasicAccount(int accountNumber, double withdrawalLimit) {
        this.accountNumber = accountNumber;
        this.withdrawalLimit = withdrawalLimit;
        accountBalance = 0;
    }

    public void Deposit(double amount) {
        accountBalance += amount;
    }

    public double Withdraw(double amount) {
        double actualAmount = amount;
        // If amount exceeds withdrawal limit, only withdraw up to limit
        if(actualAmount > withdrawalLimit) {
            actualAmount = withdrawalLimit;
        }

        double resultingBalance = accountBalance - actualAmount;
        double withdrawnAmount = actualAmount;

        // If withdrawn amount exceeds balance, only withdraw max amount
        if(resultingBalance < 0) {
            resultingBalance = 0;
            withdrawnAmount = accountBalance;
        }

        accountBalance = resultingBalance;
        return withdrawnAmount;
    }

    public double GetCurrentBalance() {
        return accountBalance;
    }

    public int GetAccountNumber() {
        return accountNumber;
    }
}
