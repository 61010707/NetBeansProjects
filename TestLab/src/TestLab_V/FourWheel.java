/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestLab_V;

import java.util.ArrayList;

/**
 *
 * @author DrZin
 */
public class FourWheel extends Vechicle {

    private int cc;
    private int year;
    private ArrayList<Transaction> transactions;
    private double tax = 10.0;

    public FourWheel(int cc, int year, String name, String color, int id) {
        super(name, color, id);
        this.cc = cc;
        this.year = year;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "FourWheel{" + "cc=" + cc + ", year=" + year + ", transactions=" + transactions + '}';
    }

    @Override
    public double calculateTax() {
            return tax;
    }

    @Override
    public void payTax() {
        transactions.add(new Transaction("4wheel", getName(), getTax()));
    }

    @Override
    public double getTax() {
       return this.tax;
    }
    
    
    
    

}
