/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DrZin
 */
/**
 * *******************************************************************************
 * (Shuffle ArrayList) Write the following method that shuffles the elements in
 * * an ArrayList of integers. * public static void shuffle(ArrayList<Integer>
 * list) *
 * *******************************************************************************
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter number in arraylist :");
        Integer number = input.nextInt();
        
        while (number != 0) {
            list.add(number);
            number = input.nextInt();
        }
        shuffle(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
    }
    
    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
        
    }
}
