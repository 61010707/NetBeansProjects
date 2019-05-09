/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loan;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DrZin
 */
public class Main_New {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        double annualInterestRate = 5.0;

        Scanner input = new Scanner(System.in);
        ArrayList<Transaction> loanList = new ArrayList<>();
        Loan loan;
        //Enter loanAmount 
        System.out.print("Enter loan amount as an double : ");
        double loanAmount = input.nextDouble();

        //Enter number of Years
        System.out.print("Enter number of year as an integer : ");
        int numberOfYears = input.nextInt();

        for (annualInterestRate = annualInterestRate; annualInterestRate <= 10; annualInterestRate += 1.0 / 4) {
            loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
            loanList.add(new Transaction(annualInterestRate, loan.getMonthlyPayment(), loan.getTotalPayment()));
        }

        for (int i = 0; i < loanList.size(); i++) {
            System.out.println(loanList.get(i).toString());
        }

        System.out.println("================================================================================================");
        //Save file 
        File file = new File("loanOutput.txt");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(loanList);
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        ArrayList<Transaction> readList = (ArrayList<Transaction>) ois.readObject();
        for (int i = 0; i < readList.size(); i++) {
            System.out.println(readList.get(i).toString());
        }
        ois.close();
        fis.close();
    }
}
