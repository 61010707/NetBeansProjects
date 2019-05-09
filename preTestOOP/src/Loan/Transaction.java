/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loan;

import java.io.Serializable;

/**
 *
 * @author DrZin
 */
public class Transaction implements Serializable {

    private double interestRate;
    private double monthlyPay;
    private double TotalPay;

    public Transaction(double interestRate, double monthlyPay, double TotalPay) {
        this.interestRate = interestRate;
        this.monthlyPay = monthlyPay;
        this.TotalPay = TotalPay;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getMonthlyPay() {
        return monthlyPay;
    }

    public void setMomthlyPay(double monthlyPay) {
        this.monthlyPay = monthlyPay;
    }

    public double getTotalPay() {
        return TotalPay;
    }

    public void setTotalPay(double TotalPay) {
        this.TotalPay = TotalPay;
    }

    @Override
    public String toString() {
        return "Interest Rate : " + String.format("%6.2f", this.interestRate) + '%' + " MonthyPayment :    " + String.format("%-10.2f", this.monthlyPay)
                + " TotalPayment :    " + String.format("%-10.2f", this.TotalPay) ;
    }

}
