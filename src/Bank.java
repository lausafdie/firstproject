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
        for(int i = 0; i < accountList.size(); i++) {
            IAccount account = accountList.get(i);
            if (account.GetAccountNumber() == accountNumber) {
                if (account.GetCurrentBalance() < 0) {
                    System.out.println("The account cannot be closed due to debt.");
                }
                else {
                    accountList.remove(i);
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
        for(IAccount account : accountList) {
            if(account.GetCurrentBalance() < 0) {
                accountsInDebt.add(account);
            }
        }
        return accountsInDebt;
    }

    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {
        List<IAccount> accountsWithBalance = new ArrayList<>();
        for(IAccount account : accountList) {
            if(account.GetCurrentBalance() > balanceAbove) {
                accountsWithBalance.add(account);
            }
        }
        return accountsWithBalance;
    }
}
