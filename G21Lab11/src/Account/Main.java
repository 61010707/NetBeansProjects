/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

/**
 *
 * @author 61010707
 */
public class Main {
     public static void main(String[] args) {
        Account account = new Account("George", 1213, 1000);

        account.setAnnualInterestRate(1.5);

        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.println("       Account Summary");
        System.out.println("------------------------------------");
        System.out.println("Account holder name: " + account.getName());
        System.out.println("Interest rate: " + account.getAnnualInterestRate());
        System.out.printf("Balance: $%.2f\n", account.getBalance());
        System.out.println("\n     List of transactions");
        System.out.println("------------------------------------");
        for (int i = 0; i < account.getTransactions().size(); i++) {
            System.out.println("Date: "
                    + (account.getTransactions()).get(i).getDate());
            System.out.println("Type: "
                    + (account.getTransactions()).get(i).getType());
            System.out.println("Amount: "
                    + (account.getTransactions()).get(i).getAmount());
            System.out.println("Balance: "
                    + (account.getTransactions()).get(i).getBalance());
            System.out.println("Description: "
                    + (account.getTransactions()).get(i).getDescription());
            System.out.println();
        }
    }
}
