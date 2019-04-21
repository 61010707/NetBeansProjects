/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/** *******************************************************************************
 * (Shuffle ArrayList) Write the following method that shuffles an ArrayList of   *
 * numbers:                                                                       *
 *                                                                                *
 * public static void shuffle(ArrayList<Number> list) *
********************************************************************************
 */
package Ex02;

import java.util.ArrayList;

/**
 *
 * @author DrZin
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(2.5);
        list.add(5.5);
        list.add(5.3);
        list.add(5.6);
        shuffle(list);

        System.out.println("list : " + list.toString());
    }

    public static void shuffle(ArrayList<Number> list) {
        java.util.Collections.shuffle(list);
    }
}
