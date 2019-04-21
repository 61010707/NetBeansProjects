/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/** *******************************************************************************
 * (Sort ArrayList) Write the following method that sorts an ArrayList of numbers.*
 *                                                                                *
 * public static void sort(ArrayList<Number> list) *
 * *******************************************************************************
 */
package Ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DrZin
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        list.add(1.1);
        list.add(5);
        list.add(6.1);
        list.add(5);

        sort(list);

        System.out.println("list : " + list.toString());
    }

    public static void sort(ArrayList<Number> list) {
        double[] arr = new double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i).doubleValue();
        }
        Arrays.sort(arr);

        list.clear();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);

        }
    }
}
