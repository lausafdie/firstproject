/**
 * In standard account we can deposit and withdraw money up to our credit limit,
 * we should not allow withdrawals that exceeds the credit limit and if we try
 * to withdraw more we should only provide the amount allowed.
 * For example if the credit limit is -100, our balance is +100, and we try to
 * withdraw 500 - we will only get 200.
 */
public class StandardAccount implements IAccount {
    int accountNumber;
    double accountBalance;
    double creditLimit;

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
        this.accountNumber = accountNumber;

        // Set credit limit to zero if positive value
        if(creditLimit > 0) {
            this.creditLimit = 0;
        }
        else {
            this.creditLimit = creditLimit;
        }

        accountBalance = 0;
    }

    public void Deposit(double amount) {
        accountBalance += amount;
    }

    public double Withdraw(double amount) {
        double resultingBalance = accountBalance - amount;
        double withdrawnAmount = amount;

        // If withdrawn amount exceeds credit limit, only withdraw max amount
        if(resultingBalance < creditLimit) {
            resultingBalance = creditLimit;
            withdrawnAmount = accountBalance - creditLimit;
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
