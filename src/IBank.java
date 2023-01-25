import java.util.List;

public interface IBank {
    /**
     * Gets an account object and adds it to the bank accounts list.
     * @param account the account to add
     */
    void OpenAccount(IAccount account);

    /**
     * Gets account number as an integer and looks it up in the bank
     * account list. Nothing happens if not found. Otherwise, checks
     * if the balance is positive and removes from the bank account list.
     * If the balance is negative a debt error message is printed and the
     * account is not closed.
     * @param accountNumber the number of the account to close
     */
    void CloseAccount(int accountNumber);

    /**
     * Gets all the accounts in the bank as a list
     * @return list of accounts in bank
     */
    List<IAccount> GetAllAccounts();

    /**
     * Gets all accounts with a negative balance
     * @return list of accounts with debt
     */
    List<IAccount> GetAllAccountsInDebt();

    /**
     * Gets all accounts with a balance larger than the given double
     * @param balanceAbove balance to check against
     * @return list of matching accounts
     */
    List<IAccount> GetAllAccountsWithBalance(double balanceAbove);
}
