import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank {
    List<IAccount> accountList;

    public Bank() {
        accountList = new ArrayList<>();
    }

    public void OpenAccount(IAccount account) {
        accountList.add(account);
    }

    public void CloseAccount(int accountNumber) {
        // Loop through each account
        for(int i = 0; i < accountList.size(); i++) {
            IAccount account = accountList.get(i);
            // If account matches
            if (account.GetAccountNumber() == accountNumber) {
                // If account balance is negative, print error
                if (account.GetCurrentBalance() < 0) {
                    System.out.println("The account cannot be closed due to debt.");
                }
                // Good to remove
                else {
                    accountList.remove(i);
                    // Break to prevent going out of range after removal
                    break;
                }
            }
        }
    }

    public List<IAccount> GetAllAccounts() {
        return accountList;
    }

    public List<IAccount> GetAllAccountsInDebt() {
        List<IAccount> accountsInDebt = new ArrayList<>();
        // Loop through each account
        for(IAccount account : accountList) {
            // If balance is negative, add to list
            if(account.GetCurrentBalance() < 0) {
                accountsInDebt.add(account);
            }
        }
        return accountsInDebt;
    }

    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {
        List<IAccount> accountsWithBalance = new ArrayList<>();
        // Loop through each account
        for(IAccount account : accountList) {
            // If balance exceeds given amount, add to list
            if(account.GetCurrentBalance() > balanceAbove) {
                accountsWithBalance.add(account);
            }
        }
        return accountsWithBalance;
    }
}
