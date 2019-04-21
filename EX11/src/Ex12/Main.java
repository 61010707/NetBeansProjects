/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/** *******************************************************************************
 * (Sum ArrayList) Write the following method that returns the sum of all numbers *
 * in an ArrayList:                                                               *
 *                                                                                *
 * public static double sum(ArrayList<Double> list) * * Write a test program
 * that prompts the user to enter 5 numbers, stores them in * an array list, and
 * displays their sum. *
 * *******************************************************************************
 */
package Ex12;

import java.awt.font.TextAttribute;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DrZin
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

        ArrayList<Double> list = new ArrayList<>();
        Scanner inpuScanner = new Scanner(System.in);
        System.out.println("Input number (!= 0 ) : ");
        double number = inpuScanner.nextDouble();

        while (number != 0) {

            list.add(number);
            number = inpuScanner.nextInt();

        }
        System.out.println("Sum of this list : " + sum(list));

    }

    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        return sum;
    }

}
