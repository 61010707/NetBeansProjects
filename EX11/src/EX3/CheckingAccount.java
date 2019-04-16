/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/** *************************************************************************
 *                              CheckingAccount                             *
 *--------------------------------------------------------------------------*
 * -overdraftLimit: double                                                  *
 * +CheckingAccount()                                                       *
 * +CheckingAccount(newId: int, newBalance: double, overdraftLimit: double) *
 * +setOverdraftLimit(overdraftLimit: double): void                         *
 * +getOverdraftLimit(): double                                             *
 * +withdraw(amount: double): boolean                                       *
 * +toString(): String                                                      *
 *************************************************************************** */
package EX3;

/**
 *
 * @author DrZin
 */
public class CheckingAccount extends Account {

    private double overdraftLimit;

    public CheckingAccount() {
        super();
        this.overdraftLimit = 0;
    }

    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (super.getBalance() - amount > this.overdraftLimit) {
            super.setBalance(getBalance() - amount);
        } else {
            System.out.println("Error exceed overdraft limit");
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nOverdraftLimits : $" + this.overdraftLimit; //To change body of generated methods, choose Tools | Templates.
    }

}
