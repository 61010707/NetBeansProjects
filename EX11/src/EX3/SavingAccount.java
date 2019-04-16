/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX3;

/**
 *
 * @author DrZin
 */
public class SavingAccount extends Account {

    public SavingAccount() {
        super();
    }

    public SavingAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount < super.getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Error saving account");
        }
    }

}
