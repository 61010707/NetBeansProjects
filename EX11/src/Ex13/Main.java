/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/** *******************************************************************************
 * (Remove duplicates) Write a method that removes the duplicate elements from    *
 * an array list of integers using the following header:                          *
 *                                                                                *
 * public static void removeDuplicate(ArrayList<Integer> list) * * Write a test
 * program that prompts the user to enter 10 integers to a list and * displays
 * the distinct integers separated by exactly one space. *
 * *******************************************************************************
 */
package Ex13;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DrZin
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 0; i < 10; i++) {
            list.add(num);
            num = input.nextInt();
        }
        removeDuplicate(list);
        
        System.out.println("list : " + list.toString());
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                }
            }
        }
    }
}
