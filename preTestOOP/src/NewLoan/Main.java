/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewLoan;

import Loan.Loan;
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
public class Main {
    
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        ArrayList<Loan> loans = new ArrayList<>();
        File file = new File("LoanList.txt");
        System.out.print("Enter loan Amount as an Double  : ");
        double loanAmount = input.nextDouble();
        
        System.out.print("Enter number of years as an integer : ");
        int numberOfYears = input.nextInt();
        
        for (double annualInterestRate = 5; annualInterestRate <= 10; annualInterestRate += 1.0 / 4) {
            
            loans.add(new Loan(annualInterestRate, numberOfYears, loanAmount));
        }
        
        print(loans);
        saveFile(file, loans);
        System.out.println("============================= Read File ===========================");
        print(openFile(file, loans));
    }
    
    public static void saveFile(File file, Object object) throws FileNotFoundException, IOException {
        try (FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            
            oos.writeObject(object);
        }
    }
    
    public static ArrayList<Loan> openFile(File file, Object object) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Loan> loans = (ArrayList<Loan>) ois.readObject();
        ois.close();
        fis.close();
        return loans;
    }
    
    public static void print(ArrayList<Loan> loans) {
        for (int i = 0; i < loans.size(); i++) {
            System.out.println(loans.get(i).toString());
        }
    }
    
}
