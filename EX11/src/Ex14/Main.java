/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/** *******************************************************************************
 * (Combine two lists) Write a method that returns the union of two array lists   *
 * of integers using the following header:                                        *
 *                                                                                *
 * public static ArrayList<Integer> union( * ArrayList<Integer> list1,
 * ArrayList<Integer> list2) * * For example, the union of two array lists {2,
 * 3, 1, 5} and {3, 4, 6} is * {2, 3, 1, 5, 3, 4, 6}. Write a test program that
 * prompts the user to enter two * lists, each with five integers, and displays
 * their union. The numbers are * separated by exactly one space in the output.
 * *
 * *******************************************************************************
 */
package Ex14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DrZin
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.print("input list 1 : ");
        fill(list1);
        System.out.print("input list 2 : ");
        fill(list2);

        Union(list1, list2);
        System.out.println("list unioned : " + list1.toString());
    }

    public static void fill(ArrayList<Integer> list) {
        Scanner inScanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(inScanner.nextInt());
        }
    }

    public static ArrayList<Integer> Union(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        for (int i = 0; i < list2.size(); i++) {
            list1.add(list2.get(i));
        }

        return list1;
    }
}
