/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import java.util.ArrayList;

/**
 *
 * @author DrZin
 */
public class Account extends Bank implements Comparable<Account> {

    private int id;
    private double balance;
    private String name;
    private ArrayList<Transaction> transactions;

    public Account(int id, double balance, String name) {
        this.id = id;
        this.balance = balance;
        this.name = name;
        this.transactions = new ArrayList<Transaction>();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void withdraw(double amount) {
        balance -= amount;
        transactions.add(new Transaction('w', amount, balance, "withdraw"));
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance, "deposit"));
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", balance=" + balance + ", name=" + name + ", transactions=" + transactions + '}';
    }

    public ArrayList<Transaction> getTransaction() {
        return transactions;
    }

    @Override
    public int compareTo(Account o) {
        return this.getBalance() > o.getBalance() ? 1 : this.getBalance() < o.getBalance() ? -1 : 0;
        

    }

    public boolean equals(Account o) {
        return this.compareTo(o) == 0;
    }

    @Override
    public void moveBank() {
        setBank("new Bank");
    }

}
