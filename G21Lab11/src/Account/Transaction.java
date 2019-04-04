/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import java.util.Date;

/**
 *
 * @author 61010707
 */
public class Transaction {

    private java.util.Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction() {
    }

    public Transaction(char type, double amount, double balabnce, String description) {
        date = new java.util.Date();
        this.type = type;
        this.amount = amount;
        this.balance = balabnce;
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public char getType() {
        return type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setBalance(double balabnce) {
        this.balance = balabnce;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(char type) {
        this.type = type;
    }

}
