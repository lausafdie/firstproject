public interface IAccount {
    /**
     * Adds the amount provided as a double to the account balance
     * @param amount the amount to add
     */
    void Deposit(double amount);

    /**
     * Withdraw the requested amount from the account according to the
     * account restrictions
     * @param amount the amount to withdraw
     * @return the actual amount that has been withdrawn
     */
    double Withdraw(double amount);

    /**
     * Gets the current account's balance
     * @return the current account balance as a double
     */
    double GetCurrentBalance();

    /**
     * Gets the current account's number
     * @return the account number as an integer
     */
    int GetAccountNumber();
}
