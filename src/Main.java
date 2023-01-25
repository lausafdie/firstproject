public class Main {
    public static void main(String[] args) {
        // Testing standard account with positive credit limit
        IAccount standard1 = new StandardAccount(1, 500);
        // Testing standard account with proper non-positive credit limit
        IAccount standard2 = new StandardAccount(2, -500);
        // Testing basic account
        IAccount basic1 = new BasicAccount(3, 100);
        // Testing premium account
        IAccount premium1 = new PremiumAccount(4);

        // Add all accounts to bank
        IBank bank = new Bank();
        bank.OpenAccount(standard1);
        bank.OpenAccount(standard2);
        bank.OpenAccount(basic1);
        bank.OpenAccount(premium1);

        // Testing standard account with positive credit limit
        System.out.println(standard1);
        System.out.printf("Attempting to withdraw 500: withdrew %.2f%n", standard1.Withdraw(500));
        System.out.println(standard1);
        System.out.println("Depositing 200");
        standard1.Deposit(200);
        System.out.println(standard1);
        System.out.printf("Attempting to withdraw 500: withdrew %.2f%n", standard1.Withdraw(500));
        System.out.println(standard1);

        System.out.println("\n----------------------------------------------------------\n");

        // Testing standard account with proper non-positive credit limit
        System.out.println(standard2);
        System.out.printf("Attempting to withdraw 500: withdrew %.2f%n", standard2.Withdraw(500));
        System.out.println(standard2);
        System.out.println("Depositing 200");
        standard2.Deposit(200);
        System.out.println(standard2);
        System.out.printf("Attempting to withdraw 500: withdrew %.2f%n", standard2.Withdraw(500));
        System.out.println(standard2);

        System.out.println("\n----------------------------------------------------------\n");

        // Testing basic account
        System.out.println(basic1);
        System.out.printf("Attempting to withdraw 500: withdrew %.2f%n", basic1.Withdraw(500));
        System.out.println(basic1);
        System.out.println("Depositing 200");
        basic1.Deposit(200);
        System.out.println(basic1);
        System.out.printf("Attempting to withdraw 500: withdrew %.2f%n", basic1.Withdraw(500));
        System.out.println(basic1);

        System.out.println("\n----------------------------------------------------------\n");

        // Testing premium account
        System.out.println(premium1);
        System.out.printf("Attempting to withdraw 500: withdrew %.2f%n", premium1.Withdraw(500));
        System.out.println(premium1);
        System.out.println("Depositing 200");
        premium1.Deposit(200);
        System.out.println(premium1);
        System.out.printf("Attempting to withdraw 500: withdrew %.2f%n", premium1.Withdraw(500));
        System.out.println(premium1);

        System.out.println("\n----------------------------------------------------------\n");

        // Testing bank
        System.out.println("All accounts\n----------------------------------------------------------");
        for(IAccount account : bank.GetAllAccounts()) {
            System.out.println(account);
        }
        System.out.println("\nAll accounts with debt\n----------------------------------------------------------");
        for(IAccount account : bank.GetAllAccountsInDebt()) {
            System.out.println(account);
        }
        System.out.println("\nAll accounts with balance above -600\n----------------------------------------------------------");
        for(IAccount account : bank.GetAllAccountsWithBalance(-600)) {
            System.out.println(account);
        }
        System.out.println("\n----------------------------------------------------------\n");
        System.out.println("Attempting to close premium account");
        bank.CloseAccount(4);
        System.out.println("Attempting to close basic account");
        bank.CloseAccount(3);
        System.out.println("Remaining accounts\n----------------------------------------------------------");
        for(IAccount account : bank.GetAllAccounts()) {
            System.out.println(account);
        }
    }
}