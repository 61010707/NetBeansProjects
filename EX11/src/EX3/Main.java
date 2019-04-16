/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/** *******************************************************************************
 * (Subclasses of Account) In Programming Exercise 9.7, the Account class was     *
 * defined to model a bank account. An account has the properties account number, *
 * balance, annual interest rate, and date created, and methods to deposit and    *
 * withdraw funds. Create two subclasses for checking and saving accounts. A      *
 * checking account has an overdraft limit, but a savings account cannot be       *
 * overdrawn.                                                                     *
 *                                                                                *
 * Draw the UML diagram for the classes and then implement them. Write            *
 * a test program that creates objects of Account, SavingsAccount, and            *
 * CheckingAccount and invokes their toString() methods.                          *
 ******************************************************************************** */
package EX3;

/**
 *
 * @author DrZin
 */
public class Main {

    public static void main(String[] args) {
        Account account = new Account(284, 25868.6);
        CheckingAccount checkingAccount = new CheckingAccount(285, 2568.52, 25);
        SavingAccount savingAccount = new SavingAccount(286, 28564);

        /*set annual interest */
        account.setAnnualInterestRate(4.5);
        checkingAccount.setAnnualInterestRate(4.5);
        savingAccount.setAnnualInterestRate(4.5);

        /* withDrawn */
        account.withdraw(250);
        checkingAccount.withdraw(258);
        savingAccount.withdraw(455);

        /* deposit */
        account.deposit(2568);
        checkingAccount.deposit(255);
        savingAccount.deposit(4554);

        /* toString */
        System.out.println(account.toString());
        System.out.println(checkingAccount.toString());
        System.out.println(savingAccount.toString());
    }

}
