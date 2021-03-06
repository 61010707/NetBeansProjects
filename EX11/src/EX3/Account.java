/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/** ******************************************************
 *                     Account                           *
 *-------------------------------------------------------*
 * -id: int                                              *
 * -balance: double                                      *
 * -annualInterestRate: double                           *
 * ---------------------------                           *
 * -dateCreated: String                                  *
 * +Account()                                            *
 * +Account(newid: int, newBalance: double)              *
 * +setId(newId: int)                                    *
 * +setBalance(newBalance: double)                       *
 * +setAnnualInterestRate(newAnnualInterestRate: double) *
 * +getId(): int                                         *
 * +getBalance(): double                                 *
 * +getAnnualInterestRate(): double                      *
 * +getDateCreated(): String                             *
 * +getMonthlyInterestRate(): double                     *
 * +getMonthlyInterest(): double                         *
 * +withdraw(amount: double)                             *
 * +deposit(amount: double)                              *
 ******************************************************* */


package EX3;

import java.util.Date;

/**
 *
 * @author DrZin
 */
public class Account {
// Data fields

    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    // Constructors
    /**
     * Creates a default account
     */
    Account() {
        this(0, 0);
    }

    /**
     * Creates an account with the specified id and initial balance
     */
    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    // Mutator methods
    /**
     * Set id
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Set balance
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Set annualInterestRate
     * @param annualInterestRate
     */
    public void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    // Accessor methods
    /**
     * Return id
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     * Return balance
     * @return 
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Return annualInterestRate
     * @return 
     */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * Return dateCreated
     * @return 
     */
    public String getDateCreated() {
        return dateCreated.toString();
    }

    /**
     * Return monthly interest rate
     * @return 
     */
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    // Methods
    /**
     * Return monthly interest
     * @return 
     */
    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    /**
     * Decrease balance by amount
     * @param amount
     */
    public void withdraw(double amount) {
        balance -= amount;
    }

    /**
     * Increase balance by amount
     * @param amount
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Return a String decription of Account class
     * @return 
     */
    @Override
    public String toString() {
        return "\nAccount ID: " + id + "\nDate created: " + getDateCreated()
                + "\nBalance: $" + String.format("%.2f", balance)
                + "\nMonthly interest: $" + String.format("%.2f", getMonthlyInterest());
    }
}
