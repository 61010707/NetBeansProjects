/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/** *******************************************************************************
 * (Sort ArrayList) Write the following method that sorts an ArrayList of numbers:*
 *                                                                                *
 * public static void sort(ArrayList<Integer> list) * * Write a test program
 * that prompts the user to enter 5 numbers, stores them in * an array list, and
 * displays them in increasing order. *
 * *******************************************************************************
 */
package Ex11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DrZin
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Hello world");
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int number = input.nextInt();
        while (number != 0) {
            list.add(number);
            number = input.nextInt();
        }
        
        sort(list);
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            
        }
        
    }
    
    public static void sort(ArrayList<Integer> list) {
        java.util.Collections.sort(list);
    }
}
