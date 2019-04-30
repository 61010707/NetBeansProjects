/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestLab_V;

import java.util.Date;

/**
 *
 * @author DrZin
 */
public class Transaction {

    private String type;
    private String name;
    private double tax;
    private Date date;

    public Transaction(String type, String name, double tax) {
        this.type = type;
        this.name = name;
        this.tax = tax;
        this.date = new Date();

    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public double getTax() {
        return tax;
    }

    public Date getDate() {
        return date;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
