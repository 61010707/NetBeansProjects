import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 61010707
 */
public class Main {

    void printArr(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println("");

        }
    }

    public static void main(String[] args) {
        int rows = 0;
        int colums = 0;
        Main ob = new Main();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and colums in the Array : ");
        rows = input.nextInt();
        colums = input.nextInt();
        double[][] arr = new double[rows][colums];
        System.out.println("Enter the Arrays : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = input.nextDouble();
            }
        }

        Location location = CaseUnits.findHighestValue(arr);
        System.out.println("The Locations of the largest element is " + location.getMaxValue() + " at "
                + "(" + location.getRows() + ", " + location.getColums() + ")");
    }

}

