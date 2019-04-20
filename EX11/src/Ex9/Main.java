package Ex9;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DrZin
 */
/**
 * *******************************************************************************
 * (Largest rows and columns) Write a program that randomly fills in 0s and 1s *
 * into an n-by-n matrix, prints the matrix, and finds the rows and columns with
 * * the most 1s. (Hint: Use two ArrayLists to store the row and column indices
 * * with the most 1s.) Here is a sample run of the program: *
 * *******************************************************************************
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array dimension n by n : ");
        int n = input.nextInt();

        int[][] array = new int[n][n];

        fill(array);
        print(array);
        System.out.println("The largest collum index : " + LargestCollum(array));
        System.out.println("The largest row index : " + LargestRow(array));
       
    }

    public static void fill(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 2);
            }
        }
    }

    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int LargestCollum(int[][] array) {
        int index = 0;
        int count = 0;
        int max = 0;
        int[] CheckArr = new int[array.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 1) {
                    count++;
                }
            }

            CheckArr[i] = count;
            count = 0;
        }
        for (int k = 0; k < CheckArr.length; k++) {
            if (CheckArr[k] > max) {
                max = CheckArr[k];
                index = k;

            }

        }
        return index;
    }

    public static int LargestRow(int[][] array) {
        int count = 0;
        int j = 0;
        int max = 0, index = 0;
        int[] CheckArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                if (array[j][i] == 1) {
                    count++;
                }
            }
            CheckArr[i] = count;
            count = 0;
        }
        for (int k = 0; k < CheckArr.length; k++) {
            if (CheckArr[k] > max) {
                max = CheckArr[k];
                index = k;

            }

        }
        return index;
    }
}
