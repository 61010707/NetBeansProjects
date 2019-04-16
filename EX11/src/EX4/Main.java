/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/** *******************************************************************************
 * (Maximum element in ArrayList) Write the following method that returns the     *
 * maximum value in an ArrayList of integers. The method returns null if the      *
 * list is null or the list size is 0.                                            *
 *                                                                                *
 * public static Integer max(ArrayList<Integer> list) * * Write a test program
 * that prompts the user to enter a sequence of numbers * ending with 0, and
 * invokes this method to return the largest number in the * input. *
 * *******************************************************************************
 */
package EX4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DrZin
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        System.out.println("Enter number not equal to zero : ");
        Integer number = input.nextInt();
        while (number != 0) {
            list.add(number);
            number = input.nextInt();
        }
        
        System.out.println("The largest number is " + max(list));
        
    }
    
    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return null;
        }
        
        Integer max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }
}
