/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 61010707
 */
public class Account {

    private String name;
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> transactions;

    // Constructors
    /**
     * Creates a default account
     */
    Account() {
        name = "";
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
        transactions = new ArrayList<Transaction>();
    }

    /**
     * Creates an account with the specified id and initial balance
     */
    Account(int id, double balance) {
        name = "";
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        transactions = new ArrayList<Transaction>();
    }

    /**
     * Creates an account with the specified name,id and initial balance
     */
    Account(String name, int id, double balance) {
        this(id, balance);
        this.name = name;
    }

    // Mutator methods
    /**
     * Set new name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Return name
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * @param id   * Set id
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
        transactions.add(new Transaction('W', amount, balance,
                "Withdrawal from account"));
    }

    /**
     * Increase balance by amount
     * @param amount
     */
    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance,
                "Deposit to account"));
    }

    /**
     * Return transactions
     * @return 
     */
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}
