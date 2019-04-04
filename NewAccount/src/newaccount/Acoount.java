/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newaccount;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 61010707
 */
public class Acoount {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dataCreated;
    private ArrayList<Transaction> transactions;
    private String name;

    public Acoount() {
        this(0, 0);
        this.name = "";
        this.annualInterestRate = 0;
        dataCreated = new Date();
        this.transactions = new ArrayList<Transaction>();
    }

    public Acoount(int id, double balance) {
        this.name = "";
        this.id = id;
        this.annualInterestRate = 0;
        this.balance = balance;
        this.dataCreated = new Date();
        this.transactions = new ArrayList<Transaction>();
    }

    public Acoount(String name, int id, double balance) {
        this(id, balance);
        this.name = name;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDataCreated() {
        return dataCreated;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDataCreated(Date dataCreated) {
        this.dataCreated = dataCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Acoount(int id, double balance, double annualInterestRate, Date dataCreated) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dataCreated = dataCreated;
    }

    public double getMonthlyInterestRate() {
        double MonthlyInterestRate;
        MonthlyInterestRate = (this.annualInterestRate / 100) / 12;
        return MonthlyInterestRate;

    }

    public double getMonthlyInterest() {
        double monthlyInterest;
        monthlyInterest = this.getAnnualInterestRate() * this.balance;
        return monthlyInterest;

    }

    public void withDraw(double amount) {
        this.balance -= amount;
        transactions.add(new Transaction('w', amount, balance, "withdraw"));

    }

    public void deposit(double amount) {
        this.balance += amount;
        transactions.add(new Transaction('D', amount, balance, "deposit"));
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
    
}
